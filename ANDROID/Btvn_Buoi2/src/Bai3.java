public class Bai3 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n >= 7) {
            double tong = 0;
            for (int i = 1; i < n; i++) {
                tong += (1/(float)i);
            }
            System.out.println("Tổng là: " + tong);
        } else {
            System.out.println("Nhập lại số n>7: ");
        }
    }

    public static void main(String[] args) {
        Bai3 b3 = new Bai3();
        b3.nhap(10);
        b3.tinhTong();
    }
}
