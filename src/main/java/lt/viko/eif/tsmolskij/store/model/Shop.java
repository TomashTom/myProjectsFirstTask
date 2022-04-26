package lt.viko.eif.tsmolskij.store.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String shopname;
    private List<Customer> customers = new ArrayList<>();

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopname() {
        return shopname;
    }
}
