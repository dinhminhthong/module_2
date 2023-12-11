package phan_3;

public class bai18 {
    //Viết chương trình tính tổng các phần tử chia hết cho 5 trong mảng.
    public static int chiHet (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] %5 ==0){
               sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = {5,10,2,4,15};
        System.out.println(chiHet(arr));
    }
}
