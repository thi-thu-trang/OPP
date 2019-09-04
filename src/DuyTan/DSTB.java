package DuyTan;

import java.util.ArrayList;

public class DSTB {

    ArrayList<ThueBao> list = new ArrayList();

    public void them(ThueBao tb) {
        list.add(tb);
    }

    public int xoa(String maTB) {
        String a = maTB;
        for (ThueBao tb : list) {
            if (tb.getMaTB().equals(a)) ;
            list.remove(tb);
        }
        return 0;
    }

    public double tongTienTBtraSau() {
        double a = 0;
        for (ThueBao tb : list)
            if (tb instanceof TBTraSau) {
                a = tb.tinhCuoc();// + tien khuyen mai TBTraSau;
            }
        return a;
    }

    public String HienThi() {
        String a = null;
        for (ThueBao tb : list) {
            a = a + tb.toString();
        }
        return a;
    }


}
