package ss4_OOP.bai_tap.baitap2;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,"yellow",10);
        Fan fan2 = new Fan(2,"red",5);
        fan1.isOn();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
