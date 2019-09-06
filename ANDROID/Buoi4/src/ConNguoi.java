public class ConNguoi {
    String ten;
    int tuoi;
    Boolean gioiTinh;
    String diaChi;
    String sdt;

    public ConNguoi(String ten, int tuoi, Boolean gioiTinh, String diaChi, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.sdt =sdt;
    }
    void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính:  " + gioiTinh);
        System.out.println("sdt: " + sdt);
        System.out.println("Địa Chỉ: " + diaChi);
}
}
