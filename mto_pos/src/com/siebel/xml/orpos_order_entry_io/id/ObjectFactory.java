
package com.siebel.xml.orpos_order_entry_io.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.orpos_order_entry_io.id package. 
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

    private final static QName _ListOfORPOSOrderEntryIo_QNAME = new QName("http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id", "ListOfORPOS_Order_Entry_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.orpos_order_entry_io.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoId }
     * 
     */
    public ListOfORPOSOrderEntryIoId createListOfORPOSOrderEntryIoId() {
        return new ListOfORPOSOrderEntryIoId();
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoTopElmtId }
     * 
     */
    public ListOfORPOSOrderEntryIoTopElmtId createListOfORPOSOrderEntryIoTopElmtId() {
        return new ListOfORPOSOrderEntryIoTopElmtId();
    }

    /**
     * Create an instance of {@link OrderEntryOrdersId }
     * 
     */
    public OrderEntryOrdersId createOrderEntryOrdersId() {
        return new OrderEntryOrdersId();
    }

    /**
     * Create an instance of {@link ListOfOrderEntryLineItemsId }
     * 
     */
    public ListOfOrderEntryLineItemsId createListOfOrderEntryLineItemsId() {
        return new ListOfOrderEntryLineItemsId();
    }

    /**
     * Create an instance of {@link OrderEntryLineItemsId }
     * 
     */
    public OrderEntryLineItemsId createOrderEntryLineItemsId() {
        return new OrderEntryLineItemsId();
    }

    /**
     * Create an instance of {@link PaymentsId }
     * 
     */
    public PaymentsId createPaymentsId() {
        return new PaymentsId();
    }

    /**
     * Create an instance of {@link ListOfPaymentsId }
     * 
     */
    public ListOfPaymentsId createListOfPaymentsId() {
        return new ListOfPaymentsId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfORPOSOrderEntryIoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Id", name = "ListOfORPOS_Order_Entry_Io")
    public JAXBElement<ListOfORPOSOrderEntryIoId> createListOfORPOSOrderEntryIo(ListOfORPOSOrderEntryIoId value) {
        return new JAXBElement<ListOfORPOSOrderEntryIoId>(_ListOfORPOSOrderEntryIo_QNAME, ListOfORPOSOrderEntryIoId.class, null, value);
    }

}
