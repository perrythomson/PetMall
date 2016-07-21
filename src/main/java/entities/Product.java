package entities;

/**
 * Created by perrythomson on 7/21/16.
 */
public class Product {

    private Long productID;
    private String name;
    private String description;
    private double price;

    public Product(Long productId, String s, String s1, double v) {
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

