
package com.siebel.xml.orpos_order_entry_io.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.orpos_order_entry_io.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfORPOSOrderEntryIo_QNAME = new QName("http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Data", "ListOfORPOS_Order_Entry_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.orpos_order_entry_io.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoData }
     * 
     */
    public ListOfORPOSOrderEntryIoData createListOfORPOSOrderEntryIoData() {
        return new ListOfORPOSOrderEntryIoData();
    }

    /**
     * Create an instance of {@link ListOfOrderEntryLineItemsData }
     * 
     */
    public ListOfOrderEntryLineItemsData createListOfOrderEntryLineItemsData() {
        return new ListOfOrderEntryLineItemsData();
    }

    /**
     * Create an instance of {@link OrderEntryOrdersData }
     * 
     */
    public OrderEntryOrdersData createOrderEntryOrdersData() {
        return new OrderEntryOrdersData();
    }

    /**
     * Create an instance of {@link PaymentsData }
     * 
     */
    public PaymentsData createPaymentsData() {
        return new PaymentsData();
    }

    /**
     * Create an instance of {@link OrderEntryLineItemsData }
     * 
     */
    public OrderEntryLineItemsData createOrderEntryLineItemsData() {
        return new OrderEntryLineItemsData();
    }

    /**
     * Create an instance of {@link ListOfPaymentsData }
     * 
     */
    public ListOfPaymentsData createListOfPaymentsData() {
        return new ListOfPaymentsData();
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoTopElmtData }
     * 
     */
    public ListOfORPOSOrderEntryIoTopElmtData createListOfORPOSOrderEntryIoTopElmtData() {
        return new ListOfORPOSOrderEntryIoTopElmtData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfORPOSOrderEntryIoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Data", name = "ListOfORPOS_Order_Entry_Io")
    public JAXBElement<ListOfORPOSOrderEntryIoData> createListOfORPOSOrderEntryIo(ListOfORPOSOrderEntryIoData value) {
        return new JAXBElement<ListOfORPOSOrderEntryIoData>(_ListOfORPOSOrderEntryIo_QNAME, ListOfORPOSOrderEntryIoData.class, null, value);
    }

}
