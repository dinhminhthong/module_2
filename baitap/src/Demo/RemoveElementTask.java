package Demo;

import java.util.Vector;

public class VectorDemo implements Runnable{
    private Vector<Integer> vector;

    public RemoveElementTask(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Chờ một khoảng thời gian ngắn trước khi xóa phần tử
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Kiểm tra và xóa phần tử nếu có
            if (!vector.isEmpty()) {
                int removedElement = vector.remove(0);
                System.out.println("Removed element: " + removedElement);
            } else {
                System.out.println("Vector is empty");
            }
        }
    }
}
