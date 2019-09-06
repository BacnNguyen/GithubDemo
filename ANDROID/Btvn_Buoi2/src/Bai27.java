public class Bai27 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void kiemTra () {
        if (n > 0) {
            System.out.println("Số nguyên lẻ nhỏ hơn " + n + " là: ");
            for (int i = 0; i < n; i++) {
                if( i == 7 || i == 21 || i ==41 ) {
                    i++;
                }
                if (i % 2 != 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("nhập lại với n > 0: ");
        }
    }

    public static void main(String[] args) {
        Bai27 b27 = new Bai27();
        b27.nhap(45);
        b27.kiemTra();
    }
}
