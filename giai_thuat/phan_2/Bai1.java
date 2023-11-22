package phan_2;

public class Bai1 {
    public static String reverseInputString(String myString) {
        if (myString == null) {
            return myString;
        }    
        String reverseString = "";
        for (int i = myString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + myString.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args) {
        String string = "adcvbn";
        System.out.println("reverse(" + string + ") = " + reverseInputString(string));
    }
}
