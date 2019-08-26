package chuong4.Chuong4_bai2;

import java.util.Scanner;

public class Sach {

    protected String maSach;
    protected String Date;
    protected double price;
    protected int soluong;
    protected String nhaxuatban;
    protected double TTien;

    public Sach() {
        this.maSach = "";
        this.Date = "";
        this.price = 0;
        this.soluong = 0;
        this.nhaxuatban = "";
        this.TTien = 0;
    }

    public Sach(String ms, String date, double gia, int sl, String xb, double thanhtien) {
        this.maSach = ms;
        this.Date = date;
        this.price = gia;
        this.soluong = sl;
        this.nhaxuatban = xb;
        this.TTien = thanhtien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public double getTTien() {
        return TTien;
    }

    public void setTTien(double TTien) {
        this.TTien = TTien;
    }

    public String toString() {
        return "quan ly sach: ma sach: " + maSach + " ngay nhap: " + Date + " don gia: " + price + " so luong: " + soluong + " nah xuat ban: " + nhaxuatban;

    }
}
