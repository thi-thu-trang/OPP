package chuong4.Chuong4_Bai1;

class NgoaiThanh extends ChuyenXe {

    private String NoiDen;
    private int SoNgay;

    public NgoaiThanh() {
        super();
        this.SoNgay = 0;
        this.NoiDen = "";
    }

    public NgoaiThanh(String ms, String ht, String sx, double dt, String nd, int sn) {

        super(ms, ht, sx, dt);
        this.SoNgay = sn;
        this.NoiDen = nd;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int soNgay) {
        SoNgay = soNgay;
    }

    public String toString() {
        return "Chuyen Xe Ngoai Thanh" + super.toString() + "\nNoi Den: " + this.NoiDen + "\nSo Ngay: " + this.SoNgay + "\nDoanh Thu: " + this.Doanhthu;
    }
}
