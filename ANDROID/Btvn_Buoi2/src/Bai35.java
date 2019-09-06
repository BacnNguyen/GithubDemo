import java.util.Calendar;
import java.util.Date;

public class Bai35 {
    int namSinh;
    String ten;
    int tuoi;
    void nhap(String ten1, int namSinh1) {
        ten =ten1;
        namSinh = namSinh1;
    }

    void kiemTra () {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        tuoi = year - namSinh;
        System.out.println(tuoi);
    }

    public static void main(String[] args) {
        Bai35 b35 = new Bai35();
        b35.nhap("Hoa",1998);
        b35.kiemTra();
    }
}

