public class Bai8 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n > 5) {
            float tong = 0;
            for (int i = 2; i < n; i++) {
                tong += ((2*i + 1) / (float)( 2*i + 2));
            }
            System.out.println("Tổng là: " + tong);
        } else {
            System.out.println("Nhập lại số n > 5: ");
        }
    }

    public static void main(String[] args) {
        Bai8 b8 = new Bai8();
        b8.nhap(10);
        b8.tinhTong();
    }
}
