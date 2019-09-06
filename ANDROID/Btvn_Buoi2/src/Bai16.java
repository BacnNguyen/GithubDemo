public class Bai16 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void timUocSo() {
        System.out.print(" Các ước số của " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String[] args) {
        Bai16 b16 = new Bai16();
        b16.nhap(16);
        b16.timUocSo();
    }
}
