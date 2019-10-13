/**
 * DateQuestionForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DateQuestionForm  extends com.iisy.solvatio.ws.diagnostic.QuestionForm  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.DateInputType inputType;

    public DateQuestionForm() {
    }

    public DateQuestionForm(
           java.lang.String id,
           java.lang.String processId,
           java.lang.String conclusion,
           java.lang.String introduction,
           java.lang.String prompt,
           boolean required,
           java.lang.String title,
           com.iisy.solvatio.ws.diagnostic.Validator validator,
           com.iisy.solvatio.ws.diagnostic.DateInputType inputType) {
        super(
            id,
            processId,
            conclusion,
            introduction,
            prompt,
            required,
            title,
            validator);
        this.inputType = inputType;
    }


    /**
     * Gets the inputType value for this DateQuestionForm.
     * 
     * @return inputType
     */
    public com.iisy.solvatio.ws.diagnostic.DateInputType getInputType() {
        return inputType;
    }


    /**
     * Sets the inputType value for this DateQuestionForm.
     * 
     * @param inputType
     */
    public void setInputType(com.iisy.solvatio.ws.diagnostic.DateInputType inputType) {
        this.inputType = inputType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateQuestionForm)) return false;
        DateQuestionForm other = (DateQuestionForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inputType==null && other.getInputType()==null) || 
             (this.inputType!=null &&
              this.inputType.equals(other.getInputType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInputType() != null) {
            _hashCode += getInputType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateQuestionForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dateQuestionForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dateInputType"));
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
