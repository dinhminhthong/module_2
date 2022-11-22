package ss7_interface.ss6_inheritance.point2d;

public class Point3d extends Point2d {
private float z = 0.0f;

public Point3d(){

}
public Point3d(float z){
    this.z = z;
}
public Point3d (float x, float y, float z){
    super(x,y);
    this.z=z;
}
public float getZ(){
    return z;
}
public void setZ(float z){
    this.z = z;
}
public void setXYZ (float x, float y, float z){
    super.getXY();
    this.z=z;

}
public float[] getXYZ(){
    float[] array ={super.getX(),super.getY(),z};
    return array;
}
public String toString(){
    return "Point3d"+getXYZ();
}
}
