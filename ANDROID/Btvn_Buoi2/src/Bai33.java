public class Bai33 {
    int m;
    int n;
    void nhap( int gtm, int gtn) {
        n = gtn;
        m = gtm;
    }

    void in() {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++){
                if(i == 1 || j== 1 || i == m || j == n ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        Bai33 b33 = new Bai33();
        b33.nhap(4,8);
        b33.in();
    }
}
