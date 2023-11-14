
package com.siebel.xml.orpos_order_entry_io.id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderEntry-OrdersId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderEntry-OrdersId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfPayments" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id}ListOfPaymentsId" minOccurs="0"/>
 *         &lt;element name="ListOfOrderEntry-LineItems" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id}ListOfOrderEntry-LineItemsId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderEntry-OrdersId", propOrder = {
    "id",
    "modId",
    "listOfPayments",
    "listOfOrderEntryLineItems"
})
public class OrderEntryOrdersId {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfPayments")
    protected ListOfPaymentsId listOfPayments;
    @XmlElement(name = "ListOfOrderEntry-LineItems")
    protected ListOfOrderEntryLineItemsId listOfOrderEntryLineItems;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the listOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPaymentsId }
     *     
     */
    public ListOfPaymentsId getListOfPayments() {
        return listOfPayments;
    }

    /**
     * Sets the value of the listOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPaymentsId }
     *     
     */
    public void setListOfPayments(ListOfPaymentsId value) {
        this.listOfPayments = value;
    }

    /**
     * Gets the value of the listOfOrderEntryLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderEntryLineItemsId }
     *     
     */
    public ListOfOrderEntryLineItemsId getListOfOrderEntryLineItems() {
        return listOfOrderEntryLineItems;
    }

    /**
     * Sets the value of the listOfOrderEntryLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderEntryLineItemsId }
     *     
     */
    public void setListOfOrderEntryLineItems(ListOfOrderEntryLineItemsId value) {
        this.listOfOrderEntryLineItems = value;
    }

}
