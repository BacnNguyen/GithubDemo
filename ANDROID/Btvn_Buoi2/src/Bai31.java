public class Bai31 {
    int h;
    void nhap(int gth){
        h = gth;
    }
    void in(){
        for(int i = 1; i <= h; i++ ) {
            for(int j = 1; j <= i; j++){
                if(i == h || j == 1 || i == j){
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
        Bai31 b31 = new Bai31();
        b31.nhap(4);
        b31.in();
    }
}
