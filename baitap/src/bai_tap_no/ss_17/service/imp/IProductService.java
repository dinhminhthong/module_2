package bai_tap_no.ss_17.service.imp;

import bai_tap_no.ss_12.module.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {

    default void add(Product product) throws IOException, ClassNotFoundException, ExistProductException {

    }

    default List<Product> display() throws IOException, ClassNotFoundException {


    }

    default void find(int id) throws IOException, ClassNotFoundException {
    }
}
