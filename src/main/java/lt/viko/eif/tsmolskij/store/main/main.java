
package lt.viko.eif.tsmolskij.store.main;


import lt.viko.eif.tsmolskij.Builder.TransformerBuilder;
import lt.viko.eif.tsmolskij.store.model.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Scanner;


/**
 * <h1>Main</h1>
 * The Main program implements an application that
 * simply displays "Customers" to the standard output.
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author  Tomasz
 * @version 1.8
 * @since   2022-02-28
 */
public class main {


    public static void main(String args[]) throws JAXBException, IOException {


        TransformerBuilder transformerBuilder = new TransformerBuilder();

        Customers customers = transformerBuilder.transformToPojo("Customer.xml");

        System.out.println(customers); // performing transformation to object and outputting result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to change customer 1 name: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":

                customers.getCustomerList().get(2).setCusmname("Changed Name");
                break;

            case "2":
                customers.getCustomerList().get(4).setCusaddress("Juonazuoliu g. 2");
                break;

            case "3":
                customers.getCustomerList().get(1).setCussurname("Petraitis");
                break;
            case "4":
                customers.getCustomerList().get(3).setCusphone("New Phone");
                break;

        }
        System.out.println();
        transformerBuilder.transformToXML(customers); // performing transformation to XML and outputting resul

    }
   }
