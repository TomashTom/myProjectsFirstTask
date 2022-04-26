package lt.viko.eif.tsmolskij.store.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Customers")
public class Customers {

    private List<Customer> customerList = new ArrayList<>();
    public  List<Customer> getCustomerList() {return customerList;}

    @XmlElement(name = "Customer")
    public void setCustomerList(List<Customer> customerList){this.customerList = customerList;}
    @Override
    public String toString() {
        return String.format("\n\nCustomers: \n\n %s", printCustomers());
    }

    private String printCustomers(){
        String result = "";
        for(Customer cus : getCustomerList()){
            result += cus;
        }
        return result;
    }
}
