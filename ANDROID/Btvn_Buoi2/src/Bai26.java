public class Bai26 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }
    void kiemTra () {
        if (n > 0) {
            System.out.println("Số nguyên lẻ nhỏ hơn " + n + " là: ");
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i);
                }
            }
        } else {
            System.out.println("nhập lại với n > 0: ");
        }
    }

    public static void main(String[] args) {
        Bai26 b26 = new Bai26();
        b26.nhap(10);
        b26.kiemTra();
    }
}
