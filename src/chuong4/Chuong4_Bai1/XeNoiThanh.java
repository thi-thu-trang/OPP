package chuong4.Chuong4_Bai1;

import java.util.Scanner;

class NoiThanh extends ChuyenXe {

    private String SoTuyen;
    private double km;
    Scanner in = new Scanner(System.in);

    public NoiThanh() {
        super();
        this.SoTuyen = "";
        this.km = 0;
    }

    public NoiThanh(String ms, String ht, String sx, double dt, String stuyen, double diduoc) {
        super(ms, ht, sx, dt);
        this.SoTuyen = stuyen;
        this.km = diduoc;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String sotuyen) {
        this.SoTuyen = sotuyen;
    }

    public void setkm(double di) {
        this.km = di;
    }

    public double getkm() {
        return km;
    }

    public String toString() {
        return "Chuyen Xe Noi Thanh " + super.toString() + "\n So Tuyen: " + this.SoTuyen + "\nSo Km: " + this.km + "\nDoanh Thu: " + this.Doanhthu;
    }

}
