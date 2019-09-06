public class SinhVien {
    String ten;
    int tuoi;
    String gioiTinh;
    String lop;
    float diem;

    void nhap(String gtTen, int gtTuoi, String gtGioiTinh, String gtLop, float gtDiem) {
        ten = gtTen;
        tuoi = gtTuoi;
        gioiTinh = gtGioiTinh;
        lop = gtLop;
        diem = gtDiem;
    }

    void inThongTin(){
        System.out.println("tên: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioiTinh: " + gioiTinh);
        System.out.println("lop: " + lop);
        System.out.println("diem: " + diem);
    }
}
