
package com.siebel.xml.orpos_order_entry_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfORPOS_Order_Entry_IoTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfORPOS_Order_Entry_IoTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfORPOS_Order_Entry_Io" type="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query}ListOfORPOS_Order_Entry_IoQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfORPOS_Order_Entry_IoTopElmtQuery", propOrder = {
    "listOfORPOSOrderEntryIo"
})
public class ListOfORPOSOrderEntryIoTopElmtQuery {

    @XmlElement(name = "ListOfORPOS_Order_Entry_Io")
    protected ListOfORPOSOrderEntryIoQuery listOfORPOSOrderEntryIo;

    /**
     * Gets the value of the listOfORPOSOrderEntryIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfORPOSOrderEntryIoQuery }
     *     
     */
    public ListOfORPOSOrderEntryIoQuery getListOfORPOSOrderEntryIo() {
        return listOfORPOSOrderEntryIo;
    }

    /**
     * Sets the value of the listOfORPOSOrderEntryIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfORPOSOrderEntryIoQuery }
     *     
     */
    public void setListOfORPOSOrderEntryIo(ListOfORPOSOrderEntryIoQuery value) {
        this.listOfORPOSOrderEntryIo = value;
    }

}
