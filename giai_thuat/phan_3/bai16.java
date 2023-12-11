package phan_3;

public class bai16 {
    public static void dem (int[]arr){
        int demAm = 0;
        int demDuong = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<0){
                demAm ++;
            }else {
                demDuong ++;
            }
        }
        System.out.println("số lượng phần tử âm là: "+demAm);
        System.out.println("số lượng phần tử dương là: "+demDuong);
    }

    public static void main(String[] args) {
        int[]arr={1,-2,3,-4,5,-6};
        dem(arr);
    }
}
