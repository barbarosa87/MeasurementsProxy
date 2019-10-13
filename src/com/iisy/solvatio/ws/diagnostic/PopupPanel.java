/**
 * PopupPanel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class PopupPanel  extends com.iisy.solvatio.ws.diagnostic.FormElement  implements java.io.Serializable {
    private java.lang.String controlCaption;

    private com.iisy.solvatio.ws.diagnostic.ControlType controlType;

    private com.iisy.solvatio.ws.diagnostic.Container popupContainer;

    private java.lang.String popupHeader;

    public PopupPanel() {
    }

    public PopupPanel(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible,
           java.lang.String controlCaption,
           com.iisy.solvatio.ws.diagnostic.ControlType controlType,
           com.iisy.solvatio.ws.diagnostic.Container popupContainer,
           java.lang.String popupHeader) {
        super(
            layoutConstraints,
            styles,
            visible);
        this.controlCaption = controlCaption;
        this.controlType = controlType;
        this.popupContainer = popupContainer;
        this.popupHeader = popupHeader;
    }


    /**
     * Gets the controlCaption value for this PopupPanel.
     * 
     * @return controlCaption
     */
    public java.lang.String getControlCaption() {
        return controlCaption;
    }


    /**
     * Sets the controlCaption value for this PopupPanel.
     * 
     * @param controlCaption
     */
    public void setControlCaption(java.lang.String controlCaption) {
        this.controlCaption = controlCaption;
    }


    /**
     * Gets the controlType value for this PopupPanel.
     * 
     * @return controlType
     */
    public com.iisy.solvatio.ws.diagnostic.ControlType getControlType() {
        return controlType;
    }


    /**
     * Sets the controlType value for this PopupPanel.
     * 
     * @param controlType
     */
    public void setControlType(com.iisy.solvatio.ws.diagnostic.ControlType controlType) {
        this.controlType = controlType;
    }


    /**
     * Gets the popupContainer value for this PopupPanel.
     * 
     * @return popupContainer
     */
    public com.iisy.solvatio.ws.diagnostic.Container getPopupContainer() {
        return popupContainer;
    }


    /**
     * Sets the popupContainer value for this PopupPanel.
     * 
     * @param popupContainer
     */
    public void setPopupContainer(com.iisy.solvatio.ws.diagnostic.Container popupContainer) {
        this.popupContainer = popupContainer;
    }


    /**
     * Gets the popupHeader value for this PopupPanel.
     * 
     * @return popupHeader
     */
    public java.lang.String getPopupHeader() {
        return popupHeader;
    }


    /**
     * Sets the popupHeader value for this PopupPanel.
     * 
     * @param popupHeader
     */
    public void setPopupHeader(java.lang.String popupHeader) {
        this.popupHeader = popupHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PopupPanel)) return false;
        PopupPanel other = (PopupPanel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.controlCaption==null && other.getControlCaption()==null) || 
             (this.controlCaption!=null &&
              this.controlCaption.equals(other.getControlCaption()))) &&
            ((this.controlType==null && other.getControlType()==null) || 
             (this.controlType!=null &&
              this.controlType.equals(other.getControlType()))) &&
            ((this.popupContainer==null && other.getPopupContainer()==null) || 
             (this.popupContainer!=null &&
              this.popupContainer.equals(other.getPopupContainer()))) &&
            ((this.popupHeader==null && other.getPopupHeader()==null) || 
             (this.popupHeader!=null &&
              this.popupHeader.equals(other.getPopupHeader())));
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
        if (getControlCaption() != null) {
            _hashCode += getControlCaption().hashCode();
        }
        if (getControlType() != null) {
            _hashCode += getControlType().hashCode();
        }
        if (getPopupContainer() != null) {
            _hashCode += getPopupContainer().hashCode();
        }
        if (getPopupHeader() != null) {
            _hashCode += getPopupHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PopupPanel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "popupPanel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlCaption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlCaption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "controlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("popupContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "popupContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "container"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("popupHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "popupHeader"));
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
