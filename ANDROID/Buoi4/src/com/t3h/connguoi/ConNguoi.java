package com.t3h.connguoi;

public class ConNguoi {
    protected String ten;
    protected int tuoi;
    protected boolean gioiTinh;
    protected String diaChi;

    public ConNguoi(String ten, int tuoi, boolean gioiTinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void intThongTin(){
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính:  " + (gioiTinh==true?"nam":"nữ"));
        System.out.println("Địa Chỉ: " + diaChi);
    }
}
