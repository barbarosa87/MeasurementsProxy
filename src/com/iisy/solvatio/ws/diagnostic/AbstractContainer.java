/**
 * AbstractContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public abstract class AbstractContainer  extends com.iisy.solvatio.ws.diagnostic.FormElement  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.FormElement[] children;

    private com.iisy.solvatio.ws.diagnostic.Layout layout;

    public AbstractContainer() {
    }

    public AbstractContainer(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible,
           com.iisy.solvatio.ws.diagnostic.FormElement[] children,
           com.iisy.solvatio.ws.diagnostic.Layout layout) {
        super(
            layoutConstraints,
            styles,
            visible);
        this.children = children;
        this.layout = layout;
    }


    /**
     * Gets the children value for this AbstractContainer.
     * 
     * @return children
     */
    public com.iisy.solvatio.ws.diagnostic.FormElement[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this AbstractContainer.
     * 
     * @param children
     */
    public void setChildren(com.iisy.solvatio.ws.diagnostic.FormElement[] children) {
        this.children = children;
    }

    public com.iisy.solvatio.ws.diagnostic.FormElement getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.iisy.solvatio.ws.diagnostic.FormElement _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the layout value for this AbstractContainer.
     * 
     * @return layout
     */
    public com.iisy.solvatio.ws.diagnostic.Layout getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this AbstractContainer.
     * 
     * @param layout
     */
    public void setLayout(com.iisy.solvatio.ws.diagnostic.Layout layout) {
        this.layout = layout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractContainer)) return false;
        AbstractContainer other = (AbstractContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "abstractContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "layout"));
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
