public class SinhVien extends ConNguoi {
    String maSinhVien;
    float diem;

    public SinhVien(String ten, int tuoi, Boolean gioiTinh, String diaChi, String sdt, String maSinhVien, float diem) {
        super(ten, tuoi, gioiTinh, diaChi, sdt);
        this.maSinhVien = maSinhVien;
        this.diem = diem;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm: " + diem);
    }
    /* String ten;
    int tuoi;
    boolean gioiTinh;

    public SinhVien(String ten, int tuoi, boolean gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh =gioiTinh;
    }

    public void inThongTin() {
        System.out.println("tên: " + ten);
        System.out.println("tuổi: " + tuoi);
        System.out.println("giới tính: " + (gioiTinh==true? "nam" : "nữ" ));
    }*/
/*
    class HocSinh {
        int tuoi = 15;
        public void soSanhTuoi() {
            if (SinhVien.this.tuoi > tuoi) {

            }
        }
        class ManNon {
            int tuoi = 3;
            public void soSanhTuoi() {

            }
        }
    }*/

}
