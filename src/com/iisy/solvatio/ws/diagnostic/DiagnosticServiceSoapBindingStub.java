/**
 * DiagnosticServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DiagnosticServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTopology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "topologyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topology"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.TopologySection[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "sections"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "TopologyNotFoundFault"),
                      "com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "TopologyNotFoundFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metaData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "metaProperty"), com.iisy.solvatio.ws.diagnostic.MetaProperty[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resumeCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "caseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "userData"), com.iisy.solvatio.ws.diagnostic.UserData.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "locale"), com.iisy.solvatio.ws.diagnostic.Locale.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startParameter"), com.iisy.solvatio.ws.diagnostic.StartParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "applicationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "sessionState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.SessionState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "events"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.Event[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "events"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formPage"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.Form[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "forms"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcessMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "menuFormId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processMenuForm"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "items"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "submissions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formSubmission"), com.iisy.solvatio.ws.diagnostic.FormSubmission[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "sessionState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.SessionState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "ValidationFault"),
                      "com.iisy.solvatio.ws.diagnostic.ValidationFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "ValidationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metaData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "metaProperty"), com.iisy.solvatio.ws.diagnostic.MetaProperty[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAppForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "appForm"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.AppForm.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rollbackProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "steps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.ProcessState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "feedbackComponent"), com.iisy.solvatio.ws.diagnostic.FeedbackComponent.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSessionState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "sessionState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.SessionState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLocale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "locale"), com.iisy.solvatio.ws.diagnostic.Locale.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "processDefinitionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startParameter"), com.iisy.solvatio.ws.diagnostic.StartParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.ProcessState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "userData"), com.iisy.solvatio.ws.diagnostic.UserData.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "locale"), com.iisy.solvatio.ws.diagnostic.Locale.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startParameter"), com.iisy.solvatio.ws.diagnostic.StartParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "applicationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "sessionState"));
        oper.setReturnClass(com.iisy.solvatio.ws.diagnostic.SessionState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"),
                      "com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault",
                      new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault"), 
                      true
                     ));
        _operations[14] = oper;

    }

    public DiagnosticServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DiagnosticServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DiagnosticServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", ">>userData>extendedData>entry");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.UserDataExtendedDataEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", ">userData>extendedData");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.UserDataExtendedDataEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", ">>userData>extendedData>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractContainer");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractMedia");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractMedia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractMenuItem");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractPanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractPanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractTabPanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractTabPanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "accordionPanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AccordionPanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "appForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AppForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "choiceQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ChoiceQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeCase");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.CloseCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.CloseCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeSession");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.CloseSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeSessionResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.CloseSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "container");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Container.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "controlType");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGrid");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DataGrid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridColumn");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DataGridColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderCell");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderRow");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridRow");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.FormElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement");
            qName2 = new javax.xml.namespace.QName("", "cells");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dateInputType");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DateInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dateQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DateQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "DiagnosticServiceFault");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dynamicForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.DynamicForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "errorCategory");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "errorCode");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "event");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "events");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Event[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "event");
            qName2 = new javax.xml.namespace.QName("", "events");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "expressionValidator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ExpressionValidator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "feedbackComponent");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.FeedbackComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "form");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Form.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.FormElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formPage");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Form[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "form");
            qName2 = new javax.xml.namespace.QName("", "forms");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formSubmission");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.FormSubmission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getAppForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetAppForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getAppFormResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetAppFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getEvents");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getEventsResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetEventsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getForms");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetForms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getFormsResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getProcessMenu");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetProcessMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getProcessMenuResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetProcessMenuResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getSessionState");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetSessionState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getSessionStateResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetSessionStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getTopology");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetTopology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getTopologyResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GetTopologyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "grid");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Grid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridCell");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GridCell.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridLayout");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GridLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridLayoutConstraints");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GridLayoutConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridRow");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.GridCell[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridCell");
            qName2 = new javax.xml.namespace.QName("", "cells");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "horizontalLayout");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.HorizontalLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "horizontalLayoutConstraints");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.HorizontalLayoutConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "image");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "indicator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Indicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "inputValue");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.InputValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "iterator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Iterator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "label");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Label.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "labelPosition");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.LabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "layout");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Layout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "layoutConstraints");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.LayoutConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "link");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Link.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "locale");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Locale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "media");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Media.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "mediaType");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MediaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "messageForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MessageForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "messageType");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "metaProperty");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MetaProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "minMaxValidator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MinMaxValidator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "multipleChoiceQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.MultipleChoiceQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "numberInputType");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.NumberInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "numberQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.NumberQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "option");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Option.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "panel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Panel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "popupPanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.PopupPanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processCategory");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ProcessCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processItem");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ProcessItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processMenuForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractMenuItem");
            qName2 = new javax.xml.namespace.QName("", "items");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "processState");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ProcessState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "questionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.QuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "regExValidator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.RegExValidator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "resumeCase");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ResumeCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "resumeCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ResumeCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "richText");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.RichText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "rollbackProcess");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.RollbackProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "rollbackProcessResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.RollbackProcessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "separator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Separator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "sessionState");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SessionState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "setLocale");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SetLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "setLocaleResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SetLocaleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "signalEvent");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SignalEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "singleChoiceQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SingleChoiceQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "size");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startCase");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.StartCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.StartCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startParameter");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.StartParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startProcess");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.StartProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startProcessResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.StartProcessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "state");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitFeedback");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SubmitFeedback.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SubmitFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitForms");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SubmitForms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitFormsResponse");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.SubmitFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tab");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Tab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "table");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Table.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableCell");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TableCell.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableColumn");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TableColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableRow");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TableCell[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableCell");
            qName2 = new javax.xml.namespace.QName("", "cells");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tabPanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TabPanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "text");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Text.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "textQuestionForm");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TextQuestionForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "togglePanel");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TogglePanel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topology");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologySection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologySection");
            qName2 = new javax.xml.namespace.QName("", "sections");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyAddition");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologyAddition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponent");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologyComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponentMenuItem");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponentState");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologyComponentState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "TopologyNotFoundFault");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologySection");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.TopologySection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "unit");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Unit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "userData");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.UserData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "validationError");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ValidationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "ValidationErrors");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ValidationErrors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "ValidationFault");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.ValidationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "validator");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.Validator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "verticalLayout");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.VerticalLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "verticalLayoutConstraints");
            cachedSerQNames.add(qName);
            cls = com.iisy.solvatio.ws.diagnostic.VerticalLayoutConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.iisy.solvatio.ws.diagnostic.TopologySection[] getTopology(java.lang.String wsToken, java.lang.String topologyId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetTopology");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getTopology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, topologyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.TopologySection[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.TopologySection[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.TopologySection[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault) {
              throw (com.iisy.solvatio.ws.diagnostic.TopologyNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void closeCase(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:CloseCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, metaData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.SessionState resumeCase(java.lang.String caseId, com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResumeCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "resumeCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {caseId, user, locale, startParameters, applicationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.SessionState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.Event[] getEvents(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, processId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.Event[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.Event[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.Event[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.Form[] getForms(java.lang.String wsToken, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, processId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.Form[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.Form[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.Form[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[] getProcessMenu(java.lang.String wsToken, java.lang.String menuFormId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetProcessMenu");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getProcessMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, menuFormId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.SessionState submitForms(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.ValidationFault, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SubmitForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, submissions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.SessionState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.ValidationFault) {
              throw (com.iisy.solvatio.ws.diagnostic.ValidationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void closeSession(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.MetaProperty[] metaData) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:CloseSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "closeSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, metaData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.AppForm getAppForm(java.lang.String wsToken, java.lang.String formId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetAppForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getAppForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, formId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.AppForm) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.AppForm) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.AppForm.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.ProcessState rollbackProcess(java.lang.String wsToken, int steps, java.lang.String processId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:RollbackProcess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "rollbackProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, new java.lang.Integer(steps), processId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.ProcessState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.ProcessState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.ProcessState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void submitFeedback(java.lang.String wsToken, java.lang.String feedback, java.lang.String processId, com.iisy.solvatio.ws.diagnostic.FeedbackComponent context) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SubmitFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, feedback, processId, context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.SessionState getSessionState(java.lang.String wsToken) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetSessionState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "getSessionState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.SessionState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setLocale(java.lang.String wsToken, com.iisy.solvatio.ws.diagnostic.Locale locale) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SetLocale");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "setLocale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, locale});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.ProcessState startProcess(java.lang.String wsToken, java.lang.String processDefinitionId, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:StartProcess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsToken, processDefinitionId, startParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.ProcessState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.ProcessState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.ProcessState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.iisy.solvatio.ws.diagnostic.SessionState startCase(com.iisy.solvatio.ws.diagnostic.UserData user, com.iisy.solvatio.ws.diagnostic.Locale locale, com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters, java.lang.String applicationId) throws java.rmi.RemoteException, com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:StartCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, locale, startParameters, applicationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iisy.solvatio.ws.diagnostic.SessionState) org.apache.axis.utils.JavaUtils.convert(_resp, com.iisy.solvatio.ws.diagnostic.SessionState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) {
              throw (com.iisy.solvatio.ws.diagnostic.DiagnosticServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
