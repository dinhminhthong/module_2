package bai_tap_no.ss_12.service.imp;

import bai_tap_no.ss_12.module.Product;
import bai_tap_no.ss_12.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl  implements IProductService {
    private final List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        for (Product value: this.productList) {

            if (value.getId() == product.getId()){
                return;
            }
        }

        this.productList.add(product);
    }

    @Override
    public boolean editProduct(int id) {
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }

    @Override
    public List<Product> getAll() {
        return this.productList;
    }
}
