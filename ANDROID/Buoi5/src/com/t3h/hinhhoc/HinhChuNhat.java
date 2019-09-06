package com.t3h.hinhhoc;

public class HinhChuNhat extends HinhHoc {
    private float chieuDai;
    private float chieuRong;


    public HinhChuNhat(String tenHinh, float chieuDai, float chieuRong) {
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void bienHinh() {
        System.out.println("biến thành hình vuông");
    }
//abstract class bắt buộc thằng con phải override
    @Override
    public void tinhChuVi() {
        float chuVi = (chieuDai + chieuRong) *2;
        System.out.println("Chu vi: " + chuVi);
    }

    @Override
    public void tinhDienTich() {
        float dienTich = chieuDai * chieuRong;
        System.out.println("diện tích: " + dienTich);

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("chiều dài: " + chieuDai);
        System.out.println("chiều rộng: " + chieuRong);
    }
}
