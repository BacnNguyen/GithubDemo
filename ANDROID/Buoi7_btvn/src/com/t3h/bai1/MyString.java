package com.t3h.bai1;

public class MyString {
   /* private String value;

    public MyString(String value) {
        this.value = value;
    }*/

    String str = "15a8ndr01oi12d";
    int tongGiaTriDon;

    public void TongGiaTriDon(){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 65 ) {
                tongGiaTriDon += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Chuỗi ban đầu: " +str);
        System.out.println("Tong Gia Tri Don: " + tongGiaTriDon);
    }

    public void TongGiaTriCacSo(){
        int tongGiaTriCacSo = 0;
        int temp = 0;
        int so = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 65) {
                temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                so = so* 10 + temp;
            }
            else {
                tongGiaTriCacSo +=so;
                so = 0;
            }
        }
        System.out.println(tongGiaTriCacSo);
    }

    public int KiemTraDoiXung(){
        for (int i = 0; i <str.length()*0.5 ; i++) {
            for (int j = str.length()-1; j > str.length()*0.5 ; j--) {
                if(str.charAt(i) == str.charAt(j)){
                    return 0;
                }
            }
        }
        return 1;

    }

}
