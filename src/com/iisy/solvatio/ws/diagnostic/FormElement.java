/**
 * FormElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public abstract class FormElement  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints;

    private java.lang.String[] styles;

    private boolean visible;

    public FormElement() {
    }

    public FormElement(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible) {
           this.layoutConstraints = layoutConstraints;
           this.styles = styles;
           this.visible = visible;
    }


    /**
     * Gets the layoutConstraints value for this FormElement.
     * 
     * @return layoutConstraints
     */
    public com.iisy.solvatio.ws.diagnostic.LayoutConstraints getLayoutConstraints() {
        return layoutConstraints;
    }


    /**
     * Sets the layoutConstraints value for this FormElement.
     * 
     * @param layoutConstraints
     */
    public void setLayoutConstraints(com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints) {
        this.layoutConstraints = layoutConstraints;
    }


    /**
     * Gets the styles value for this FormElement.
     * 
     * @return styles
     */
    public java.lang.String[] getStyles() {
        return styles;
    }


    /**
     * Sets the styles value for this FormElement.
     * 
     * @param styles
     */
    public void setStyles(java.lang.String[] styles) {
        this.styles = styles;
    }

    public java.lang.String getStyles(int i) {
        return this.styles[i];
    }

    public void setStyles(int i, java.lang.String _value) {
        this.styles[i] = _value;
    }


    /**
     * Gets the visible value for this FormElement.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this FormElement.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormElement)) return false;
        FormElement other = (FormElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layoutConstraints==null && other.getLayoutConstraints()==null) || 
             (this.layoutConstraints!=null &&
              this.layoutConstraints.equals(other.getLayoutConstraints()))) &&
            ((this.styles==null && other.getStyles()==null) || 
             (this.styles!=null &&
              java.util.Arrays.equals(this.styles, other.getStyles()))) &&
            this.visible == other.isVisible();
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
        if (getLayoutConstraints() != null) {
            _hashCode += getLayoutConstraints().hashCode();
        }
        if (getStyles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStyles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStyles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "layoutConstraints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "styles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
