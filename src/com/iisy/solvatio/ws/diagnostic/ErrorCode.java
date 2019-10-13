/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class ErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_REQUEST = "INVALID_REQUEST";
    public static final java.lang.String _INVALID_SESSION = "INVALID_SESSION";
    public static final java.lang.String _INVALID_CASE = "INVALID_CASE";
    public static final java.lang.String _LOCALE_MISMATCH = "LOCALE_MISMATCH";
    public static final java.lang.String _UNKNOWN_ELEMENT = "UNKNOWN_ELEMENT";
    public static final java.lang.String _INVALID_OPERATION = "INVALID_OPERATION";
    public static final java.lang.String _VALIDATION_ERROR = "VALIDATION_ERROR";
    public static final java.lang.String _SERVICE_ERROR = "SERVICE_ERROR";
    public static final java.lang.String _KNOWLEDGEBASE_ERROR = "KNOWLEDGEBASE_ERROR";
    public static final java.lang.String _RUNTIME_ERROR = "RUNTIME_ERROR";
    public static final ErrorCode INVALID_REQUEST = new ErrorCode(_INVALID_REQUEST);
    public static final ErrorCode INVALID_SESSION = new ErrorCode(_INVALID_SESSION);
    public static final ErrorCode INVALID_CASE = new ErrorCode(_INVALID_CASE);
    public static final ErrorCode LOCALE_MISMATCH = new ErrorCode(_LOCALE_MISMATCH);
    public static final ErrorCode UNKNOWN_ELEMENT = new ErrorCode(_UNKNOWN_ELEMENT);
    public static final ErrorCode INVALID_OPERATION = new ErrorCode(_INVALID_OPERATION);
    public static final ErrorCode VALIDATION_ERROR = new ErrorCode(_VALIDATION_ERROR);
    public static final ErrorCode SERVICE_ERROR = new ErrorCode(_SERVICE_ERROR);
    public static final ErrorCode KNOWLEDGEBASE_ERROR = new ErrorCode(_KNOWLEDGEBASE_ERROR);
    public static final ErrorCode RUNTIME_ERROR = new ErrorCode(_RUNTIME_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ErrorCode enumeration = (ErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ErrorCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "errorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
