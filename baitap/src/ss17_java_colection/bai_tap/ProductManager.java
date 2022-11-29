package ss17_java_colection.bai_tap;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void addProduct (List<Product> listProduct){
        Product newProduct = new Product();
//        newProduct.setId();
//        newProduct.setName();
//        newProduct.setPrice();
        listProduct.add(newProduct);
    }
    public  static void  displayProduct(List<Product> listProduct){
        for (int i=0; i<listProduct.size();i++){
            Product product = listProduct.get(i);
            System.out.println("Product; "+product.toString());
        }
    }
    public static void editProductById (List<Product> listProduct){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID của sản phẩm cần chỉnh sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        int size = listProduct.size();
        for(int i =0; i<size;i++){
            Product product= new Product();
            product.getId();
            product.getName();
            product.getPrice();
        }
    }
    public static void deleteProductById(List<Product>listProduct){
        Scanner sc= new Scanner(System.in);
        System.out.println(" nhập ID của sản phẩm cần xóa: ");
        int id  = Integer.parseInt(sc.nextLine());
        int size = listProduct.size();
        for (int i=0; i<size;i++){
            Product product = listProduct.get(i);
            if(id ==product.getId()){
                listProduct.remove(product);
            }
        }
    }
    public static void searchProductByName(List<Product>listproduct){

    }

}
