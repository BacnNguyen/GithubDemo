public class Bai17 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void timUocSo() {
        int tong = 0;
        int tich = 1;
        System.out.print(" Các ước số của " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                System.out.print(i+", ");
                tong += i;
                tich *= i;
            }
        }
        System.out.println(" Tổng các ước số của " + n + " là: " + tong);
        System.out.println(" Tích các ước số của " + n + " là: " + tich);
    }

    public static void main(String[] args) {
        Bai17 b17 = new Bai17();
        b17.nhap(10);
        b17.timUocSo();
    }
}

