import java.util.Scanner;

public class Bai6 {
    // viết chương trình tính n!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number;
        System.out.println("nhập số muốn tin dây thừa");
        number= scanner.nextLong();
        long count =1;
        long i =1;
        while (i<=number){
            count = count *i;
            i++;
        }
        System.out.println("Giay thừa của: "+number+"là: "+count);
    }
}
