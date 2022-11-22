package ss11_Map.thuc_hanh;

import java.util.Map;
import java.util.TreeMap;

public class Dog {
    private  String name;
    private int age;
    private String address;


    public  Dog(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                "name" + name+
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
////    public int compareTo(Dog o) {
////        if(Dog.getAge() > o.getAge()){
////            return 1;
////        } else if (Dog.getAge()== o.getAge()){
////            return 0;
////
////        } else{
////            return -1;
////        }
//
//    }

    public static void main(String[] args) {
        Dog dog = new Dog("d",3,"quang nam");
        Dog dog1 = new Dog("a",4,"quang ngai");
        Dog dog2= new Dog("c",1,"da nang");
        Dog dog3 = new Dog("b",2,"can tho");

        Map<Integer,Dog> mapDog = new TreeMap<>();
        mapDog.put(1,dog);
        mapDog.put(2,dog1);
        mapDog.put(3,dog2);
        mapDog.put(4,dog3);
        for (Map.Entry<Integer,Dog> entry:mapDog.entrySet()) {
            System.out.println("Key: " + entry.getKey().toString() +
                    ". Value: " + entry.getValue());
        }

        }



}
