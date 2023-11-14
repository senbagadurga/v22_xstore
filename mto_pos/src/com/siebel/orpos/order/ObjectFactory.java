
package com.siebel.orpos.order;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.orpos.order package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.orpos.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ORPOSQueryPageInput }
     * 
     */
    public ORPOSQueryPageInput createORPOSQueryPageInput() {
        return new ORPOSQueryPageInput();
    }

    /**
     * Create an instance of {@link ORPOSQueryPageOutput }
     * 
     */
    public ORPOSQueryPageOutput createORPOSQueryPageOutput() {
        return new ORPOSQueryPageOutput();
    }

    /**
     * Create an instance of {@link ORPOSExecuteInput }
     * 
     */
    public ORPOSExecuteInput createORPOSExecuteInput() {
        return new ORPOSExecuteInput();
    }

    /**
     * Create an instance of {@link ORPOSExecuteOutput }
     * 
     */
    public ORPOSExecuteOutput createORPOSExecuteOutput() {
        return new ORPOSExecuteOutput();
    }

}
