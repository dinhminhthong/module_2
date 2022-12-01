package gai_thuat;

public class PenNumberNull {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" ");
            }
            System.out.println(i);
            for (int k=1;k<=2*i;k++){
                System.out.print(" ");
            }
            System.out.print(i);
        }
        for ( int i=4;i>0;i--){
            for (int j=4;j>i;j--){
                System.out.print(" ");
            }
             System.out.print(i);
            for (int k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
  }
