package chuong4.Chuong4_bai2;

import java.util.Scanner;

public class SachThamKhao extends Sach {
    Scanner scanner = new Scanner(System.in);
    private double tax;

    public SachThamKhao() {

    }

    public SachThamKhao(String ms, String date, double gia, int sl, String xb, double thanhtien, double thue) {
        super(ms, date, gia, sl, xb, thanhtien);
        this.tax = thue;

    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double TTien() {
        return this.TTien = this.soluong * this.price + this.tax;
    }

    public String toString() {
        return "sach tham khao: " + super.toString() + "thue: " + tax + " thanh tien: " + TTien;
    }
}
