/**
 * DiagnosticService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DiagnosticService_ServiceLocator extends org.apache.axis.client.Service implements com.iisy.solvatio.ws.diagnostic.DiagnosticService_Service {

    public DiagnosticService_ServiceLocator() {
    }


    public DiagnosticService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DiagnosticService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DiagnosticServicePort
    private java.lang.String DiagnosticServicePort_address = "http://10.101.103.124:8080/helpdesk/webservice/diag";

    public java.lang.String getDiagnosticServicePortAddress() {
        return DiagnosticServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DiagnosticServicePortWSDDServiceName = "DiagnosticServicePort";

    public java.lang.String getDiagnosticServicePortWSDDServiceName() {
        return DiagnosticServicePortWSDDServiceName;
    }

    public void setDiagnosticServicePortWSDDServiceName(java.lang.String name) {
        DiagnosticServicePortWSDDServiceName = name;
    }

    public com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType getDiagnosticServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DiagnosticServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDiagnosticServicePort(endpoint);
    }

    public com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType getDiagnosticServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iisy.solvatio.ws.diagnostic.DiagnosticServiceSoapBindingStub _stub = new com.iisy.solvatio.ws.diagnostic.DiagnosticServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDiagnosticServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDiagnosticServicePortEndpointAddress(java.lang.String address) {
        DiagnosticServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iisy.solvatio.ws.diagnostic.DiagnosticServiceSoapBindingStub _stub = new com.iisy.solvatio.ws.diagnostic.DiagnosticServiceSoapBindingStub(new java.net.URL(DiagnosticServicePort_address), this);
                _stub.setPortName(getDiagnosticServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DiagnosticServicePort".equals(inputPortName)) {
            return getDiagnosticServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DiagnosticServicePort".equals(portName)) {
            setDiagnosticServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
