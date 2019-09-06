package com.t3h.dongvat;

public class Cho extends DongVat {
    private boolean domDuoi;
    private boolean huyenDe;

    public Cho(String ten, int tuoi, boolean gioiTinh, String loai, boolean domDuoi, boolean huyenDe) {
        super(ten, tuoi, gioiTinh, loai);
        this.domDuoi = domDuoi;
        this.huyenDe = huyenDe;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Đốm đuôi:  " + (domDuoi==true?"có":"không"));
        System.out.println("Huyền đề:  " + (huyenDe==true?"có":"không"));
    }

    public void coiNha() {
        System.out.println("sủa coi nhà");
    }

    public void boi() {
        System.out.println("biết bơi");
    }
}
