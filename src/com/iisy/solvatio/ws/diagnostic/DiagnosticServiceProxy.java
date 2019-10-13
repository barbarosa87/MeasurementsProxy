package com.iisy.solvatio.ws.diagnostic;

public class DiagnosticServiceProxy implements com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType {
  private String _endpoint = null;
  private com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType diagnosticService_PortType = null;
  
  public DiagnosticServiceProxy() {
    _initDiagnosticServiceProxy();
  }
  
  public DiagnosticServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDiagnosticServiceProxy();
  }
  
  private void _initDiagnosticServiceProxy() {
    try {
      diagnosticService_PortType = (new com.iisy.solvatio.ws.diagnostic.DiagnosticService_ServiceLocator()).getDiagnosticServicePort();
      if (diagnosticService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)diagnosticService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)diagnosticService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (diagnosticService_PortType != null)
      ((javax.xml.rpc.Stub)diagnosticService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType getDiagnosticService_PortType() {
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType;
  }
  
  public com.iisy.solvatio.ws.diagnostic.TopologySection[] getTopology(java.lang.String wsToken, java.lang.String topologyId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getTopology(wsToken, topologyId);
  }
  
  public com.iisy.solvatio.ws.diagnostic.SessionState resumeCase(java.lang.String caseId, com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.resumeCase(caseId, user, locale, startParameters, applicationId);
  }
  
  public void closeCase(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    diagnosticService_PortType.closeCase(wsToken, metaData);
  }
  
  public com.iisy.solvatio.ws.diagnostic.Form[] getForms(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getForms(wsToken, processId);
  }
  
  public com.iisy.solvatio.ws.diagnostic.Event[] getEvents(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getEvents(wsToken, processId);
  }
  
  public com.iisy.solvatio.ws.diagnostic.SessionState submitForms(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.ValidationFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.submitForms(wsToken, submissions);
  }
  
  public com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[] getProcessMenu(java.lang.String wsToken, java.lang.String menuFormId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getProcessMenu(wsToken, menuFormId);
  }
  
  public com.iisy.solvatio.ws.diagnostic.AppForm getAppForm(java.lang.String wsToken, java.lang.String formId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getAppForm(wsToken, formId);
  }
  
  public void closeSession(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    diagnosticService_PortType.closeSession(wsToken, metaData);
  }
  
  public com.iisy.solvatio.ws.diagnostic.ProcessState rollbackProcess(java.lang.String wsToken, int steps, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.rollbackProcess(wsToken, steps, processId);
  }
  
  public void submitFeedback(java.lang.String wsToken, java.lang.String feedback, java.lang.String processId, com.iisy.solvatio.ws.diagnostic.FeedbackComponent context) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    diagnosticService_PortType.submitFeedback(wsToken, feedback, processId, context);
  }
  
  public com.iisy.solvatio.ws.diagnostic.SessionState getSessionState(java.lang.String wsToken) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.getSessionState(wsToken);
  }
  
  public com.iisy.solvatio.ws.diagnostic.ProcessState startProcess(java.lang.String wsToken, java.lang.String processDefinitionId, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.startProcess(wsToken, processDefinitionId, startParameters);
  }
  
  public void setLocale(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.Locale locale) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    diagnosticService_PortType.setLocale(wsToken, locale);
  }
  
  public com.iisy.solvatio.ws.diagnostic.SessionState startCase(com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault{
    if (diagnosticService_PortType == null)
      _initDiagnosticServiceProxy();
    return diagnosticService_PortType.startCase(user, locale, startParameters, applicationId);
  }
  
  
}