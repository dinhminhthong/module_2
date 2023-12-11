package phan_3;

public class Bai15 {
    public static int soAm(int []arr){
        int viTri =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<0){
                viTri= i;
                break;
            }
        }
        return viTri;
    }

    public static void main(String[] args) {
        int []arr ={0,1,1,-4,-5,6};
        System.out.println("vị trí số âm là: " + soAm(arr));
    }
}
