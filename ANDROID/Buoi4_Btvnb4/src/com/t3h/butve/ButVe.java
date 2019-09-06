package com.t3h.butve;
public class ButVe {
    protected float giaTien;
    protected String thuongHieu;

    public ButVe(float giaTien, String thuongHieu) {
        this.giaTien = giaTien;
        this.thuongHieu = thuongHieu;
    }

    public void ve(){
        System.out.println("giá tiền: " + giaTien);
        System.out.println("thương hiệu: " + thuongHieu);
    }
}
