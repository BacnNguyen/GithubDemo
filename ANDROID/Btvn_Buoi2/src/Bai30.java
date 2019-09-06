public class Bai30 {
    int n;
    void nhap(  int gtn) {
        n = gtn;
    }

    void in() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        Bai30 b30 = new Bai30();
        b30.nhap(4);
        b30.in();
    }
}
