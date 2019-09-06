public class Bai5 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n >= 2) {
            double tong = 0;
            for (int i = 1; i < n; i++) {
                tong += (1 / ((float)(2*i + 1)));
            }
            System.out.println("Tổng là: " + tong);
        } else {
            System.out.println("Nhập lại số n>2: ");
        }
    }

    public static void main(String[] args) {
        Bai5 b5 = new Bai5();
        b5.nhap(10);
        b5.tinhTong();
    }
}
