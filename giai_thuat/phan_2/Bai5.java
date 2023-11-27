package phan_2;

public class Bai5 {
    //Tìm nhỏ nhất và lớn nhất
    public static void main(String[] args) {
        int [] arr = {1,2,3,42,3};
        int min= 0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min =arr[i];
            }
            if (arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
