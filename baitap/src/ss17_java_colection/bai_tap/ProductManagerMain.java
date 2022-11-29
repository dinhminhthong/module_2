package ss17_java_colection.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductManagerMain {
    public static void main(String[] args) {
        Product product1 = new Product(1,"mec",1402242001);
        Product product2 = new Product(2, "audi", 24122001);
        Product product3 = new Product(3,"bwm", 772001);
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);

        int choice =1;
        Scanner sc = new Scanner(System.in);
        while (choice!= 0){
            System.out.println("1. Thêm sản phẩm: \n"+
                    "2. sản phầm cần phải chỉnh sửa: \n"+
                    "3. xóa sản phẩm: \n"+
                    "4. hiển thị sản phẩm: \n"+
                    "5. tìm kiếm sản phẩm: \n"+
                    "6. sắp xếp: \n" );
            System.out.println("lựa chọn sản phẩm đầu vào: ");
            choice=Integer.parseInt(sc.nextLine());



        }
    }
}
