package com.ote.measure.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import com.iisy.solvatio.ws.diagnostic.AbstractMenuItem;

public class GetAvailableFlowsResponse implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4766474282595179138L;
	private String token;
	private String sessionID;
	private String error;
	private String errorMessage;
	//private AbstractMenuItem[] abstractMenuItems;
	private HashMap<String,String> flowsList;
	
	
	
	
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public HashMap<String, String> getFlowsList() {
		return flowsList;
	}
	public void setFlowsList(HashMap<String, String> flowsList) {
		this.flowsList = flowsList;
	}
	
	
	
	
}
