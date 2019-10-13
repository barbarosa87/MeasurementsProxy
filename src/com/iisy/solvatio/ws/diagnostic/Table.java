/**
 * Table.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class Table  extends com.iisy.solvatio.ws.diagnostic.FormElement  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.TableColumn[] columns;

    private com.iisy.solvatio.ws.diagnostic.TableCell[][] rows;

    public Table() {
    }

    public Table(
           com.iisy.solvatio.ws.diagnostic.LayoutConstraints layoutConstraints,
           java.lang.String[] styles,
           boolean visible,
           com.iisy.solvatio.ws.diagnostic.TableColumn[] columns,
           com.iisy.solvatio.ws.diagnostic.TableCell[][] rows) {
        super(
            layoutConstraints,
            styles,
            visible);
        this.columns = columns;
        this.rows = rows;
    }


    /**
     * Gets the columns value for this Table.
     * 
     * @return columns
     */
    public com.iisy.solvatio.ws.diagnostic.TableColumn[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this Table.
     * 
     * @param columns
     */
    public void setColumns(com.iisy.solvatio.ws.diagnostic.TableColumn[] columns) {
        this.columns = columns;
    }

    public com.iisy.solvatio.ws.diagnostic.TableColumn getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.iisy.solvatio.ws.diagnostic.TableColumn _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the rows value for this Table.
     * 
     * @return rows
     */
    public com.iisy.solvatio.ws.diagnostic.TableCell[][] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this Table.
     * 
     * @param rows
     */
    public void setRows(com.iisy.solvatio.ws.diagnostic.TableCell[][] rows) {
        this.rows = rows;
    }

    public com.iisy.solvatio.ws.diagnostic.TableCell[] getRows(int i) {
        return this.rows[i];
    }

    public void setRows(int i, com.iisy.solvatio.ws.diagnostic.TableCell[] _value) {
        this.rows[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Table)) return false;
        Table other = (Table) obj;
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
        new org.apache.axis.description.TypeDesc(Table.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "table"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableColumn"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "tableRow"));
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
