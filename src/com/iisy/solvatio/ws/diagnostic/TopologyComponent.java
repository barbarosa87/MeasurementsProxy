/**
 * TopologyComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iisy.solvatio.ws.diagnostic;

public class TopologyComponent  implements java.io.Serializable {
    private com.iisy.solvatio.ws.diagnostic.TopologyAddition[] additions;

    private java.lang.String description;

    private java.lang.String id;

    private com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem[] menuItems;

    private java.lang.String name;

    private com.iisy.solvatio.ws.diagnostic.TopologyComponentState state;

    private java.lang.String type;

    private boolean visible;

    private int x;

    private int y;

    public TopologyComponent() {
    }

    public TopologyComponent(
           com.iisy.solvatio.ws.diagnostic.TopologyAddition[] additions,
           java.lang.String description,
           java.lang.String id,
           com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem[] menuItems,
           java.lang.String name,
           com.iisy.solvatio.ws.diagnostic.TopologyComponentState state,
           java.lang.String type,
           boolean visible,
           int x,
           int y) {
           this.additions = additions;
           this.description = description;
           this.id = id;
           this.menuItems = menuItems;
           this.name = name;
           this.state = state;
           this.type = type;
           this.visible = visible;
           this.x = x;
           this.y = y;
    }


    /**
     * Gets the additions value for this TopologyComponent.
     * 
     * @return additions
     */
    public com.iisy.solvatio.ws.diagnostic.TopologyAddition[] getAdditions() {
        return additions;
    }


    /**
     * Sets the additions value for this TopologyComponent.
     * 
     * @param additions
     */
    public void setAdditions(com.iisy.solvatio.ws.diagnostic.TopologyAddition[] additions) {
        this.additions = additions;
    }

    public com.iisy.solvatio.ws.diagnostic.TopologyAddition getAdditions(int i) {
        return this.additions[i];
    }

    public void setAdditions(int i, com.iisy.solvatio.ws.diagnostic.TopologyAddition _value) {
        this.additions[i] = _value;
    }


    /**
     * Gets the description value for this TopologyComponent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TopologyComponent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this TopologyComponent.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TopologyComponent.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the menuItems value for this TopologyComponent.
     * 
     * @return menuItems
     */
    public com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem[] getMenuItems() {
        return menuItems;
    }


    /**
     * Sets the menuItems value for this TopologyComponent.
     * 
     * @param menuItems
     */
    public void setMenuItems(com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem getMenuItems(int i) {
        return this.menuItems[i];
    }

    public void setMenuItems(int i, com.iisy.solvatio.ws.diagnostic.TopologyComponentMenuItem _value) {
        this.menuItems[i] = _value;
    }


    /**
     * Gets the name value for this TopologyComponent.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TopologyComponent.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the state value for this TopologyComponent.
     * 
     * @return state
     */
    public com.iisy.solvatio.ws.diagnostic.TopologyComponentState getState() {
        return state;
    }


    /**
     * Sets the state value for this TopologyComponent.
     * 
     * @param state
     */
    public void setState(com.iisy.solvatio.ws.diagnostic.TopologyComponentState state) {
        this.state = state;
    }


    /**
     * Gets the type value for this TopologyComponent.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TopologyComponent.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the visible value for this TopologyComponent.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this TopologyComponent.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the x value for this TopologyComponent.
     * 
     * @return x
     */
    public int getX() {
        return x;
    }


    /**
     * Sets the x value for this TopologyComponent.
     * 
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }


    /**
     * Gets the y value for this TopologyComponent.
     * 
     * @return y
     */
    public int getY() {
        return y;
    }


    /**
     * Sets the y value for this TopologyComponent.
     * 
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopologyComponent)) return false;
        TopologyComponent other = (TopologyComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additions==null && other.getAdditions()==null) || 
             (this.additions!=null &&
              java.util.Arrays.equals(this.additions, other.getAdditions()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.menuItems==null && other.getMenuItems()==null) || 
             (this.menuItems!=null &&
              java.util.Arrays.equals(this.menuItems, other.getMenuItems()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.visible == other.isVisible() &&
            this.x == other.getX() &&
            this.y == other.getY();
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
        if (getAdditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMenuItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMenuItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMenuItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getX();
        _hashCode += getY();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopologyComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyAddition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponentMenuItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://diagnostic.ws.solvatio.iisy.com/", "topologyComponentState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("", "y"));
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
