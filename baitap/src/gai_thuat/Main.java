package gai_thuat;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] uniqueValues = getUniqueValues(inputArray);

        // In kết quả
        for (int value : uniqueValues) {
            System.out.print(value + " ");
        }
    }

    public static int[] getUniqueValues(int[] arr) {
        // Sử dụng HashSet để lấy các giá trị không trùng lặp
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int item : arr) {
            uniqueSet.add(item);
        }

        // Chuyển HashSet về mảng
        int[] uniqueValues = new int[uniqueSet.size()];
        int index = 0;
        for (int value : uniqueSet) {
            uniqueValues[index++] = value;
        }

        return uniqueValues;
    }
}
