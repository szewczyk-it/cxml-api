//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 11:46:51 PM EDT 
//


package org.cxml.v12024;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierPartID",
    "supplierPartAuxiliaryID"
})
@XmlRootElement(name = "ItemID")
public class ItemID {

    @XmlElement(name = "SupplierPartID", required = true)
    protected String supplierPartID;
    @XmlElement(name = "SupplierPartAuxiliaryID")
    protected SupplierPartAuxiliaryID supplierPartAuxiliaryID;

    /**
     * Gets the value of the supplierPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPartID() {
        return supplierPartID;
    }

    /**
     * Sets the value of the supplierPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPartID(String value) {
        this.supplierPartID = value;
    }

    /**
     * Gets the value of the supplierPartAuxiliaryID property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartAuxiliaryID }
     *     
     */
    public SupplierPartAuxiliaryID getSupplierPartAuxiliaryID() {
        return supplierPartAuxiliaryID;
    }

    /**
     * Sets the value of the supplierPartAuxiliaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartAuxiliaryID }
     *     
     */
    public void setSupplierPartAuxiliaryID(SupplierPartAuxiliaryID value) {
        this.supplierPartAuxiliaryID = value;
    }

}
