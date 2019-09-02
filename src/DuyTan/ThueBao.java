package DuyTan;

public class ThueBao implements IThueBao {
    private String maTB;
    private String tenTB;
    private double khuyenMai;

    public ThueBao() {

    }

    public ThueBao(String maTB, String tenTB, double khuyenMai) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.khuyenMai = khuyenMai;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "ThueBao{" +
                "maTB='" + maTB + '\'' +
                ", tenTB='" + tenTB + '\'' +
                ", khuyenMai=" + khuyenMai +
                '}';
    }

    @Override
    public double tinhCuoc() {
        return 0;
    }
}
