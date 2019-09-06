public class Bai2 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n > 5 && n < 20) {
            int tong = 0;
            for (int i = 0; i < n ; i++) {
                tong += i*2;
            }
            System.out.println("Tổng là: " + tong);
        }
    }

    public static void main(String[] args) {
        Bai2 b2 = new Bai2();
        b2.nhap(8);
        b2.tinhTong();
    }

}
