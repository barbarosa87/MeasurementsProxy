/**
 * StartProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class StartProcess  implements java.io.Serializable {
    private java.lang.String wsToken;

    private java.lang.String processDefinitionId;

    private com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters;

    public StartProcess() {
    }

    public StartProcess(
           java.lang.String wsToken,
           java.lang.String processDefinitionId,
           com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters) {
           this.wsToken = wsToken;
           this.processDefinitionId = processDefinitionId;
           this.startParameters = startParameters;
    }


    /**
     * Gets the wsToken value for this StartProcess.
     * 
     * @return wsToken
     */
    public java.lang.String getWsToken() {
        return wsToken;
    }


    /**
     * Sets the wsToken value for this StartProcess.
     * 
     * @param wsToken
     */
    public void setWsToken(java.lang.String wsToken) {
        this.wsToken = wsToken;
    }


    /**
     * Gets the processDefinitionId value for this StartProcess.
     * 
     * @return processDefinitionId
     */
    public java.lang.String getProcessDefinitionId() {
        return processDefinitionId;
    }


    /**
     * Sets the processDefinitionId value for this StartProcess.
     * 
     * @param processDefinitionId
     */
    public void setProcessDefinitionId(java.lang.String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }


    /**
     * Gets the startParameters value for this StartProcess.
     * 
     * @return startParameters
     */
    public com.iisy.solvatio.ws.diagnostic.StartParameter[] getStartParameters() {
        return startParameters;
    }


    /**
     * Sets the startParameters value for this StartProcess.
     * 
     * @param startParameters
     */
    public void setStartParameters(com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters) {
        this.startParameters = startParameters;
    }

    public com.iisy.solvatio.ws.diagnostic.StartParameter getStartParameters(int i) {
        return this.startParameters[i];
    }

    public void setStartParameters(int i, com.iisy.solvatio.ws.diagnostic.StartParameter _value) {
        this.startParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StartProcess)) return false;
        StartProcess other = (StartProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsToken==null && other.getWsToken()==null) || 
             (this.wsToken!=null &&
              this.wsToken.equals(other.getWsToken()))) &&
            ((this.processDefinitionId==null && other.getProcessDefinitionId()==null) || 
             (this.processDefinitionId!=null &&
              this.processDefinitionId.equals(other.getProcessDefinitionId()))) &&
            ((this.startParameters==null && other.getStartParameters()==null) || 
             (this.startParameters!=null &&
              java.util.Arrays.equals(this.startParameters, other.getStartParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWsToken() != null) {
            _hashCode += getWsToken().hashCode();
        }
        if (getProcessDefinitionId() != null) {
            _hashCode += getProcessDefinitionId().hashCode();
        }
        if (getStartParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StartProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "startParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
