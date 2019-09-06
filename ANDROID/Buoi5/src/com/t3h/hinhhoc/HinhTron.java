package com.t3h.hinhhoc;

public class HinhTron extends HinhHoc {
    private float banKinh;
    private final float PI = 3.14f; // tất cả các chứ cái viết hoa, phân cách bằng _


    public HinhTron(String tenHinh, float banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }
    public void xoayTron(){
        System.out.println("Xoay tròn");
    }

    @Override
    //supper là gọi đến định nghĩa, các công thức trong thân, mà abstract ko có
    public void tinhChuVi() {
        float chuVi = 2 * PI * banKinh;
        System.out.println("chu vi: " + chuVi);
    }

    @Override
    public void tinhDienTich() {
        float dienTich = PI * banKinh * banKinh;
        System.out.println("diện tích: " + dienTich);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("bán kính hình tròn: " + banKinh);
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
}

