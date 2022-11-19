package ss10_stack_queue.bai_tap2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReadData {
    public static void main(String[] args) {
        Map<String,Integer> data = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập đoan văn bản");
        String document = sc.nextLine();
        String [] world = document.toUpperCase().split(" ");
        int count = 0;
        int size = world.length;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (world[i].equals(world[j]));
                count++;
            }
            data.put(world[i],count);
            count =0;
        }
       System.out.println(data);
    }

}
