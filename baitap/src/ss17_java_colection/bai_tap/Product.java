package ss17_java_colection.bai_tap;

import java.util.Scanner;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int price;
    Scanner sc = new Scanner(System.in);

    public Product(){
    }

    public Product( int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("nhập id: ");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("nhập tên sản phẩm: ");
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("nhập giá của sản phẩm: ");
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
