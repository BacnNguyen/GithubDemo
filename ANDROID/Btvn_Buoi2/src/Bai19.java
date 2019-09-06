public class Bai19 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }

    boolean kiemTra(){
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                   return false;
                }
            }
            return true;
        }

    void inKetQua(){
        boolean check = kiemTra();
        if (check==false){
            System.out.println(n + " không là số nguyên tố");
        } else {
            System.out.println(n + " là số nguyên tố");
        }
        }

    public static void main(String[] args) {
        Bai19 b19 = new Bai19();
        b19.nhap(8);
        b19.inKetQua();
    }
}
