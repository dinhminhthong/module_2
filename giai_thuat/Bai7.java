public class Bai7 {
    public static boolean kiemTraDayTangGiam(int[] arr) {
        boolean tang = true;
        boolean giam = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tang = false;
            } else if (arr[i] < arr[i + 1]) {
                giam = false;
            }
        }
        if (tang) {
            System.out.println("Dãy tăng");
        } else if (giam) {
            System.out.println("Dãy giảm");
        } else {
            System.out.println("Dãy này chưa được sắp xếp");
        }

        return tang || giam;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6,4,5};
        System.out.println(kiemTraDayTangGiam(arr));
    }
}
