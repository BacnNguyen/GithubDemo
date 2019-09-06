package com.t3h.connguoi;

import com.t3h.dongvat.Cho;

public class VanDongVien extends ConNguoi {
    private int soAo;
    private String cauLacBo;
    private String viTri;
    private Cho cho;

    public VanDongVien(String ten, int tuoi, boolean gioiTinh, String diaChi, int soAo, String cauLacBo, String viTri, Cho cho) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.soAo = soAo;
        this.cauLacBo = cauLacBo;
        this.viTri = viTri;
        this.cho = cho;
    }

    public void datChoDiDao() {
        System.out.println("dắt chó đi dạo ở cv");
    }



    @Override
    public void intThongTin() {
        super.intThongTin();
        System.out.println("số áo: " + soAo);
        System.out.println("câu lạc bộ: " + cauLacBo);
        System.out.println("vị trí: " + viTri);
        System.out.println("Thông tin thú cưng");
        cho.inThongTin();
        cho.coiNha();
        cho.boi();
    }
}
