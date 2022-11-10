package ss5_Access_modified_stactic_method_staticproperty.thuc_hanh;

public class ClassStudent {
    private int rollno;
    private String name;
    private static String college = "DUT";

    ClassStudent(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        ClassStudent.change();
        ClassStudent s1 = new ClassStudent(111,"tiến");
        ClassStudent s2 = new ClassStudent(123,"sỹ");
        ClassStudent s3 = new ClassStudent(134,"thông");

        s1.display();
        s2.display();
        s3.display();
    }
}
