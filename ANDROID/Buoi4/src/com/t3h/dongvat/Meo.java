package com.t3h.dongvat;

public class Meo extends DongVat {
    public Meo(String ten, int tuoi, boolean gioiTinh, String loai) {
        super(ten, tuoi, gioiTinh, loai);
    }

    public void batChuot(){
        System.out.println("biết bắt chuột");
    }

    public void treoCay(){
        System.out.println("biết trèo cây");
    }
}
