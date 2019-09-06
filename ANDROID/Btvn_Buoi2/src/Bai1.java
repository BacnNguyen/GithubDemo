public class Bai1 {
    int n ;

    void nhap(int gtso) {
        n = gtso;
    }

    void tinh() {
        if (n > 3 && n < 50) {
            int tong;
            tong = (n*(n+1))/2;
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 3 và < 50: ");
        }
    }

    public static void main(String[] args) {
        Bai1 so = new Bai1();
        so.nhap(7);
        so.tinh();
    }
}