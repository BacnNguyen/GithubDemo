package com.t3h.connguoi;

import com.t3h.dongvat.Meo;

public class NguoiMau extends ConNguoi {
    private int chieuCao;
    private int v1;
    private int v2;
    private int v3;
    private Meo meo;


    public NguoiMau(String ten, int tuoi, boolean gioiTinh, String diaChi, int chieuCao, int v1, int v2, int v3,  Meo meo) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.chieuCao = chieuCao;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.meo = meo;
    }
    public void datMeoDiDao() {
        System.out.println("dắt mèo đi dạo");
    }

    public void muaSam() {
        System.out.println("đi mua sắm");
    }

    @Override
    public void intThongTin() {
        super.intThongTin();
        System.out.println("Chiều cao: " + chieuCao);
        System.out.println("Vòng 1: " + v1);
        System.out.println("Vòng 2: " + v2);
        System.out.println("Vòng 3: " + v3);
        System.out.println("Thông tin mèo");
        meo.inThongTin();
        meo.batChuot();
        meo.treoCay();
    }
}
