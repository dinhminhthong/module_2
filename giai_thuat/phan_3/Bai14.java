package phan_3;

public class Bai14 {
    public static  int min (int[]arr){
        int viTri =0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<arr[viTri]){
                viTri = i;
            }
        }
        return viTri;
    }

    public static void main(String[] args) {
        int []arr = {2,4,2,3,6,1,7,8,9};
        System.out.println("vị trí số nhỏ nhất là: "+min(arr));
    }
}
