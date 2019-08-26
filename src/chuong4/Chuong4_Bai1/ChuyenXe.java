package chuong4.Chuong4_Bai1;

import java.util.Scanner;

public class ChuyenXe {

    protected double Doanhthu;
    protected String Mschuyen;
    protected String Hoten;
    protected String Soxe;
    Scanner in = new Scanner(System.in);
    public ChuyenXe() {
        this.Mschuyen = "";
        this.Hoten = "";
        this.Soxe = "";
        this.Doanhthu = 0;
    }

    public ChuyenXe(String ms, String ht, String sx, double dt) {
        this.Mschuyen = ms;
        this.Hoten = ht;
        this.Soxe = sx;
        this.Doanhthu = dt;
    }

    public String getMschuyen() {
        return Mschuyen;
    }

    public void setMschuyen(String mschuyen) {
        this.Mschuyen = mschuyen;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String soxe) {
        this.Soxe = soxe;
    }

    protected double getDoanhthu() {
        return Doanhthu;
    }

    protected void setDoanhthu(double doanhthu) {
        Doanhthu = doanhthu;
    }

    public String toString() {
        return "ma so chuyen: " + Mschuyen + " ho ten tai xe: " + Hoten + " so xe: " + Soxe;
    }

}
