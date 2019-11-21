package com.ote.measure;

import java.rmi.RemoteException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.iisy.solvatio.ws.diagnostic.AbstractMenuItem;
import com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;
import com.iisy.solvatio.ws.diagnostic.DiagnosticServiceProxy;
import com.iisy.solvatio.ws.diagnostic.Locale;
import com.iisy.solvatio.ws.diagnostic.ProcessCategory;
import com.iisy.solvatio.ws.diagnostic.ProcessItem;
import com.iisy.solvatio.ws.diagnostic.ProcessState;
import com.iisy.solvatio.ws.diagnostic.SessionState;
import com.iisy.solvatio.ws.diagnostic.StartParameter;
import com.iisy.solvatio.ws.diagnostic.TopologySection;
import com.iisy.solvatio.ws.diagnostic.UserData;
import com.ote.measure.types.FlowItem;
import com.ote.measure.types.GenericResponse;
import com.ote.measure.types.StartEntries;
import com.ote.measure.types.TopologyResponse;

public class Main {

	/*
	 * public HashMap startCaseShops(String CLI, String Symptom) {
	 * 
	 * return null; }
	 */

	private int timeout = 60;
	private int timeout_start = 0;
	private HashMap<String, String> serversMap = new HashMap<>();
	// String CLI, String Symptom, String User

	public GenericResponse start(HashMap<String, String> entriesMap) {
		String operation = entriesMap.get("operation");
		GenericResponse genericResponse = new GenericResponse();
		switch (operation) {
		case "checkMassive":
			genericResponse = checkMassive(entriesMap);
		default:
			genericResponse.setError("1");
			genericResponse.setErrorMessage("No Operation Specified");
		}
		return genericResponse;
	}

	public TopologyResponse getTopology(String CLI, String token, String sessionID) {
		TopologyResponse topologyResponse = new TopologyResponse();
		topologyResponse.setToken(token);
		topologyResponse.setSessionID(sessionID);
		if (token != null && sessionID != null) {
			topologyResponse = checkTokenTopology(token, sessionID);
		} else {

		}
		return topologyResponse;

	}

	private TopologyResponse checkTokenTopology(String token, String sessionID) {
		TopologyResponse topologyResponse = new TopologyResponse();

		DiagnosticServiceProxy diagnosticServiceProxy = startDiagnosticsService(sessionID);
		try {
			boolean flowOver = checkifFlowOver(diagnosticServiceProxy, token);
			if (flowOver) {
				TopologySection[] topologySecions = diagnosticServiceProxy.getTopology(token, "topology");
				for (int i = 0; i < topologySecions.length; i++) {
					if (topologySecions[i].getTitle().equalsIgnoreCase("services")) {
						for (int j = 0; j < topologySecions[i].getComponents().length; j++) {
							topologyResponse.getServicesMap().put(topologySecions[i].getComponents()[j].getId(),
									topologySecions[i].getComponents()[j].getState().getId());
						}

					} else if (topologySecions[i].getTitle().equalsIgnoreCase("network")) {
						for (int j = 0; j < topologySecions[i].getComponents().length; j++) {
							topologyResponse.getNetworkMap().put(topologySecions[i].getComponents()[j].getId(),
									topologySecions[i].getComponents()[j].getState().getId());
						}
					}
				}
			}else {
				topologyResponse.setError("02");
				topologyResponse.setErrorMessage("Timeout geting response");
			}
		} catch (Exception e) {
			e.printStackTrace();
			topologyResponse.setError("01");
			topologyResponse.setErrorMessage(e.getMessage());
		}

		return topologyResponse;
	}

//	public GenericResponse start(HashMap<String, String> entriesMap) {
//
//		// HashMap<String, String> result = new HashMap<>();
//
//		GenericResponse getAvailableFlowsResponse = new GenericResponse();
//
//		DiagnosticServiceProxy diagnosticServiceProxy = startDiagnosticsService();
//		UserData userData = createUser("User");
//		Locale locale = getLocale();
//
//		StartParameter[] startParameters = new StartParameter[3];
//
//		
//		
//		
//		//HashMap<String, String> entriesMap = getInputParameters(entries);
//		
//		startParameters[0] = new StartParameter("CLI", entriesMap.get("CLI"));
//		startParameters[1] = new StartParameter("Symptom", "");
//		startParameters[2] = new StartParameter("operation", "shops");
//		
//
//		SessionState sessionState;
//		try {
//			sessionState = diagnosticServiceProxy.startCase(userData, locale, startParameters, "WebService");
//			String token = sessionState.getToken();
//
//			getAvailableFlowsResponse.setSessionID(sessionState.getCaseId());
//			getAvailableFlowsResponse.setToken(sessionState.getToken());
//
//			boolean state = checkifFlowOver(diagnosticServiceProxy, token);
//			if (state) {
//
//				AbstractMenuItem[] abstractMenuItems = diagnosticServiceProxy.getProcessMenu(sessionState.getToken(),
//						"ShopForm.Shops");
//
//				ArrayList<FlowItem> flowsList = getAvailableFlows(abstractMenuItems);
//
//				HashMap<String, String> resultMap = new HashMap<>();
//				for (FlowItem flowItem : flowsList) {
//					resultMap.put(flowItem.getCaption(), flowItem.getDescription());
//				}
//
//				getAvailableFlowsResponse.setFlowsList(resultMap);
//
//			} else {
//				getAvailableFlowsResponse.setError("200");
//				getAvailableFlowsResponse.setErrorMessage("Process not terminated at timeout");
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			getAvailableFlowsResponse.setError("500");
//			getAvailableFlowsResponse.setErrorMessage("Could not connect to webService");
//
//		}
//		return getAvailableFlowsResponse;
//
//	}

