public class Bai10 {
    int n, x;
    void nhap(int gtn, int gtx) {
        n = gtn;
        x = gtx;
    }

    void tinhTich() {
        int tich = 1;
        for ( int i = 0; i < n; i++) {
            tich *= x;
        }
        System.out.println("Giá trị x^n : " + tich);
    }

    public static void main(String[] args) {
        Bai10 b10 = new Bai10();
        b10.nhap(4,2);
        b10.tinhTich();
    }
}
