package ss6_inheritance.point2d;

import java.util.Arrays;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d(float x, float y){
        this.x= x;
        this.y = y;
    }
    public Point2d(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[]arr={x,y};
        return arr;
    }
    public String toString(){
        return "Point2d" + Arrays.toString(getXY());

    }

    public void setXY(float x1, float y1) {
        this.x=x1;
        this.y=y1;
    }
}
