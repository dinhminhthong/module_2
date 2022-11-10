package ss5_Access_modified_stactic_method_staticproperty.bai_tap;

public class Student {
    private String name = "john";
    private String classes = "C09";
    public Student(){

    }
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    void display() {
        System.out.println(name + " " +  classes+ " " );
    }

    public static void main(String[] args) {
           Student st1 = new Student();
           st1.display();
           Student st2 = new Student("thông","C09");
           st2.display();
    }

}
