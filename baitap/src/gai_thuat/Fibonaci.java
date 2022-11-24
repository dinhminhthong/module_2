package gai_thuat;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int num;
      do {
          System.out.println("nhập số <20");
          num=Integer.parseInt(sc.nextLine());
      } while (num<0||num>=21);
      int f0=0;
      int f1 =1;
      int fn = f0+f1;
      for (int i=2;i<=num;i++){
          fn=f0+f1;
          f0= f1;
          f1=fn;

      }
      System.out.println(fn);
    }
}
