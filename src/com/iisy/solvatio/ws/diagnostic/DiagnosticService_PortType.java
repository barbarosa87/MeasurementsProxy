/**
 * DiagnosticService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public interface DiagnosticService_PortType extends java.rmi.Remote {

    /**
     * Returns the topology for an existing session. The parameter
     * topologyId must not be null and refers to the SOLVATiO variable whichs
     * binds the topology model (usually the topologyId is "topology").
     */
    public com.iisy.solvatio.ws.diagnostic.TopologySection[] getTopology(java.lang.String wsToken, java.lang.String topologyId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Initiates a new web service session. If a SOLVATiO case with
     * the specified caseId exists, a new session will be created for the
     * existing case.
     */
    public com.iisy.solvatio.ws.diagnostic.SessionState resumeCase(java.lang.String caseId, com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Closes the web service session and the underlying SOLVATiO
     * case.
     */
    public void closeCase(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Returns a FormPage containing the pending dialog forms for
     * a process with the given process id. If no process id is given, all
     * pending forms are returned.
     */
    public com.iisy.solvatio.ws.diagnostic.Form[] getForms(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Returns the (signal) events triggered by the process with the
     * given process id.
     */
    public com.iisy.solvatio.ws.diagnostic.Event[] getEvents(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Submits the answers to one or more dialog forms. For each input
     * element in each submitted form a input value may be provided.
     */
    public com.iisy.solvatio.ws.diagnostic.SessionState submitForms(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.ValidationFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Returns the process menu form specified by menuFormId
     */
    public com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[] getProcessMenu(java.lang.String wsToken, java.lang.String menuFormId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Returns the application form specified by formId.
     */
    public com.iisy.solvatio.ws.diagnostic.AppForm getAppForm(java.lang.String wsToken, java.lang.String formId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Closes the web service session. The underlying SOLVATiO case
     * will not be closed.
     */
    public void closeSession(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Performs a rollback of a process for a given number of steps.
     */
    public com.iisy.solvatio.ws.diagnostic.ProcessState rollbackProcess(java.lang.String wsToken, int steps, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Submits a feedback in the context of the given process
     */
    public void submitFeedback(java.lang.String wsToken, java.lang.String feedback, java.lang.String processId, com.iisy.solvatio.ws.diagnostic.FeedbackComponent context) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Returns state information for the specified session. Session
     * state provides details on the state of running process instances.
     * To monitor the progress of long running operations you may poll the
     * session state
     */
    public com.iisy.solvatio.ws.diagnostic.SessionState getSessionState(java.lang.String wsToken) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Starts a new process instance in the context of the web service
     * session. The startParameters will be passed as input parameters to
     * the new process instance.
     */
    public com.iisy.solvatio.ws.diagnostic.ProcessState startProcess(java.lang.String wsToken, java.lang.String processDefinitionId, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Changes the locale for the given web service session. The locale
     * will be used for form rendering
     */
    public void setLocale(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.Locale locale) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;

    /**
     * Initiates a web service session. With this web service session
     * a new SOLVATiO case is created and a SOLVATiO session is started with
     * the given user information, locale and start parameters for auto start
     * processes. The method returns a SessionState object that holds a token.
     * This token is required for all consecutive web service method calls
     */
    public com.iisy.solvatio.ws.diagnostic.SessionState startCase(com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault;
}
