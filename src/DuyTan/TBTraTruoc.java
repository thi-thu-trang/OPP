package DuyTan;

public class TBTraTruoc extends ThueBao {

    private double tienNap;

    public TBTraTruoc(String maTB, String tenTB, double khuyenMai, double tienNap) {
        super(maTB, tenTB, khuyenMai);
        this.tienNap = tienNap;
    }

    public double getTienNap() {
        return tienNap;
    }

    public void setTienNap(double tienNap) {
        this.tienNap = tienNap;
    }

    @Override
    public String toString() {
        return "TBTraTruoc{" +
                "tienNap=" + tienNap +
                '}';
    }
}
