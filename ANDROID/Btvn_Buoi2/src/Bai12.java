public class Bai12 {
    int n, x;
    void nhap(int gtn, int gtx) {
        n = gtn;
        x = gtx;
    }

    void tinhTich() {
        int tich = 1;
        int tong = 0;
        for ( int i = 1; i <= n; i++) {
            tich *= x;
            tong += tich;
        }
        System.out.println("Giá trị của x + x^1 + ...+ x^n : " + tong);
    }

    public static void main(String[] args) {
        Bai12 b12 = new Bai12();
        b12.nhap(4,2);
        b12.tinhTich();
    }
}