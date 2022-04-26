package lt.viko.eif.tsmolskij.test;

import lt.viko.eif.tsmolskij.Builder.CustomersDAO;
import lt.viko.eif.tsmolskij.store.model.Customers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * <h1>CustomersDAOTests</h1>
 * The CustomersDAOTests class implements an application that
 *  displays CustomersDAO class objects testing.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-04-10
 */
public class CustomersDAOTest  {


    private CustomersDAO customersDAO;
    @BeforeEach
    void setUp() {
        customersDAO = new CustomersDAO();
    }

    @Test
    void fetchStudentsData() {

        Customers customer = customersDAO.fetchStudentsData();
        assertNotNull(customer);
        assertEquals(5, customer.getCustomerList().size());
        assertEquals("Jakub", customer.getCustomerList().get(1).getCusmname());

        assertEquals(15, customer.getCustomerList().get(1).getCusid());

        assertEquals("Savickas", customer.getCustomerList().get(1).getCussurname());

        assertEquals("865289961", customer.getCustomerList().get(0).getCusphone());
    }



}
