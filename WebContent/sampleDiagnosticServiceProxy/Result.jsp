<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleDiagnosticServiceProxyid" scope="session" class="com.iisy.solvatio.ws.diagnostic.DiagnosticServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleDiagnosticServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleDiagnosticServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleDiagnosticServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.iisy.solvatio.ws.diagnostic.DiagnosticService_PortType getDiagnosticService_PortType10mtemp = sampleDiagnosticServiceProxyid.getDiagnosticService_PortType();
if(getDiagnosticService_PortType10mtemp == null){
%>
<%=getDiagnosticService_PortType10mtemp %>
<%
}else{
        if(getDiagnosticService_PortType10mtemp!= null){
        String tempreturnp11 = getDiagnosticService_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String wsToken_1id=  request.getParameter("wsToken16");
            java.lang.String wsToken_1idTemp = null;
        if(!wsToken_1id.equals("")){
         wsToken_1idTemp  = wsToken_1id;
        }
        String topologyId_2id=  request.getParameter("topologyId18");
            java.lang.String topologyId_2idTemp = null;
        if(!topologyId_2id.equals("")){
         topologyId_2idTemp  = topologyId_2id;
        }
        com.iisy.solvatio.ws.diagnostic.TopologySection[] getTopology13mtemp = sampleDiagnosticServiceProxyid.getTopology(wsToken_1idTemp,topologyId_2idTemp);
if(getTopology13mtemp == null){
%>
<%=getTopology13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(getTopology13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(getTopology13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 20:
        gotMethod = true;
        String wsToken_3id=  request.getParameter("wsToken23");
            java.lang.String wsToken_3idTemp = null;
        if(!wsToken_3id.equals("")){
         wsToken_3idTemp  = wsToken_3id;
        }
        String processId_4id=  request.getParameter("processId25");
            java.lang.String processId_4idTemp = null;
        if(!processId_4id.equals("")){
         processId_4idTemp  = processId_4id;
        }
        com.iisy.solvatio.ws.diagnostic.Form[] getForms20mtemp = sampleDiagnosticServiceProxyid.getForms(wsToken_3idTemp,processId_4idTemp);
if(getForms20mtemp == null){
%>
<%=getForms20mtemp %>
<%
}else{
        String tempreturnp21 = null;
        if(getForms20mtemp != null){
        java.util.List listreturnp21= java.util.Arrays.asList(getForms20mtemp);
        tempreturnp21 = listreturnp21.toString();
        }
        %>
        <%=tempreturnp21%>
        <%
}
break;
case 27:
        gotMethod = true;
        String wsToken_5id=  request.getParameter("wsToken30");
            java.lang.String wsToken_5idTemp = null;
        if(!wsToken_5id.equals("")){
         wsToken_5idTemp  = wsToken_5id;
        }
        String processId_6id=  request.getParameter("processId32");
            java.lang.String processId_6idTemp = null;
        if(!processId_6id.equals("")){
         processId_6idTemp  = processId_6id;
        }
        com.iisy.solvatio.ws.diagnostic.Event[] getEvents27mtemp = sampleDiagnosticServiceProxyid.getEvents(wsToken_5idTemp,processId_6idTemp);
if(getEvents27mtemp == null){
%>
<%=getEvents27mtemp %>
<%
}else{
        String tempreturnp28 = null;
        if(getEvents27mtemp != null){
        java.util.List listreturnp28= java.util.Arrays.asList(getEvents27mtemp);
        tempreturnp28 = listreturnp28.toString();
        }
        %>
        <%=tempreturnp28%>
        <%
}
break;
case 34:
        gotMethod = true;
        String wsToken_7id=  request.getParameter("wsToken37");
            java.lang.String wsToken_7idTemp = null;
        if(!wsToken_7id.equals("")){
         wsToken_7idTemp  = wsToken_7id;
        }
        String menuFormId_8id=  request.getParameter("menuFormId39");
            java.lang.String menuFormId_8idTemp = null;
        if(!menuFormId_8id.equals("")){
         menuFormId_8idTemp  = menuFormId_8id;
        }
        com.iisy.solvatio.ws.diagnostic.AbstractMenuItem[] getProcessMenu34mtemp = sampleDiagnosticServiceProxyid.getProcessMenu(wsToken_7idTemp,menuFormId_8idTemp);
if(getProcessMenu34mtemp == null){
%>
<%=getProcessMenu34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(getProcessMenu34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(getProcessMenu34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
case 41:
        gotMethod = true;
        String wsToken_9id=  request.getParameter("wsToken54");
            java.lang.String wsToken_9idTemp = null;
        if(!wsToken_9id.equals("")){
         wsToken_9idTemp  = wsToken_9id;
        }
        String formId_10id=  request.getParameter("formId56");
            java.lang.String formId_10idTemp = null;
        if(!formId_10id.equals("")){
         formId_10idTemp  = formId_10id;
        }
        com.iisy.solvatio.ws.diagnostic.AppForm getAppForm41mtemp = sampleDiagnosticServiceProxyid.getAppForm(wsToken_9idTemp,formId_10idTemp);
if(getAppForm41mtemp == null){
%>
<%=getAppForm41mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">root:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">layoutConstraints:</TD>
<TD>
<%
if(getAppForm41mtemp != null){
com.iisy.solvatio.ws.diagnostic.FormElement tebece0=getAppForm41mtemp.getRoot();
if(tebece0 != null){
com.iisy.solvatio.ws.diagnostic.LayoutConstraints typelayoutConstraints46 = tebece0.getLayoutConstraints();
        if(typelayoutConstraints46!= null){
        String templayoutConstraints46 = typelayoutConstraints46.toString();
        %>
        <%=templayoutConstraints46%>
        <%
        }}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">visible:</TD>
<TD>
<%
if(getAppForm41mtemp != null){
com.iisy.solvatio.ws.diagnostic.FormElement tebece0=getAppForm41mtemp.getRoot();
if(tebece0 != null){
%>
<%=tebece0.isVisible()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">visible:</TD>
<TD>
<%
if(getAppForm41mtemp != null){
%>
<%=getAppForm41mtemp.isVisible()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getAppForm41mtemp != null){
java.lang.String typeid52 = getAppForm41mtemp.getId();
        String tempResultid52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid52));
        %>
        <%= tempResultid52 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 58:
        gotMethod = true;
        String wsToken_11id=  request.getParameter("wsToken67");
            java.lang.String wsToken_11idTemp = null;
        if(!wsToken_11id.equals("")){
         wsToken_11idTemp  = wsToken_11id;
        }
        String steps_12id=  request.getParameter("steps69");
        int steps_12idTemp  = Integer.parseInt(steps_12id);
        String processId_13id=  request.getParameter("processId71");
            java.lang.String processId_13idTemp = null;
        if(!processId_13id.equals("")){
         processId_13idTemp  = processId_13id;
        }
        com.iisy.solvatio.ws.diagnostic.ProcessState rollbackProcess58mtemp = sampleDiagnosticServiceProxyid.rollbackProcess(wsToken_11idTemp,steps_12idTemp,processId_13idTemp);
if(rollbackProcess58mtemp == null){
%>
<%=rollbackProcess58mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">numberOfEvents:</TD>
<TD>
<%
if(rollbackProcess58mtemp != null){
%>
<%=rollbackProcess58mtemp.getNumberOfEvents()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">processId:</TD>
<TD>
<%
if(rollbackProcess58mtemp != null){
java.lang.String typeprocessId63 = rollbackProcess58mtemp.getProcessId();
        String tempResultprocessId63 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprocessId63));
        %>
        <%= tempResultprocessId63 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">processDefinitionId:</TD>
<TD>
<%
if(rollbackProcess58mtemp != null){
java.lang.String typeprocessDefinitionId65 = rollbackProcess58mtemp.getProcessDefinitionId();
        String tempResultprocessDefinitionId65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprocessDefinitionId65));
        %>
        <%= tempResultprocessDefinitionId65 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 73:
        gotMethod = true;
        String wsToken_14id=  request.getParameter("wsToken76");
            java.lang.String wsToken_14idTemp = null;
        if(!wsToken_14id.equals("")){
         wsToken_14idTemp  = wsToken_14id;
        }
        String feedback_15id=  request.getParameter("feedback78");
            java.lang.String feedback_15idTemp = null;
        if(!feedback_15id.equals("")){
         feedback_15idTemp  = feedback_15id;
        }
        String processId_16id=  request.getParameter("processId80");
            java.lang.String processId_16idTemp = null;
        if(!processId_16id.equals("")){
         processId_16idTemp  = processId_16id;
        }
        String appFormId_18id=  request.getParameter("appFormId84");
            java.lang.String appFormId_18idTemp = null;
        if(!appFormId_18id.equals("")){
         appFormId_18idTemp  = appFormId_18id;
        }
        String id_19id=  request.getParameter("id86");
            java.lang.String id_19idTemp = null;
        if(!id_19id.equals("")){
         id_19idTemp  = id_19id;
        }
        %>
        <jsp:useBean id="com1iisy1solvatio1ws1diagnostic1FeedbackComponent_17id" scope="session" class="com.iisy.solvatio.ws.diagnostic.FeedbackComponent" />
        <%
        com1iisy1solvatio1ws1diagnostic1FeedbackComponent_17id.setAppFormId(appFormId_18idTemp);
        com1iisy1solvatio1ws1diagnostic1FeedbackComponent_17id.setId(id_19idTemp);
        sampleDiagnosticServiceProxyid.submitFeedback(wsToken_14idTemp,feedback_15idTemp,processId_16idTemp,com1iisy1solvatio1ws1diagnostic1FeedbackComponent_17id);
break;
case 88:
        gotMethod = true;
        String wsToken_20id=  request.getParameter("wsToken95");
            java.lang.String wsToken_20idTemp = null;
        if(!wsToken_20id.equals("")){
         wsToken_20idTemp  = wsToken_20id;
        }
        com.iisy.solvatio.ws.diagnostic.SessionState getSessionState88mtemp = sampleDiagnosticServiceProxyid.getSessionState(wsToken_20idTemp);
if(getSessionState88mtemp == null){
%>
<%=getSessionState88mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">caseId:</TD>
<TD>
<%
if(getSessionState88mtemp != null){
java.lang.String typecaseId91 = getSessionState88mtemp.getCaseId();
        String tempResultcaseId91 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecaseId91));
        %>
        <%= tempResultcaseId91 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">token:</TD>
<TD>
<%
if(getSessionState88mtemp != null){
java.lang.String typetoken93 = getSessionState88mtemp.getToken();
        String tempResulttoken93 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetoken93));
        %>
        <%= tempResulttoken93 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 97:
        gotMethod = true;
        String wsToken_21id=  request.getParameter("wsToken100");
            java.lang.String wsToken_21idTemp = null;
        if(!wsToken_21id.equals("")){
         wsToken_21idTemp  = wsToken_21id;
        }
        String localeCode_23id=  request.getParameter("localeCode104");
            java.lang.String localeCode_23idTemp = null;
        if(!localeCode_23id.equals("")){
         localeCode_23idTemp  = localeCode_23id;
        }
        %>
        <jsp:useBean id="com1iisy1solvatio1ws1diagnostic1Locale_22id" scope="session" class="com.iisy.solvatio.ws.diagnostic.Locale" />
        <%
        com1iisy1solvatio1ws1diagnostic1Locale_22id.setLocaleCode(localeCode_23idTemp);
        sampleDiagnosticServiceProxyid.setLocale(wsToken_21idTemp,com1iisy1solvatio1ws1diagnostic1Locale_22id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>