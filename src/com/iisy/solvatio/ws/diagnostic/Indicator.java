/**
 * Indicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class Indicator  extends com.iisy.solvatio.ws.diagnostic.FormElement  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String label;

    private com.iisy.solvatio.ws.diagnostic.LabelPosition labelPosition;

    private boolean showIcon;

    private boolean showLabel;

    private java.lang.String value;

    public Indicator() {
    }

    public Indicator(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible,
           java.lang.String description,
           java.lang.String label,
           com.iisy.solvatio.ws.diagnostic.LabelPosition labelPosition,
           boolean showIcon,
           boolean showLabel,
           java.lang.String value) {
        super(
            layoutConstraints,
            styles,
            visible);
        this.description = description;
        this.label = label;
        this.labelPosition = labelPosition;
        this.showIcon = showIcon;
        this.showLabel = showLabel;
        this.value = value;
    }


    /**
     * Gets the description value for this Indicator.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Indicator.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the label value for this Indicator.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Indicator.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelPosition value for this Indicator.
     * 
     * @return labelPosition
     */
    public com.iisy.solvatio.ws.diagnostic.LabelPosition getLabelPosition() {
        return labelPosition;
    }


    /**
     * Sets the labelPosition value for this Indicator.
     * 
     * @param labelPosition
     */
    public void setLabelPosition(com.iisy.solvatio.ws.diagnostic.LabelPosition labelPosition) {
        this.labelPosition = labelPosition;
    }


    /**
     * Gets the showIcon value for this Indicator.
     * 
     * @return showIcon
     */
    public boolean isShowIcon() {
        return showIcon;
    }


    /**
     * Sets the showIcon value for this Indicator.
     * 
     * @param showIcon
     */
    public void setShowIcon(boolean showIcon) {
        this.showIcon = showIcon;
    }


    /**
     * Gets the showLabel value for this Indicator.
     * 
     * @return showLabel
     */
    public boolean isShowLabel() {
        return showLabel;
    }


    /**
     * Sets the showLabel value for this Indicator.
     * 
     * @param showLabel
     */
    public void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }


    /**
     * Gets the value value for this Indicator.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Indicator.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Indicator)) return false;
        Indicator other = (Indicator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelPosition==null && other.getLabelPosition()==null) || 
             (this.labelPosition!=null &&
              this.labelPosition.equals(other.getLabelPosition()))) &&
            this.showIcon == other.isShowIcon() &&
            this.showLabel == other.isShowLabel() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelPosition() != null) {
            _hashCode += getLabelPosition().hashCode();
        }
        _hashCode += (isShowIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowLabel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indicator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "indicator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "labelPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
