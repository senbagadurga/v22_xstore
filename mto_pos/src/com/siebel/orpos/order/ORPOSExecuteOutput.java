
package com.siebel.orpos.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.orpos_order_entry_io.id.ListOfORPOSOrderEntryIoId;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id}ListOfORPOS_Order_Entry_Io"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfORPOSOrderEntryIo"
})
@XmlRootElement(name = "ORPOS_Execute_Output")
public class ORPOSExecuteOutput {

    @XmlElement(name = "ListOfORPOS_Order_Entry_Io", namespace = "http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id", required = true)
    protected ListOfORPOSOrderEntryIoId listOfORPOSOrderEntryIo;

    /**
     * Gets the value of the listOfORPOSOrderEntryIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfORPOSOrderEntryIoId }
     *     
     */
    public ListOfORPOSOrderEntryIoId getListOfORPOSOrderEntryIo() {
        return listOfORPOSOrderEntryIo;
    }

    /**
     * Sets the value of the listOfORPOSOrderEntryIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfORPOSOrderEntryIoId }
     *     
     */
    public void setListOfORPOSOrderEntryIo(ListOfORPOSOrderEntryIoId value) {
        this.listOfORPOSOrderEntryIo = value;
    }

}
