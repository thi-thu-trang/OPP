package Exercises_on_Classes_and_Instances_1.Kiem_Tra_1_Thangs_8;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 1;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo add(PhanSo ps) {
        PhanSo ps1;
        int a = (this.getTuSo() * ps.getMauSo()) + (ps.getTuSo() * this.getMauSo());
        int b = ps.getMauSo() * this.getMauSo();
        ps1 = new PhanSo(a, b);
        ps1.rutGonPhanSo();
        return ps1;
    }

    public PhanSo sub(PhanSo ps) {
        PhanSo ps1;
        int a = (this.getTuSo() * ps.getMauSo()) - (ps.getTuSo() * this.getMauSo());
        int b = ps.getMauSo() * this.getMauSo();
        ps1 = new PhanSo(a, b);
        ps1.rutGonPhanSo();
        return ps1;


    }

    public PhanSo mul(PhanSo ps) {
        PhanSo ps1;
        int a = ps.getTuSo() * this.getTuSo();
        int b = ps.getMauSo() * this.getMauSo();
        ps1 = new PhanSo(a, b);
        ps1.rutGonPhanSo();
        return ps1;
    }

    public PhanSo Div(PhanSo ps) {
        PhanSo ps1;
        int a = this.tuSo * ps.mauSo;
        int b = this.mauSo * ps.tuSo;
        ps1 = new PhanSo(a, b);
        ps1.rutGonPhanSo();
        return ps1;
    }

    public int UCLN(int a, int b) {
        if (a % b != 0) {
            return this.UCLN(b, a % b);
        } else
            return b;
    }

    public void rutGonPhanSo() {
        int uc = UCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / uc);
        this.setMauSo(this.getMauSo() / uc);
    }

    public void input(int tuSo, int mauSo) {
        Scanner scanner = new Scanner(System.in);
        try {
            tuSo = scanner.nextInt();
            mauSo = scanner.nextInt();
        } catch (Exception e) {
            if (mauSo == 0) {
                mauSo = 1;
            }
        }
    }

    public String toString() {
        return "phan so la: " + this.tuSo + "," + this.mauSo;
    }
}
