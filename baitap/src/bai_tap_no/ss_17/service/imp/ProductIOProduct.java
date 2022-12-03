package bai_tap_no.ss_17.service.imp;

import bai_tap_no.ss_12.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductIOProduct implements IFileService{
    @Override
    public List<Product> readFileBinary(String path) throws ClassNotFoundException {
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return products;
        } catch (IOException e) {

            return products;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeFileBinary(String path, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(products);

        objectOutputStream.close();
        fileOutputStream.close();
    }
}
