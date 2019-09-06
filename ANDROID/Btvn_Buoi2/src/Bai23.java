public class Bai23 {
    int a,b;
    void nhap( int gta, int gtb) {
        a = gta;
        b = gtb;
    }

    void tinh() {
        if ( a == 0) {
            if (b == 0){
            System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            float x;
            x = (float)(-b) / a;
            System.out.println("phương trình có nghiệm là: " + x);
        }
    }

    public static void main(String[] args) {
        Bai23 b23 =new Bai23();
        b23.nhap(2,3);
        b23.tinh();
    }
}
