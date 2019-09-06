package com.t3h.dongvat;

public class DongVat {
    protected String ten;
    protected int tuoi;
    protected boolean gioiTinh;
    protected String loai;

    public DongVat(String ten, int tuoi, boolean gioiTinh, String loai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loai = loai;
    }

    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + (gioiTinh == true?"đực":"cái"));
        System.out.println("Loài: " + loai);
    }
}
