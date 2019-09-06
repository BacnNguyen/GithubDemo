package com.t3h.mammals;

public class Cat extends Mammals{
    private String khaNangNhinDem;

    public String getKhaNangNhinDem() {
        return khaNangNhinDem;
    }

    public void setKhaNangNhinDem(String khaNangNhinDem) {
        this.khaNangNhinDem = khaNangNhinDem;
    }

    public void Keu(){
        System.out.println("kêu meo meo");
    }

    public void BatChuot(){
        System.out.println("mèo bắt chuột");
    }

    public void SsBatChuot(){
        System.out.println("so sánh bắt chuột");
    }
}
