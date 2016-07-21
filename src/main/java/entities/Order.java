package entities;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by perrythomson on 7/21/16.
 */
public class Order {

    private Long orderID;
    private Date orderDate;
    private Long ownerID;
    private ArrayList products;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public ArrayList getProducts() {
        return products;
    }

    public void setProducts(ArrayList products) {
        this.products = products;
    }
}
