/**
 * ResumeCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class ResumeCase  implements java.io.Serializable {
    private java.lang.String caseId;

    private com.iisy.solvatio.ws.diagnostic.UserData user;

    private com.iisy.solvatio.ws.diagnostic.Locale locale;

    private com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters;

    private java.lang.String applicationId;

    public ResumeCase() {
    }

    public ResumeCase(
           java.lang.String caseId,
           com.iisy.solvatio.ws.diagnostic.UserData user,
           com.iisy.solvatio.ws.diagnostic.Locale locale,
           com.iisy.solvatio.ws.diagnostic.StartParameter[] startParameters,
           java.lang.String applicationId) {
           this.caseId = caseId;
           this.user = user;
           this.locale = locale;
           this.startParameters = startParameters;
           this.applicationId = applicationId;
    }


    /**
     * Gets the caseId value for this ResumeCase.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this ResumeCase.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the user value for this ResumeCase.
     * 
     * @return user
     */
    public com.iisy.solvatio.ws.diagnostic.UserData getUser() {
        return user;
    }


    /**
     * Sets the user value for this ResumeCase.
     * 
     * @param user
     */
    public void setUser(com.iisy.solvatio.ws.diagnostic.UserData user) {
        this.user = user;
    }


    /**
     * Gets the locale value for this ResumeCase.
     * 
     * @return locale
     */
    public com.iisy.solvatio.ws.diagnostic.Locale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ResumeCase.
     * 
     * @param locale
     */
    public void setLocale(com.iisy.solvatio.ws.diagnostic.Locale locale) {
        this.locale = locale;
    }


    /**
     * Gets the startParameters value for this ResumeCase.
     * 
     * @return startParameters
     */
    public com.iisy.solvatio.ws.diagnostic.StartParameter[] getStartParameters() {
        return startParameters;
    }


    /**
     * Sets the startParameters value for this ResumeCase.
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


    /**
     * Gets the applicationId value for this ResumeCase.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this ResumeCase.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResumeCase)) return false;
        ResumeCase other = (ResumeCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.startParameters==null && other.getStartParameters()==null) || 
             (this.startParameters!=null &&
              java.util.Arrays.equals(this.startParameters, other.getStartParameters()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId())));
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
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResumeCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "resumeCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "userData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "locale"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
