public class Bai4 { int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTong() {
        if (n >= 9) {
            double tong = 0;
            for (int i = 1; i < n; i++) {
                tong += (1/((float)2*i));
            }
            System.out.println("Tổng là: " + tong);
        } else {
            System.out.println("Nhập lại số n>9: ");
        }
    }

    public static void main(String[] args) {
        Bai4 b4 = new Bai4();
        b4.nhap(10);
        b4.tinhTong();
    }
}
