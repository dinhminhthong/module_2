package bai_tap_no.ss_17.Modle;

public class Product {
private String code;
private String name;
private String product;
private int price;
private String description;

    public Product() {
    }

    public Product(String code, String name, String product, int price, String description) {
        this.code = code;
        this.name = name;
        this.product = product;
        this.price = price;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
