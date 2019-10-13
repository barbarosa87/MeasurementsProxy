/**
 * AppForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class AppForm  implements java.io.Serializable {
    private java.lang.String id;

    private com.iisy.solvatio.ws.diagnostic.FormElement root;

    private java.lang.String[] styles;

    private boolean visible;

    public AppForm() {
    }

    public AppForm(
           java.lang.String id,
           com.iisy.solvatio.ws.diagnostic.FormElement root,
           java.lang.String[] styles,
           boolean visible) {
           this.id = id;
           this.root = root;
           this.styles = styles;
           this.visible = visible;
    }


    /**
     * Gets the id value for this AppForm.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AppForm.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the root value for this AppForm.
     * 
     * @return root
     */
    public com.iisy.solvatio.ws.diagnostic.FormElement getRoot() {
        return root;
    }


    /**
     * Sets the root value for this AppForm.
     * 
     * @param root
     */
    public void setRoot(com.iisy.solvatio.ws.diagnostic.FormElement root) {
        this.root = root;
    }


    /**
     * Gets the styles value for this AppForm.
     * 
     * @return styles
     */
    public java.lang.String[] getStyles() {
        return styles;
    }


    /**
     * Sets the styles value for this AppForm.
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
     * Gets the visible value for this AppForm.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this AppForm.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppForm)) return false;
        AppForm other = (AppForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.root==null && other.getRoot()==null) || 
             (this.root!=null &&
              this.root.equals(other.getRoot()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRoot() != null) {
            _hashCode += getRoot().hashCode();
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
        new org.apache.axis.description.TypeDesc(AppForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "appForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root");
        elemField.setXmlName(new javax.xml.namespace.QName("", "root"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement"));
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
