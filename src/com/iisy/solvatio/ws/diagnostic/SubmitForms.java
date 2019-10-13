/**
 * SubmitForms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class SubmitForms  implements java.io.Serializable {
    private java.lang.String wsToken;

    private com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions;

    public SubmitForms() {
    }

    public SubmitForms(
           java.lang.String wsToken,
           com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions) {
           this.wsToken = wsToken;
           this.submissions = submissions;
    }


    /**
     * Gets the wsToken value for this SubmitForms.
     * 
     * @return wsToken
     */
    public java.lang.String getWsToken() {
        return wsToken;
    }


    /**
     * Sets the wsToken value for this SubmitForms.
     * 
     * @param wsToken
     */
    public void setWsToken(java.lang.String wsToken) {
        this.wsToken = wsToken;
    }


    /**
     * Gets the submissions value for this SubmitForms.
     * 
     * @return submissions
     */
    public com.iisy.solvatio.ws.diagnostic.FormSubmission[] getSubmissions() {
        return submissions;
    }


    /**
     * Sets the submissions value for this SubmitForms.
     * 
     * @param submissions
     */
    public void setSubmissions(com.iisy.solvatio.ws.diagnostic.FormSubmission[] submissions) {
        this.submissions = submissions;
    }

    public com.iisy.solvatio.ws.diagnostic.FormSubmission getSubmissions(int i) {
        return this.submissions[i];
    }

    public void setSubmissions(int i, com.iisy.solvatio.ws.diagnostic.FormSubmission _value) {
        this.submissions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitForms)) return false;
        SubmitForms other = (SubmitForms) obj;
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
            ((this.submissions==null && other.getSubmissions()==null) || 
             (this.submissions!=null &&
              java.util.Arrays.equals(this.submissions, other.getSubmissions())));
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
        if (getSubmissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmissions(), i);
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
        new org.apache.axis.description.TypeDesc(SubmitForms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "submitForms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formSubmission"));
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
