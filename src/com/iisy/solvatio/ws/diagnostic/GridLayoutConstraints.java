/**
 * GridLayoutConstraints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class GridLayoutConstraints  extends com.iisy.solvatio.ws.diagnostic.LayoutConstraints  implements java.io.Serializable {
    private int col;

    private int colSpan;

    private int row;

    private int rowSpan;

    public GridLayoutConstraints() {
    }

    public GridLayoutConstraints(
           int col,
           int colSpan,
           int row,
           int rowSpan) {
        this.col = col;
        this.colSpan = colSpan;
        this.row = row;
        this.rowSpan = rowSpan;
    }


    /**
     * Gets the col value for this GridLayoutConstraints.
     * 
     * @return col
     */
    public int getCol() {
        return col;
    }


    /**
     * Sets the col value for this GridLayoutConstraints.
     * 
     * @param col
     */
    public void setCol(int col) {
        this.col = col;
    }


    /**
     * Gets the colSpan value for this GridLayoutConstraints.
     * 
     * @return colSpan
     */
    public int getColSpan() {
        return colSpan;
    }


    /**
     * Sets the colSpan value for this GridLayoutConstraints.
     * 
     * @param colSpan
     */
    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }


    /**
     * Gets the row value for this GridLayoutConstraints.
     * 
     * @return row
     */
    public int getRow() {
        return row;
    }


    /**
     * Sets the row value for this GridLayoutConstraints.
     * 
     * @param row
     */
    public void setRow(int row) {
        this.row = row;
    }


    /**
     * Gets the rowSpan value for this GridLayoutConstraints.
     * 
     * @return rowSpan
     */
    public int getRowSpan() {
        return rowSpan;
    }


    /**
     * Sets the rowSpan value for this GridLayoutConstraints.
     * 
     * @param rowSpan
     */
    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GridLayoutConstraints)) return false;
        GridLayoutConstraints other = (GridLayoutConstraints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.col == other.getCol() &&
            this.colSpan == other.getColSpan() &&
            this.row == other.getRow() &&
            this.rowSpan == other.getRowSpan();
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
        _hashCode += getCol();
        _hashCode += getColSpan();
        _hashCode += getRow();
        _hashCode += getRowSpan();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GridLayoutConstraints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridLayoutConstraints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "row"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
