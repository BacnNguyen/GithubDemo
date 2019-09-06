public class Bai15 {
    int n;
    void nhap(int gtso) {
        n = gtso;
    }

    void tinhTich() {
        int tich = 1;
        for(int i = 1; i <= n; i++){
            tich *= i;
        }
        System.out.println("Giai thừa từ 1 đến " + n + " là: " + tich);
    }
    public static void main(String[] args) {
        Bai15 b15 = new Bai15();
        b15.nhap(5);
        b15.tinhTich();
    }
}

