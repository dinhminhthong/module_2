package bai_tap_no.ss_17.service;

import bai_tap_no.ss_17.Modle.Product;

import java.util.List;
import java.util.Scanner;

public class AddProductService {
    public static void addProduct (List<Product> e){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã sản phẩm");
        String code = sc.nextLine();
        System.out.println("nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("nhập nhà sản xuất");
        String producer = sc.nextLine();
        System.out.println("nhập giá sản phẩm");
        int price =Integer.parseInt(sc.nextLine());
        System.out.println("nhập các mô tả khác của sản phẩm");
        String description = sc.nextLine();

        Product product = new Product (code,name,producer,price,description);
        e.add(product);
    }
}
