import static java.lang.Math.sqrt;

public class Bai24 {
    int a,b,c;
    double x, x1, x2;
    void nhap( int gta, int gtb, int gtc) {
        a = gta;
        b = gtb;
        c = gtc;
    }

    void tinh() {
        if ( a == 0) {
            if (b == 0) {
                if (c == 0 ) {
                    System.out.println("phương trình vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                x = (float) (-c) / b;
                System.out.println("phương trình có nghiệm là: " + x);
            }
        }
        else {
            if((b*b - 4*a*c) >= 0) {
                double dental;
                dental = Math.sqrt(b * b - 4 * a * c);
                x1 = (-b - dental)/2;
                x2 = (-b + dental)/2;
                System.out.println("phương trình có nghiệm là: " + x1 + " và " + x2);
            }
            else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }

    public static void main(String[] args) {
        Bai24 b24 =new Bai24();
        b24.nhap(2,5, 3);
        b24.tinh();
    }
}
