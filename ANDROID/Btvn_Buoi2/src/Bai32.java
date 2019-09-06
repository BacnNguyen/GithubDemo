public class Bai32 {
    int m;
    int n;
    void nhap( int gtm, int gtn) {
        n = gtn;
        m = gtm;
    }

    void in() {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        Bai32 b32 = new Bai32();
        b32.nhap(3,5);
        b32.in();
    }
}
