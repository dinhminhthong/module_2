package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {

        System.out.println("Enter your string ");
        Scanner sc = new Scanner(System.in);
        String inputString= sc.nextLine();
        int[]frequentChar=new int[225];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii=(int) inputString.charAt(i);
            frequentChar[ascii]+=1;
        }int max=0;
        char character=(char)225;
        for (int i = 0; i < 225; i++) {
            if(frequentChar[i]>max){
                max=frequentChar[i];
                character=(char)i;
            }
        }
        System.out.println("the most appearing letter is "+ character+ " with a frequent " + max+ " time");
    }
}
