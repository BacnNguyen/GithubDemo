package com.t3h.sinhvien;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private float diem;

    public SinhVien(String maSV, String ten, int tuoi, String gioiTinh, float diem) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public void inThongTin() {
        System.out.println("Mã Sinh Viên: " + maSV);
        System.out.println("Tên: " + ten);
        System.out.println("tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Điểm: " + diem);
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public float getDiem() {
        return diem;
    }
}
