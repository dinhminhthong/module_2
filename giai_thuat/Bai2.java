import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap a: ");
        float a = scanner.nextFloat();
        System.out.println("nhap b: ");
        float b = scanner.nextFloat();
        if (a==0){
            if (b==0){
                System.out.println("phương trình vô số nghiệm!");
            }else {
                System.out.println("phương trình vô nghiệm!");
            }
        }else {
         float   x =-b/a;
            System.out.println("phương triình có nghiệm là: "+x);
        }
    }
}
