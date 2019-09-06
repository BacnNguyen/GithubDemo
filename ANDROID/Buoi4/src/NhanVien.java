public class NhanVien extends ConNguoi {
    String chucVu;
    String ngheNghep;
    Double luong;
    public NhanVien(String ten, int tuoi, Boolean gioiTinh, String diaChi, String sdt, String chucVu, String ngheNghep, double luong) {
        super(ten, tuoi, gioiTinh, diaChi, sdt);
        this.chucVu = chucVu;
        this.ngheNghep = ngheNghep;
        this.luong = luong;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("chức vụ: " + chucVu);
        System.out.println("Nghề nghiệp: " + ngheNghep);
        System.out.println("lương: " + luong);
    }
}
