package bai_tap_no.ss_12.service;

import bai_tap_no.ss_12.module.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    boolean editProduct(int id);

    boolean deleteProduct(int id);

    List<Product> getAll();
}
