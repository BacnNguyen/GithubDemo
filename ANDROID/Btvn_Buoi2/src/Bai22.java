public class Bai22 {
    int n, m, a = 0;

    void nhap(int gtn, int gtm) {
        n = gtn;
        m = gtm;

    }
    void inKetQua(){
        if (n < m) {
            for (int i = n; ; i++) {
                if (i % m == 0 && i % n == 0) {
                    a = i;
                    System.out.println("Bội chung nhỏ nhất của "+ m +" và "+n +" là: " + a);
                    break;
                }

            }
        } else {
            for (int i = m; ; i++) {
                if (i % m == 0 && i % n == 0) {
                    a = i;
                    System.out.println("Bội chung nhỏ nhất của "+ m +" và "+n +" là: " + a);
                    break;
                }   }
        }
    }
    public static void main(String[] args) {
        Bai22 so = new Bai22();
        so.nhap(4, 6);
        so.inKetQua();
    }
}