public class Bai25 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void kiemTra() {
        if ( (n % 4 == 0 && n % 100 != 0) || ( n % 100 == 0 && n % 400 == 0 ) ) {
            System.out.println(n + " là năm nhuận ");
        }
        else {
            System.out.println(n + " là năm không nhuận ");
        }

    }

    public static void main(String[] args) {
        Bai25 b25 = new Bai25();
        b25.nhap(2001);
        b25.kiemTra();
    }
}
