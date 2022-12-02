package bai_tap_no.ss_17.service;

import bai_tap_no.ss_17.Modle.Product;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class ReadWrite {
    public static List<Product>read (String path){
        List<Product> product = null;
        ObjectInputStream objectInputStream =null;

        try {
            objectInputStream =new ObjectInputStream(new FileInputStream(path));
            product =(List<Product>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
        e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }return product;
    }
    public static void write(String path,List<Product>products){
        ObjectOutputStream objectOutputStream =null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
