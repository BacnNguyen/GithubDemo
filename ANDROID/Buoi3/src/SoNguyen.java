public class SoNguyen {
    int so;
    void nhap(int giaTriSo) {
        so = giaTriSo;
    }

    /**
     * Kiểm tra một số có phải một số nguyên tố hay không
     * @param
     * @return true là số nguyên tố
     *          false ko là số nguyên tố
     * */

    boolean kiemTra() {
        for (int i = 2; i < so ; i++) {
            if(so % i == 0){
                return false;
            }
        }
        return true;
    }

    void inKetQua() {
        boolean check = kiemTra();
        if(check==true) {
            System.out.println(so + " là số nguyên tố");
        } else {
            System.out.println(so + " là số ko nguyên tố");
        }
    }
}