	private GenericResponse checkMassive(HashMap<String, String> entriesMap) {
		// TODO Auto-generated method stub
		return null;
	}

	private HashMap<String, String> getInputParameters(StartEntries entries) {
		HashMap<String, String> entriesMap = new HashMap<>();
		for (int i = 0; i < entries.getListEntries().length; i++) {
			entriesMap.put(entries.getListEntries()[i].getKey(), entries.getListEntries()[i].getValue());
		}
		return entriesMap;

	}

	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	private ArrayList<FlowItem> getAvailableFlows(AbstractMenuItem[] abstractMenuItems) {
		ArrayList<FlowItem> flowsList = new ArrayList<>();

		/*
		 * for(int i=0;i<abstractMenuItems.length-1;i++) { AbstractMenuItem
		 * abstractMenuItem=abstractMenuItems[i]; if(abstractMenuItem instanceof
		 * ProcessCategory) {
		 * 
		 * 
		 * 
		 * }else { createNewFlowItem(abstractMenuItem.getCaption(),
		 * abstractMenuItem.getDescription(), abstractMenuItem.isEnabled(),
		 * abstractMenuItem.isVisible()); } }
		 * 
		 * return null;
		 */
		ArrayList<AbstractMenuItem> abstractMenuItemsList = new ArrayList<AbstractMenuItem>();

		abstractMenuItemsList.addAll(getMenuItem(abstractMenuItems));

		for (AbstractMenuItem abstractMenuItem : abstractMenuItemsList) {
			ProcessItem processItem = (ProcessItem) abstractMenuItem;
			FlowItem flowItem = new FlowItem(processItem.getCaption(), processItem.getProcessDefinitionId(), true,
					true);
			flowsList.add(flowItem);
		}

		return flowsList;

	}

	private ArrayList<AbstractMenuItem> getMenuItem(AbstractMenuItem[] abstractMenuItems) {
		ArrayList<AbstractMenuItem> abstractMenuItemsList = new ArrayList<>();
		if (abstractMenuItems != null) {
			for (int i = 0; i < abstractMenuItems.length; i++) {
				if (abstractMenuItems[i] instanceof ProcessCategory) {
					// if(((ProcessCategory) abstractMenuItems[i]).getItems()!=null) {
					abstractMenuItemsList.addAll(getMenuItem(((ProcessCategory) abstractMenuItems[i]).getItems()));
					// }

				} else {
					abstractMenuItemsList.add(abstractMenuItems[i]);

				}

			}
		}
		return abstractMenuItemsList;

	}

	private FlowItem createNewFlowItem(String caption, String description, boolean enabled, boolean visible) {
		FlowItem flowItem = new FlowItem();
		flowItem.setCaption(caption);
		flowItem.setDescription(description);
		flowItem.setEnabled(enabled);
		flowItem.setVisible(visible);
		return flowItem;
	}

	private boolean checkifFlowOver(DiagnosticServiceProxy diagnosticServiceProxy, String token)
			throws DiagnosticServiceFault, RemoteException, InterruptedException {
		SessionState sessionState = diagnosticServiceProxy.getSessionState(token);

		for (int i = 0; i < sessionState.getProcessStates().length; i++) {
			ProcessState processState = sessionState.getProcessStates(i);
			if (!processState.getState().getValue().equalsIgnoreCase("terminated")) {
				if (timeout_start < timeout) {
					Thread.sleep(5000);
					timeout_start = timeout_start + 5;
					return checkifFlowOver(diagnosticServiceProxy, token);
				} else {
					return false;
				}
			}else {
				return true;
			}
		}
		return false;

	}

	private Locale getLocale() {
		Locale locale = new Locale();
		locale.setLocaleCode("el_GR");
		return locale;
	}

	private UserData createUser(String User) {

		UserData userData = new UserData();
		userData.setDisplayName(User);
		userData.setEmail(User);
		userData.setName(User);
		return userData;
	}

	private DiagnosticServiceProxy startDiagnosticsService(String SessionID) {
		if (SessionID == null) {
			DiagnosticServiceProxy diagnosticServiceProxy = new DiagnosticServiceProxy(
					"http://localhost:8080/helpdesk/webservice/diag");
			return diagnosticServiceProxy;
		} else {
			setServers("UAT");
			String[] arrOfStr = SessionID.split("-", 2);
			DiagnosticServiceProxy diagnosticServiceProxy = new DiagnosticServiceProxy(
					"http://" + serversMap.get(arrOfStr[0]) + ":8080/helpdesk/webservice/diag");
			return diagnosticServiceProxy;

		}

	}

	private void setServers(String env) {
		if (env.equalsIgnoreCase("PROD")) {
			serversMap.put("prod1", "solvrs01");
			serversMap.put("prod2", "solvrs02");
			serversMap.put("prod3", "solvrs03");
			serversMap.put("prod4", "solvrs04");
			serversMap.put("prod5", "solvrs05");
			serversMap.put("prod6", "solvrs06");
			serversMap.put("prod7", "solvrs07");
		} else if (env.equalsIgnoreCase("UAT")) {
			serversMap.put("uat1", "solvatioupuat1");
			serversMap.put("uat2", "solvatioupuat2");
		}
	}

}
