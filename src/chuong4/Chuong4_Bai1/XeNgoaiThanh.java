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

    public void nhap() {
        super.nhap();
        System.out.println('\t');
        System.out.println("Noi Den: ");
        System.out.println('\t');
        this.NoiDen = in.next();
        System.out.println('\t');
        System.out.println("So Ngay: ");
        this.SoNgay = in.nextInt();
    }

    public String toString() {
        return "Chuyen Xe Ngoai Thanh" + super.toString() + "\nNoi Den: " + this.NoiDen + "\nSo Ngay: " + this.SoNgay + "\nDoanh Thu: " + this.Doanhthu;
    }
}
