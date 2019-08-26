package chuong4.Chuong4_bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    Scanner scanner = new Scanner(System.in);
    private boolean status;

    public SachGiaoKhoa() {

    }

    public SachGiaoKhoa(boolean status) {
        super();
        this.status = true;
    }

    public SachGiaoKhoa(String ms, String date, double gia, int sl, String xb, double thanhtien, boolean status) {
        super(ms, date, gia, sl, xb, thanhtien);
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double TTien() {
        if (status == true)
            return this.TTien = this.soluong * this.price;
        else
            return this.TTien = this.soluong * this.price * 50 % 100;
    }

    public String toString() {
        String temp;
        if (status == true)
            temp = "moi";
        else
            temp = "cu";
        return "Sach Giao Khoa: " + super.toString() + '\t' + temp + " thanh tien: " + TTien;

    }
}
