
package com.siebel.xml.orpos_order_entry_io.query;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderEntry-LineItemsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderEntry-LineItemsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderEntry-LineItems" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}OrderEntry-LineItemsQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pagesize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="startrownum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="recordcountneeded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderEntry-LineItemsQuery", propOrder = {
    "orderEntryLineItems"
})
public class ListOfOrderEntryLineItemsQuery {

    @XmlElement(name = "OrderEntry-LineItems")
    protected OrderEntryLineItemsQuery orderEntryLineItems;
    @XmlAttribute(name = "pagesize")
    protected BigInteger pagesize;
    @XmlAttribute(name = "startrownum")
    protected BigInteger startrownum;
    @XmlAttribute(name = "recordcountneeded")
    protected Boolean recordcountneeded;

    /**
     * Gets the value of the orderEntryLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderEntryLineItemsQuery }
     *     
     */
    public OrderEntryLineItemsQuery getOrderEntryLineItems() {
        return orderEntryLineItems;
    }

    /**
     * Sets the value of the orderEntryLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderEntryLineItemsQuery }
     *     
     */
    public void setOrderEntryLineItems(OrderEntryLineItemsQuery value) {
        this.orderEntryLineItems = value;
    }

    /**
     * Gets the value of the pagesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagesize() {
        return pagesize;
    }

    /**
     * Sets the value of the pagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagesize(BigInteger value) {
        this.pagesize = value;
    }

    /**
     * Gets the value of the startrownum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartrownum() {
        return startrownum;
    }

    /**
     * Sets the value of the startrownum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartrownum(BigInteger value) {
        this.startrownum = value;
    }

    /**
     * Gets the value of the recordcountneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordcountneeded() {
        return recordcountneeded;
    }

    /**
     * Sets the value of the recordcountneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordcountneeded(Boolean value) {
        this.recordcountneeded = value;
    }

}
