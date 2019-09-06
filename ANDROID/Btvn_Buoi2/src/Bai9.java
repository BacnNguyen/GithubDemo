public class Bai9 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTich() {
        if (n > 6) {
            double tich = 1;
            for (int i = 1; i < n; i++) {
                tich *= i;
            }
            System.out.println("Tích là: " + tich);
        } else {
            System.out.println("Nhập lại số n > 6: ");
        }
    }

    public static void main(String[] args) {
        Bai9 b9 = new Bai9();
        b9.nhap(10);
        b9.tinhTich();
    }
}
