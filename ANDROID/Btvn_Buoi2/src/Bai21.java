public class Bai21 {
    int n, m, a = 0;

    void nhap(int gtn, int gtm) {
        n = gtn;
        m = gtm;
        if (n < m) {
            for (int i = 1; i * i <= m; i++) {
                if (m % i == 0 && n % i == 0) {
                    a= i;
                }
            }
        } else {
            for (int i = 1; i * i <= m; i++) {
                if (m % i == 0 && n % i == 0) {
                    a =i;
                }
            }
        }
        System.out.println("Ước chung lớn nhất của "+ m +" và "+n +" là: " + a);
    }
    public static void main(String[] args) {
        Bai21 so = new Bai21();
        so.nhap(16, 20);
    }
}