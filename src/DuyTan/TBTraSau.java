package DuyTan;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class TBTraSau extends ThueBao {

    private int soTinNhan;
    private int soCuocgoi;
    private double phiTinNhan;
    private double phiCuocGoi;
    private Date ngayTB;


    public TBTraSau(String maTB, String tenTB, double khuyenMai, int soTinNhan, int soCuocgoi, double phiTinNhan, double phiCuocGoi, Date ngayTB) {
        super(maTB, tenTB, khuyenMai);
        this.soTinNhan = soTinNhan;
        this.soCuocgoi = soCuocgoi;
        this.phiTinNhan = phiTinNhan;
        this.phiCuocGoi = phiCuocGoi;
        this.ngayTB = ngayTB;
    }

    public int getSoTinNhan() {
        return soTinNhan;
    }

    public void setSoTinNhan(int soTinNhan) {
        this.soTinNhan = soTinNhan;
    }

    public int getSoCuocgoi() {
        return soCuocgoi;
    }

    public void setSoCuocgoi(int soCuocgoi) {
        this.soCuocgoi = soCuocgoi;
    }

    public double getPhiTinNhan() {
        return phiTinNhan;
    }

    public void setPhiTinNhan(double phiTinNhan) {
        this.phiTinNhan = phiTinNhan;
    }

    public double getPhiCuocGoi() {
        return phiCuocGoi;
    }

    public void setPhiCuocGoi(double phiCuocGoi) {
        this.phiCuocGoi = phiCuocGoi;
    }

    public Period getNgayTB() {
        LocalDate DateNow = LocalDate.of(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
        LocalDate Datesd = LocalDate.of(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
        Period ngayTB = Period.between(Datesd, DateNow);
        return ngayTB;
    }

    public void setNgayTB(Date tb) {
        this.ngayTB = tb;
    }

    @Override
    public String toString() {
        return "TBTraSau{" +
                "soTinNhan=" + soTinNhan +
                ", soCuocgoi=" + soCuocgoi +
                ", phiTinNhan=" + phiTinNhan +
                ", phiCuocGoi=" + phiCuocGoi +
                ", ngayTB=" + ngayTB +
                '}';
    }

    @Override
    public double tinhCuoc() {
        double TC = this.soTinNhan * this.phiTinNhan + this.soCuocgoi * this.phiCuocGoi;
        return TC;
    }
   /*
    @Override
    public double getKhuyenMai() {
      //   khuyenmai*ngayTb
        double v;
        v = getNgayTB() * setKhuyenMai();
        return v;
    }


    */


}

