package chuong4.Chuong4_Bai1;

public class ListChuyenXe {
    private ChuyenXe[] cx = new ChuyenXe[100000];
    private int count;
    private double tongnoi = 0, tongngoai = 0;

    public void ListCX() {
        count = 0;
        for (int i = 0; i < 100000; i++) {
            cx[i] = new ChuyenXe();
        }
    }

    public void Listcx(int temp) {
        if (temp == 1) {
            cx[count] = new NoiThanh();
            NoiThanh noit = new NoiThanh();
            noit.nhap();
            cx[count] = noit;
            tongnoi += noit.getDoanhthu();
        } else {
            cx[count] = new NgoaiThanh();
            NgoaiThanh ngoait = new NgoaiThanh();
            ngoait.nhap();
            cx[count] = ngoait;
            tongngoai += ngoait.getDoanhthu();
        }
        count++;
    }

    public void xuat() {
        for (int i = 0; i < count; i++) {
            System.out.println(cx[i].toString());
        }
        System.out.println("chuyen xe noi thanh: " + tongnoi);
        System.out.println("chuyen xe ngoai thanh: " + tongngoai);
    }
}
