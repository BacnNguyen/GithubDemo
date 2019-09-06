package com.t3h.quanli;

import java.util.Date;

public class No extends ThongTinDichVu {
    private boolean xacNhanTra;
    private String nguoiVay;
    private String thoiHanVay;
    private float laiSuat;
    private String ngayTra;

    public boolean getXacNhanTra() {
        return xacNhanTra;
    }

    public void setXacNhanTra(boolean xacNhanTra) {
        this.xacNhanTra = xacNhanTra;
    }

    public String getNguoiVay() {
        return nguoiVay;
    }

    public void setNguoiVay(String nguoiVay) {
        this.nguoiVay = nguoiVay;
    }

    public String getThoiHanVay() {
        return thoiHanVay;
    }

    public void setThoiHanVay(String thoiHanVay) {
        this.thoiHanVay = thoiHanVay;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
}
