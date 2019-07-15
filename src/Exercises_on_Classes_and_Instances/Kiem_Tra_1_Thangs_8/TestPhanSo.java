package Exercises_on_Classes_and_Instances.Kiem_Tra_1_Thangs_8;

public class TestPhanSo {
    /*
    public static void input(int tuSo,int mauSo){
        Scanner scanner = new Scanner(System.in);
        try{
            tuSo = scanner.nextInt();
            mauSo = scanner.nextInt();
        }
        catch (Exception e){
            if(mauSo == 0){
                mauSo = 1;
            }
        }
    }

     */
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1, 2);
        System.out.println(ps1);
        System.out.println(ps1.add(new PhanSo(3, 4)));
        System.out.println(ps1.mul(new PhanSo(3, 4)));
        System.out.println(ps1.sub(new PhanSo(3, 4)));
        System.out.println(ps1.Div(new PhanSo(3, 4)));
    }
}
