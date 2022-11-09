package ss4_OOP.thuc_hanh;

public class HinhChuNhat {
    double chieuDai, chieuRong;
    public HinhChuNhat(){
    }
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getArea(){
        return this.chieuDai * this.chieuRong;
    }
public double getPerimeter(){
        return (this.chieuDai + this.chieuRong)*2;
}

}



