package com.t3h.bai1;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString();
        myString.TongGiaTriDon();
        if(myString.KiemTraDoiXung()==1){
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi không đối xứng");
        }
        System.out.print("tổng các giá trị số: ");
        myString.TongGiaTriCacSo();
    }
}
