/**
 * DataGridHeaderCell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DataGridHeaderCell  implements java.io.Serializable {
    private int colSpan;

    private com.iisy.solvatio.ws.diagnostic.FormElement content;

    private int rowSpan;

    private java.lang.String[] styles;

    public DataGridHeaderCell() {
    }

    public DataGridHeaderCell(
           int colSpan,
           com.iisy.solvatio.ws.diagnostic.FormElement content,
           int rowSpan,
           java.lang.String[] styles) {
           this.colSpan = colSpan;
           this.content = content;
           this.rowSpan = rowSpan;
           this.styles = styles;
    }


    /**
     * Gets the colSpan value for this DataGridHeaderCell.
     * 
     * @return colSpan
     */
    public int getColSpan() {
        return colSpan;
    }


    /**
     * Sets the colSpan value for this DataGridHeaderCell.
     * 
     * @param colSpan
     */
    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }


    /**
     * Gets the content value for this DataGridHeaderCell.
     * 
     * @return content
     */
    public com.iisy.solvatio.ws.diagnostic.FormElement getContent() {
        return content;
    }


    /**
     * Sets the content value for this DataGridHeaderCell.
     * 
     * @param content
     */
    public void setContent(com.iisy.solvatio.ws.diagnostic.FormElement content) {
        this.content = content;
    }


    /**
     * Gets the rowSpan value for this DataGridHeaderCell.
     * 
     * @return rowSpan
     */
    public int getRowSpan() {
        return rowSpan;
    }


    /**
     * Sets the rowSpan value for this DataGridHeaderCell.
     * 
     * @param rowSpan
     */
    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }


    /**
     * Gets the styles value for this DataGridHeaderCell.
     * 
     * @return styles
     */
    public java.lang.String[] getStyles() {
        return styles;
    }


    /**
     * Sets the styles value for this DataGridHeaderCell.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataGridHeaderCell)) return false;
        DataGridHeaderCell other = (DataGridHeaderCell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.colSpan == other.getColSpan() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.rowSpan == other.getRowSpan() &&
            ((this.styles==null && other.getStyles()==null) || 
             (this.styles!=null &&
              java.util.Arrays.equals(this.styles, other.getStyles())));
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
        _hashCode += getColSpan();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += getRowSpan();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataGridHeaderCell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderCell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
