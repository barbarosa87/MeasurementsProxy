/**
 * DataGrid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class DataGrid  extends com.iisy.solvatio.ws.diagnostic.FormElement  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.DataGridColumn[] columns;

    private com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow[] headerRows;

    private com.iisy.solvatio.ws.diagnostic.FormElement[][] rows;

    public DataGrid() {
    }

    public DataGrid(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible,
           com.iisy.solvatio.ws.diagnostic.DataGridColumn[] columns,
           com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow[] headerRows,
           com.iisy.solvatio.ws.diagnostic.FormElement[][] rows) {
        super(
            layoutConstraints,
            styles,
            visible);
        this.columns = columns;
        this.headerRows = headerRows;
        this.rows = rows;
    }


    /**
     * Gets the columns value for this DataGrid.
     * 
     * @return columns
     */
    public com.iisy.solvatio.ws.diagnostic.DataGridColumn[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this DataGrid.
     * 
     * @param columns
     */
    public void setColumns(com.iisy.solvatio.ws.diagnostic.DataGridColumn[] columns) {
        this.columns = columns;
    }

    public com.iisy.solvatio.ws.diagnostic.DataGridColumn getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.iisy.solvatio.ws.diagnostic.DataGridColumn _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the headerRows value for this DataGrid.
     * 
     * @return headerRows
     */
    public com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow[] getHeaderRows() {
        return headerRows;
    }


    /**
     * Sets the headerRows value for this DataGrid.
     * 
     * @param headerRows
     */
    public void setHeaderRows(com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow[] headerRows) {
        this.headerRows = headerRows;
    }

    public com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow getHeaderRows(int i) {
        return this.headerRows[i];
    }

    public void setHeaderRows(int i, com.iisy.solvatio.ws.diagnostic.DataGridHeaderRow _value) {
        this.headerRows[i] = _value;
    }


    /**
     * Gets the rows value for this DataGrid.
     * 
     * @return rows
     */
    public com.iisy.solvatio.ws.diagnostic.FormElement[][] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this DataGrid.
     * 
     * @param rows
     */
    public void setRows(com.iisy.solvatio.ws.diagnostic.FormElement[][] rows) {
        this.rows = rows;
    }

    public com.iisy.solvatio.ws.diagnostic.FormElement[] getRows(int i) {
        return this.rows[i];
    }

    public void setRows(int i, com.iisy.solvatio.ws.diagnostic.FormElement[] _value) {
        this.rows[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataGrid)) return false;
        DataGrid other = (DataGrid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.headerRows==null && other.getHeaderRows()==null) || 
             (this.headerRows!=null &&
              java.util.Arrays.equals(this.headerRows, other.getHeaderRows()))) &&
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows())));
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
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeaderRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeaderRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeaderRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
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
        new org.apache.axis.description.TypeDesc(DataGrid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGrid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridHeaderRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "dataGridRow"));
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
