public class Bai14 {
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
            if( i % 2 != 0) {
                tong += tich;
                System.out.println("Giá trị của x^1 + x^3 ...+ x^(2*n+1) : " + tong);
            }
        }
    }

    public static void main(String[] args) {
        Bai14 b14 = new Bai14();
        b14.nhap(4,2);
        b14.tinhTich();
    }
}
