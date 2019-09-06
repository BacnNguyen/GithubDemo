public class Bai11 {
    int n;
    void nhap(int gtn) {
        n = gtn;
    }

    void tinhTich() {
        int tich = 1;
        int tong = 0;
        for ( int i = 0; i < n; i++) {
            tich += (tich * i);
            tong += tich;
        }
        System.out.println("Giá trị tổng của : 1 + 1.2 + 1.2.3 +...+ 1.2.n là : " + tong);
    }

    public static void main(String[] args) {
        Bai11 b11 = new Bai11();
        b11.nhap(3);
        b11.tinhTich();
    }
}