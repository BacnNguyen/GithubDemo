package com.t3h.bai1;

public class MyString {
    private String value;

    public MyString(String value) {
        this.value = value;
    }

    String str = value;
    int tongGiaTriDon;

    public void TongGiaTriDon(){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 65 ) {
                int valueI = (int) i;
                tongGiaTriDon += i;
            }
        }
        System.out.println("Tong Gia Tri Don: " + tongGiaTriDon);
    }

    public void TongGiaTriCacSo(){

    }
    public void KiemTraDoiXung(){

    }
}
