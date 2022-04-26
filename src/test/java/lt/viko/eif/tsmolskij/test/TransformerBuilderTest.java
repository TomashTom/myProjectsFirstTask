package lt.viko.eif.tsmolskij.test;

import lt.viko.eif.tsmolskij.Builder.CustomersDAO;
import lt.viko.eif.tsmolskij.Builder.TransformerBuilder;
import lt.viko.eif.tsmolskij.store.model.Customers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>TransformerBuilderTest</h1>
 * The TransformerBuilderTest class implements an application that
 *  displays TransformerBuilderTest class objects testing.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-04-10
 */

class TransformerBuilderTest {
    private CustomersDAO customersDAO;
    private  TransformerBuilder transformerBuilder;
    @BeforeEach
    void setUp(){
        transformerBuilder = new TransformerBuilder();
    }

    @Test
    void transformToPojo() {
        Customers customers = transformerBuilder.transformToPojo("customer.xml");
        assertNotNull(customers);
        assertEquals(5, customers.getCustomerList().size());
    }

    @Test
    void transformToXML() {
        customersDAO = new CustomersDAO();
        String  customerXMLDocument = transformerBuilder.transformToXML(customersDAO.fetchStudentsData());
        assertNotNull(customerXMLDocument);

        /*assertTrue(customerXMLDocument.contains("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));*/

        assertFalse(customerXMLDocument.contains("<id>"));

        assertFalse(customerXMLDocument.contains("<name>"));

        assertFalse(customerXMLDocument.contains("<surname>"));

        assertFalse(customerXMLDocument.contains("<Cusphone>"));

        assertFalse(customerXMLDocument.contains("<Cusaddress>"));

        assertFalse(customerXMLDocument.contains("<Year>"));

    }
}