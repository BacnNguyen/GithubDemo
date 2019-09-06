public class Bai29 {
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
                if(i == h || j == i || j == 1) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Bai29 b29 = new Bai29();
        b29.nhap(8);
        b29.in();
    }
}
