package bai_tap_no.ss_17.controller;

import bai_tap_no.ss_17.Modle.Product;
import bai_tap_no.ss_17.service.AddProductService;
import bai_tap_no.ss_17.service.FindProduct;
import bai_tap_no.ss_17.service.ReadWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {

public static final String FILE_NAME ="src/bai_tap_no/ss_17/product.csv";

public static List<Product> product(){
  List< Product> list = new ArrayList<>();
  Product prd = new Product("M300","mecerdecc300","mec",3000,"màu xanh");
  Product prd1 = new Product("AU","audi i8","audi",2000,"màu trắng");
  Product prdi2 = new Product("CR","camry","toyota",1000,"màu đen");
  list.add(prd);
  list.add(prd1);
  list.add(prdi2);

  ReadWrite.write(FILE_NAME,list);
  return list;
}
public static  void getChoose(int choose,List<Product> list){

  switch (choose){
    case 1:
      AddProductService.addProduct(list);
      ReadWrite.write(FILE_NAME,list);
      System.out.println("finish");
      break;

    case 2:
      List<Product> list1pro =ReadWrite.read(FILE_NAME);
      for (Product product:list1pro){
       System.out.println(product);
      }
      break;
    case 3:
      Scanner sc= new Scanner(System.in);
      System.out.println("nhập mã của sản phẩm");
      String input = sc.nextLine();
      FindProduct.Find(list,input);
      break;
  }
}





}
