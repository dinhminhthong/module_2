package ss9_arraylist.bai_tap_2.module;

public class Product {
    private int id;
    private String name;
    private String price;

    public Product() {
    }

    public Product(String m2, String meceder, String mecerder0, int i, String màu_xanh) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
