package com.t3h.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public void tinhTongAscii(){
        int tong = 0;
        for (int i = 0; i <str.length() ; i++) {
            int giatri = (int) str.charAt(i);
            tong += giatri;
        }
        System.out.println("Tổng mã ASCII của các ký tự có trong chuỗi: " + tong);
    }

    public void xapXepTangTheoAscii(){
        System.out.println("Tăng theo ascii: ");
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            arr.add(str.charAt(i));
        }
        Collections.sort(arr);
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }

    public void inKyTuHoa(){
        System.out.println();
        System.out.println("Các ký tự in hoa có trong chuỗi: " );
        for (int i = 0; i <str.length() ; i++) {
            if((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90){
                System.out.print(str.charAt(i) + "\t");
            }
        }
    }

    public void kiemTraDoiXung(){
        StringBuilder daoNguoc = new StringBuilder();
        daoNguoc.append(str);
        daoNguoc = daoNguoc.reverse();

        if(str.equals(daoNguoc) == true){
            System.out.println("Chuỗi là chuỗi đối xứng");
        }
        else {
            System.out.println("chuỗi không đối xứng");
        }

    }

    public void vietHoaChuDau(){
        int index = str.indexOf(" ");
        while (index != -1){
            String chuoiCon = str.substring(index, index+2);
            str = str.replace(chuoiCon, chuoiCon.toUpperCase());
            index = str.indexOf(" ", index+1);
        }
        System.out.println("Chuỗi viết hoa chữ cái đầu: "+ str);
    }

    public void daoNguocChuoi(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println("Chuỗi đảo ngược: " +  stringBuilder.reverse());
    }

    int tongGiaTriDon;
    public void tinhTongCacSoDon(){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 57 && str.charAt(i) > 48) {
                tongGiaTriDon += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Chuỗi ban đầu: " +str);
        System.out.println("Tong Gia Tri Don: " + tongGiaTriDon);

    }

    public void tongCacGiaTriSo(){
        int tongGiaTriCacSo = 0;
        int temp = 0;
        int so = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 57 && str.charAt(i) > 48) {
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

    public void loaiBoDauCach(){
        System.out.println("Chuỗi sau khi loại bỏ dấu gạch: ");
        String [] arr = str.split("_");
        for (String s: arr) {
            System.out.print(s);
        }
    }

    public void xoaUnicode() {
        String[] mangA = new String[] { "a", "á", "à", "ạ", "ả", "ắ", "ằ", "ặ", "ẳ", "ẵ", "ấ", "ầ", "ậ", "ẩ", "ẫ" };
        String[] mangE = new String[] { "e", "é", "è", "ẹ", "ẻ", "ẽ", "ê", "ế", "ề", "ệ", "ể", "ễ" };
        String[] mangO = new String[] { "o", "ó", "ò", "ọ", "ỏ", "ô", "ố", "ổ", "ồ", "ộ","ơ","ớ","ở","ờ", "ợ"};
        String[] mangU = new String[] { "u", "ú", "ù", "ụ", "ủ", "ũ", "ư", "ứ", "ừ", "ự", "ử", "ữ" };
        String[] mangI = new String[] { "i", "í", "ì", "ị", "ỉ", "ĩ"};
        for (int i = 0; i< mangA.length;i++){
            str = str.replace(mangA[i], mangA[0]);
        }
        for (int i = 0; i< mangE.length;i++){
            str = str.replace(mangE[i], mangE[0]);
        }
        for (int i = 0; i< mangO.length;i++){
            str = str.replace(mangO[i], mangE[0]);
        }
        for (int i = 0; i< mangU.length;i++){
            str = str.replace(mangE[i], mangE[0]);
        }
        for (int i = 0; i< mangI.length;i++){
            str = str.replace(mangI[i], mangE[0]);
        }
        System.out.println("Chuỗi unicode: " + str);
    }
}
