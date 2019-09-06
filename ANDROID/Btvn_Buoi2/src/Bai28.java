public class Bai28 {
    int h;
    void nhap(  int gtn) {
        h = gtn;
    }

    void in() {
        for (int i = 1; i <= h; i++) {
            for (int k = i; k < h ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        Bai28 b28 = new Bai28();
        b28.nhap(10);
        b28.in();
    }
}
