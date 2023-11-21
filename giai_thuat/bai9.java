import java.util.Scanner;

public class bai9 {
    public static void soSanh (int a,int b){
        if (a>b){
            System.out.println("a lớn hơn b");
        } else if (a==b) {
            System.out.println("a bằng b");
        }else {
            System.out.println("a bé hơn b");
        }
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        a = scanner.nextInt();
        System.out.println("nhập số b");
        b = scanner.nextInt();
        soSanh(a,b);
    }
}
