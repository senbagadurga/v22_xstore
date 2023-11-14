
package com.siebel.xml.orpos_order_entry_io.id;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderEntry-LineItemsId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderEntry-LineItemsId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderEntry-LineItems" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id}OrderEntry-LineItemsId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderEntry-LineItemsId", propOrder = {
    "orderEntryLineItems"
})
public class ListOfOrderEntryLineItemsId {

    @XmlElement(name = "OrderEntry-LineItems")
    protected List<OrderEntryLineItemsId> orderEntryLineItems;

    /**
     * Gets the value of the orderEntryLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderEntryLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderEntryLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderEntryLineItemsId }
     * 
     * 
     */
    public List<OrderEntryLineItemsId> getOrderEntryLineItems() {
        if (orderEntryLineItems == null) {
            orderEntryLineItems = new ArrayList<OrderEntryLineItemsId>();
        }
        return this.orderEntryLineItems;
    }

}
