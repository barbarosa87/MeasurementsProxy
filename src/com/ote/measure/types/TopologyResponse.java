package com.ote.measure.types;

import java.util.HashMap;

public class TopologyResponse {
	
	private String token;
	private String sessionID;
	private String error;
	private String errorMessage;
	private HashMap<String,TopologyItem> ServicesMap=new HashMap<String, TopologyItem>();
	private HashMap<String,TopologyItem> NetworkMap=new HashMap<String, TopologyItem>();
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
	public HashMap<String, TopologyItem> getServicesMap() {
		return ServicesMap;
	}
	public void setServicesMap(HashMap<String, TopologyItem> servicesMap) {
		ServicesMap = servicesMap;
	}
	public HashMap<String, TopologyItem> getNetworkMap() {
		return NetworkMap;
	}
	public void setNetworkMap(HashMap<String, TopologyItem> networkMap) {
		NetworkMap = networkMap;
	}
	
	
	
	
}
