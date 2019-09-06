public class Bai7 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n >= 1) {
            float tong = 0;
            for (int i = 2; i < n; i++) {
                tong += (i / (float)(i + 1));
            }
            System.out.println("Tổng là: " + tong);
        } else {
            System.out.println("Nhập lại số n > 1: ");
        }
    }

    public static void main(String[] args) {
        Bai7 b7 = new Bai7();
        b7.nhap(10);
        b7.tinhTong();
    }
}
