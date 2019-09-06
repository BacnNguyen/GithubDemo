public class Bai6 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n >= 3) {
            float tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += 1 / ( (float)(i * (i + 1) ));
                System.out.println("Tổng là: " + tong);
            }
        } else {
            System.out.println("Nhập lại số n>6: ");
        }
    }

    public static void main(String[] args) {
        Bai6 b6 = new Bai6();
        b6.nhap(3);
        b6.tinhTong();
    }
}
