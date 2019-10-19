package com.ote.measure.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import com.iisy.solvatio.ws.diagnostic.AbstractMenuItem;

public class StartEntries implements Serializable{
	
	private Map.Entry<String, String>[] ListEntries;

	public Map.Entry<String, String>[]getListEntries() {
		return ListEntries;
	}

	public void setListEntries(Map.Entry<String, String>[] listEntries) {
		ListEntries = listEntries;
	}

	public StartEntries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StartEntries(Map.Entry<String, String>[] listEntries) {
		super();
		ListEntries = listEntries;
	}
	
	   // Type metadata
//    private static org.apache.axis.description.TypeDesc typeDesc =
//        new org.apache.axis.description.TypeDesc(StartEntries.class, true);
//
//    static {
//        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "parametersList"));
//        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
//        elemField.setFieldName("parameters");
//        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
//        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexType"));
//        elemField.setNillable(false);
//        typeDesc.addFieldDesc(elemField);
//    }
//    
//    
//    /**
//     * Return type metadata object
//     */
//    public static org.apache.axis.description.TypeDesc getTypeDesc() {
//        return typeDesc;
//    }
//
//    /**
//     * Get Custom Serializer
//     */
//    public static org.apache.axis.encoding.Serializer getSerializer(
//           java.lang.String mechType, 
//           java.lang.Class _javaType,  
//           javax.xml.namespace.QName _xmlType) {
//        return 
//          new  org.apache.axis.encoding.ser.BeanSerializer(
//            _javaType, _xmlType, typeDesc);
//    }
//
//    /**
//     * Get Custom Deserializer
//     */
//    public static org.apache.axis.encoding.Deserializer getDeserializer(
//           java.lang.String mechType, 
//           java.lang.Class _javaType,  
//           javax.xml.namespace.QName _xmlType) {
//        return 
//          new  org.apache.axis.encoding.ser.BeanDeserializer(
//            _javaType, _xmlType, typeDesc);
//    }
	
	

}
