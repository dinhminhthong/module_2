package bai_tap_no.ss_17.controller;

import bai_tap_no.ss_12.module.Product;
import bai_tap_no.ss_12.service.IProductService;
import bai_tap_no.ss_12.service.imp.ProductServiceImpl;

import java.io.IOException;
import java.util.List;

public class ProductController {

    IProductService productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        try {
            this.productService.add(product);
        } catch (IOException | ClassNotFoundException | ExistProductException e) {
            e.printStackTrace();
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public List<Product> displayProduct(){
        try {
            return this.productService.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void findProduct(int id) {
        try {
            this.productService.find(id);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
