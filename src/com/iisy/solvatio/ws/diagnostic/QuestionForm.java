/**
 * QuestionForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public abstract class QuestionForm  extends com.iisy.solvatio.ws.diagnostic.Form  implements java.io.Serializable {
    private java.lang.String conclusion;

    private java.lang.String introduction;

    private java.lang.String prompt;

    private boolean required;

    private java.lang.String title;

    private com.iisy.solvatio.ws.diagnostic.Validator validator;

    public QuestionForm() {
    }

    public QuestionForm(
           java.lang.String id,
           java.lang.String processId,
           java.lang.String conclusion,
           java.lang.String introduction,
           java.lang.String prompt,
           boolean required,
           java.lang.String title,
           com.iisy.solvatio.ws.diagnostic.Validator validator) {
        super(
            id,
            processId);
        this.conclusion = conclusion;
        this.introduction = introduction;
        this.prompt = prompt;
        this.required = required;
        this.title = title;
        this.validator = validator;
    }


    /**
     * Gets the conclusion value for this QuestionForm.
     * 
     * @return conclusion
     */
    public java.lang.String getConclusion() {
        return conclusion;
    }


    /**
     * Sets the conclusion value for this QuestionForm.
     * 
     * @param conclusion
     */
    public void setConclusion(java.lang.String conclusion) {
        this.conclusion = conclusion;
    }


    /**
     * Gets the introduction value for this QuestionForm.
     * 
     * @return introduction
     */
    public java.lang.String getIntroduction() {
        return introduction;
    }


    /**
     * Sets the introduction value for this QuestionForm.
     * 
     * @param introduction
     */
    public void setIntroduction(java.lang.String introduction) {
        this.introduction = introduction;
    }


    /**
     * Gets the prompt value for this QuestionForm.
     * 
     * @return prompt
     */
    public java.lang.String getPrompt() {
        return prompt;
    }


    /**
     * Sets the prompt value for this QuestionForm.
     * 
     * @param prompt
     */
    public void setPrompt(java.lang.String prompt) {
        this.prompt = prompt;
    }


    /**
     * Gets the required value for this QuestionForm.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this QuestionForm.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the title value for this QuestionForm.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this QuestionForm.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the validator value for this QuestionForm.
     * 
     * @return validator
     */
    public com.iisy.solvatio.ws.diagnostic.Validator getValidator() {
        return validator;
    }


    /**
     * Sets the validator value for this QuestionForm.
     * 
     * @param validator
     */
    public void setValidator(com.iisy.solvatio.ws.diagnostic.Validator validator) {
        this.validator = validator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionForm)) return false;
        QuestionForm other = (QuestionForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conclusion==null && other.getConclusion()==null) || 
             (this.conclusion!=null &&
              this.conclusion.equals(other.getConclusion()))) &&
            ((this.introduction==null && other.getIntroduction()==null) || 
             (this.introduction!=null &&
              this.introduction.equals(other.getIntroduction()))) &&
            ((this.prompt==null && other.getPrompt()==null) || 
             (this.prompt!=null &&
              this.prompt.equals(other.getPrompt()))) &&
            this.required == other.isRequired() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.validator==null && other.getValidator()==null) || 
             (this.validator!=null &&
              this.validator.equals(other.getValidator())));
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
        if (getConclusion() != null) {
            _hashCode += getConclusion().hashCode();
        }
        if (getIntroduction() != null) {
            _hashCode += getIntroduction().hashCode();
        }
        if (getPrompt() != null) {
            _hashCode += getPrompt().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getValidator() != null) {
            _hashCode += getValidator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuestionForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "questionForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introduction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introduction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prompt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "validator"));
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
