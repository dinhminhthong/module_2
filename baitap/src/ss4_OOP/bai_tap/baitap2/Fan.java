package ss4_OOP.bai_tap.baitap2;

public class Fan {
static final int Slow =1;
static final int Medium =2;
static final int Fast =3;
int speed;
boolean on= false;
double darius;
String color;

public Fan(){
    this.speed= Slow;
    this.darius=5;
    this.color = "blue";
}
public Fan(int speed, String color, double darius){
     this.speed = speed;
     this.color = color;
     this.darius = darius;
}

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on=true;
    }


    public double getDarius() {
        return darius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
    if (this.on){
        return "speed: " + this.speed + " color: " + this.color + " radius: " + this.darius + ". The fan is on";
    }else {
        return "speed: " + this.speed + " color: " + this.color + " radius: " + this.darius + ". The fan is off";
    }
    }
}
