package ss5_Access_modified_stactic_method_staticproperty.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfcar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfcar++;
    }

    public static void main(String[] args) {
         new Car("audi i3","vinfast");
        System.out.println(Car.numberOfcar);
         new Car("vinfast luxyry A2.0", "audi");
        System.out.println(Car.numberOfcar);
         new Car("camry","toyota");
        System.out.println(Car.numberOfcar);
    }
}
