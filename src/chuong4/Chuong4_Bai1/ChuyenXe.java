package chuong4.Chuong4_Bai1;

import java.util.Scanner;

public class ChuyenXe {
    protected double Doanhthu;
    Scanner in = new Scanner(System.in);
    private String Mschuyen, Hoten, Soxe;

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

    protected void nhap() {
        System.out.println("Nhap MaSo Chuyen: ");
        this.Mschuyen = in.nextLine();
        System.out.println("Ho Ten Tai Xe: ");
        this.Hoten = in.nextLine();
        System.out.println("So Xe: ");
        this.Soxe = in.nextLine();
        System.out.println("Doanh Thu: ");
        this.Doanhthu = in.nextDouble();
    }

    public String toString() {
        return "ma so chuyen: " + Mschuyen + " ho ten tai xe: " + Hoten + " so xe: " + Soxe;
    }

}
