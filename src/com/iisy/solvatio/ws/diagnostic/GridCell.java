/**
 * GridCell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class GridCell  implements java.io.Serializable {
    private int col;

    private int colSpan;

    private com.iisy.solvatio.ws.diagnostic.FormElement content;

    private int row;

    private int rowSpan;

    public GridCell() {
    }

    public GridCell(
           int col,
           int colSpan,
           com.iisy.solvatio.ws.diagnostic.FormElement content,
           int row,
           int rowSpan) {
           this.col = col;
           this.colSpan = colSpan;
           this.content = content;
           this.row = row;
           this.rowSpan = rowSpan;
    }


    /**
     * Gets the col value for this GridCell.
     * 
     * @return col
     */
    public int getCol() {
        return col;
    }


    /**
     * Sets the col value for this GridCell.
     * 
     * @param col
     */
    public void setCol(int col) {
        this.col = col;
    }


    /**
     * Gets the colSpan value for this GridCell.
     * 
     * @return colSpan
     */
    public int getColSpan() {
        return colSpan;
    }


    /**
     * Sets the colSpan value for this GridCell.
     * 
     * @param colSpan
     */
    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }


    /**
     * Gets the content value for this GridCell.
     * 
     * @return content
     */
    public com.iisy.solvatio.ws.diagnostic.FormElement getContent() {
        return content;
    }


    /**
     * Sets the content value for this GridCell.
     * 
     * @param content
     */
    public void setContent(com.iisy.solvatio.ws.diagnostic.FormElement content) {
        this.content = content;
    }


    /**
     * Gets the row value for this GridCell.
     * 
     * @return row
     */
    public int getRow() {
        return row;
    }


    /**
     * Sets the row value for this GridCell.
     * 
     * @param row
     */
    public void setRow(int row) {
        this.row = row;
    }


    /**
     * Gets the rowSpan value for this GridCell.
     * 
     * @return rowSpan
     */
    public int getRowSpan() {
        return rowSpan;
    }


    /**
     * Sets the rowSpan value for this GridCell.
     * 
     * @param rowSpan
     */
    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GridCell)) return false;
        GridCell other = (GridCell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.col == other.getCol() &&
            this.colSpan == other.getColSpan() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
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
        int _hashCode = 1;
        _hashCode += getCol();
        _hashCode += getColSpan();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += getRow();
        _hashCode += getRowSpan();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GridCell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "gridCell"));
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
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "formElement"));
        elemField.setMinOccurs(0);
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
