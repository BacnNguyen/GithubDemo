public class Bai13 {
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
            if( i % 2 == 0) {
                tong += tich;
                System.out.println("Giá trị của x + x^2 + ...+ x^2*n : " + tong);
            }
        }
    }

    public static void main(String[] args) {
        Bai13 b13 = new Bai13();
        b13.nhap(4,2);
        b13.tinhTich();
    }
}