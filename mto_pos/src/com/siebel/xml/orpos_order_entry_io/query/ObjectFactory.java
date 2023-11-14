
package com.siebel.xml.orpos_order_entry_io.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.orpos_order_entry_io.query package. 
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

    private final static QName _ListOfORPOSOrderEntryIo_QNAME = new QName("http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query", "ListOfORPOS_Order_Entry_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.orpos_order_entry_io.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoQuery }
     * 
     */
    public ListOfORPOSOrderEntryIoQuery createListOfORPOSOrderEntryIoQuery() {
        return new ListOfORPOSOrderEntryIoQuery();
    }

    /**
     * Create an instance of {@link ListOfPaymentsQuery }
     * 
     */
    public ListOfPaymentsQuery createListOfPaymentsQuery() {
        return new ListOfPaymentsQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderEntryLineItemsQuery }
     * 
     */
    public ListOfOrderEntryLineItemsQuery createListOfOrderEntryLineItemsQuery() {
        return new ListOfOrderEntryLineItemsQuery();
    }

    /**
     * Create an instance of {@link OrderEntryLineItemsQuery }
     * 
     */
    public OrderEntryLineItemsQuery createOrderEntryLineItemsQuery() {
        return new OrderEntryLineItemsQuery();
    }

    /**
     * Create an instance of {@link PaymentsQuery }
     * 
     */
    public PaymentsQuery createPaymentsQuery() {
        return new PaymentsQuery();
    }

    /**
     * Create an instance of {@link ListOfORPOSOrderEntryIoTopElmtQuery }
     * 
     */
    public ListOfORPOSOrderEntryIoTopElmtQuery createListOfORPOSOrderEntryIoTopElmtQuery() {
        return new ListOfORPOSOrderEntryIoTopElmtQuery();
    }

    /**
     * Create an instance of {@link OrderEntryOrdersQuery }
     * 
     */
    public OrderEntryOrdersQuery createOrderEntryOrdersQuery() {
        return new OrderEntryOrdersQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfORPOSOrderEntryIoQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/ORPOS_Order_Entry_IO/Query", name = "ListOfORPOS_Order_Entry_Io")
    public JAXBElement<ListOfORPOSOrderEntryIoQuery> createListOfORPOSOrderEntryIo(ListOfORPOSOrderEntryIoQuery value) {
        return new JAXBElement<ListOfORPOSOrderEntryIoQuery>(_ListOfORPOSOrderEntryIo_QNAME, ListOfORPOSOrderEntryIoQuery.class, null, value);
    }

}
