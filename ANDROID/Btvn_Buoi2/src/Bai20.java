public class Bai20 {
    int n;
    void nhap( int gtn) {
        n = gtn;
    }

    boolean kiemTra(){
        for (int i = 0; i < n; i++) {
            if(i*i == n ){
                return true;
            }

        }
        return false;
    }

    void inKetQua() {
        boolean check = kiemTra();
        if(check == true) {
            System.out.println(n + " là số chính phương");
        }
        else {
            System.out.println(n + " không là số chính phương");
        }
    }

    public static void main(String[] args) {
        Bai20 b20 = new Bai20();
        b20.nhap(16);
        b20.inKetQua();
    }
}
