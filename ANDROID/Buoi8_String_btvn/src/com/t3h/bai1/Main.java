package com.t3h.bai1;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString("Lahah__la la___la lá lá lá 12 4");
        myString.tinhTongAscii();
        myString.xapXepTangTheoAscii();
        myString.inKyTuHoa();
        System.out.println();
        myString.kiemTraDoiXung();
        myString.vietHoaChuDau();
        myString.daoNguocChuoi();
        myString.tinhTongCacSoDon();
        myString.loaiBoDauCach();
        myString.xoaUnicode();
    }
}
