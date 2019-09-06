public class Main {
    public static void main(String[] args) {
        HoatDong hd = new HoatDong();
        hd.nhap(5);
        hd.getHoatDong();

        hd.getHoatDongBySwitchCase();
        SoNguyen sn = new SoNguyen();
        sn.nhap(6);
        sn.inKetQua();

        KiemTraSoNguyenTo ktnt = new KiemTraSoNguyenTo();
        ktnt.nhap(100);
        ktnt.kiemtra();
    }
}
