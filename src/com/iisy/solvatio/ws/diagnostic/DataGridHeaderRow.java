/**
 * DataGridHeaderRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DataGridHeaderRow  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell[] cells;

    private java.lang.String[] styles;

    public DataGridHeaderRow() {
    }

    public DataGridHeaderRow(
           com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell[] cells,
           java.lang.String[] styles) {
           this.cells = cells;
           this.styles = styles;
    }


    /**
     * Gets the cells value for this DataGridHeaderRow.
     * 
     * @return cells
     */
    public com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell[] getCells() {
        return cells;
    }


    /**
     * Sets the cells value for this DataGridHeaderRow.
     * 
     * @param cells
     */
    public void setCells(com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell[] cells) {
        this.cells = cells;
    }

    public com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell getCells(int i) {
        return this.cells[i];
    }

    public void setCells(int i, com.iisy.solvatio.ws.diagnostic.DataGridHeaderCell _value) {
        this.cells[i] = _value;
    }


    /**
     * Gets the styles value for this DataGridHeaderRow.
     * 
     * @return styles
     */
    public java.lang.String[] getStyles() {
        return styles;
    }


    /**
     * Sets the styles value for this DataGridHeaderRow.
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
        if (!(obj instanceof DataGridHeaderRow)) return false;
        DataGridHeaderRow other = (DataGridHeaderRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cells==null && other.getCells()==null) || 
             (this.cells!=null &&
              java.util.Arrays.equals(this.cells, other.getCells()))) &&
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
        if (getCells() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCells());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCells(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataGridHeaderRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cells"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderCell"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
