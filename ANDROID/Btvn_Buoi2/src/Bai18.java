public class Bai18 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void timUocSo() {
        int dem = 0;
        int tong = 0;
        int uocChan = 0;
        int uocLe = 0;
        System.out.print(" Các ước số của " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                System.out.print(i+", ");
                dem += 1;
                tong += i;
                if( i % 2 == 0) {
                    uocChan += i;
                }
                else {
                    uocLe = tong - uocChan;
                }
            }
        }
        System.out.println(" Tổng số các ước số của " + n + " là: " + dem);
        System.out.println("Tổng của số ước chẵn là : " + uocChan);
        System.out.println("Tổng của số ước lẻ là : " + uocLe);
    }

    public static void main(String[] args) {
        Bai18 b18 = new Bai18();
        b18.nhap(10);
        b18.timUocSo();
    }
}


