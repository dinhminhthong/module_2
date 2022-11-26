package gai_thuat;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {8,7,2,5,3,1,4,6};
        int x =10;
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if (i != j){
                    if(arr[i]+arr[j]==x){
                        System.out.println("{"+arr[i]+","+arr[j]+"}");
                    }
                }
            }
        }
    }
}
