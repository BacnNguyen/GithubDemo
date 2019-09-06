package com.t3h.bai4;

public class DanhBa {
    private String ten;
    private String sdt;

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public DanhBa(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }
}
