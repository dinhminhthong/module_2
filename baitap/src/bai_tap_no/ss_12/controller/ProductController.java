package bai_tap_no.ss_12.controller;

import bai_tap_no.ss_12.module.Product;
import bai_tap_no.ss_12.service.IProductService;
import bai_tap_no.ss_12.service.imp.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public boolean editProduct(int id) {
        return this.productService.editProduct(id);
    }

    public boolean deleteProduct(int id) {
        return this.productService.deleteProduct(id);
    }

    public List<Product> getAll() {
        return this.productService.getAll();
    }
}
