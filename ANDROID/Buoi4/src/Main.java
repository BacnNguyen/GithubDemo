public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("nguyen A", 13, true,
                "12 Nguyen Cong Tru ha noi", "03102123", "GCS17655", 4.2f);
        sv.inThongTin();
        System.out.println("Nhân viên========================");
        NhanVien nv = new NhanVien("hoa", 13, false, "12A cầu giấy",
                "012128391283", "nhân viên", "giáo viên", 13.2);
        nv.inThongTin();
    }
}
