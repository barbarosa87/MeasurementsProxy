package com.ote.measure.types;

import java.util.HashMap;

public class TopologyResponse {
	
	private String token;
	private String sessionID;
	private String error;
	private String errorMessage;
	private HashMap<String,String> ServicesMap;
	private HashMap<String,String> NetworkMap;
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
	public HashMap<String, String> getServicesMap() {
		return ServicesMap;
	}
	public void setServicesMap(HashMap<String, String> servicesMap) {
		ServicesMap = servicesMap;
	}
	public HashMap<String, String> getNetworkMap() {
		return NetworkMap;
	}
	public void setNetworkMap(HashMap<String, String> networkMap) {
		NetworkMap = networkMap;
	}
	
	
	
	
}
