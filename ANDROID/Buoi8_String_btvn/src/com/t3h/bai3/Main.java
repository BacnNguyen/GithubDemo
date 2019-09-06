package com.t3h.bai3;
public class Main {
    public static void main(String[] args) {
        String numA = "12312312312111265549987435345576547352345234675";
        String numB = "2344234324234346345790438903489832784923743";
        System.out.println("CHuỗi A:" + numA);
        System.out.println("CHuỗi B:"+ numB);
        int a;
        if(numA.length()>numB.length()){
            a = numA.length()-numB.length();
            for (int i = 0; i < a; i++) {
                numB = 0 + numB;
            }
        }
        else {
            a = numB.length()-numA.length();
            for (int i = 0; i < a; i++) {
                numA = 0 + numA;
            }
        }
        String tong = "";
        String hieu = "";
        int nho = 0;
        int tam;
        System.out.println("tổng là: ");
        for (int i = numA.length()-1; i >=0 ; i--) {
            int gtria = Integer.parseInt(String.valueOf(numA.charAt(i)));
            int gtrib = Integer.parseInt(String.valueOf(numB.charAt(i)));
            if( gtria + gtrib + nho > 10) {
                nho = 1;
                tam = (gtria + gtrib) % 10 + nho;
            } else {
                nho = 0;
                tam = (gtria + gtrib) % 10 + nho;
            }
            tong = tam + tong;
        }
        System.out.println(tong);

        System.out.println("hiệu là: ");
        for (int i = numA.length()-1; i >=0 ; i--) {
            int gtria = Integer.parseInt(String.valueOf(numA.charAt(i)));
            int gtrib = Integer.parseInt(String.valueOf(numB.charAt(i)));
            if( gtria - (gtrib+nho) < 0) {
                gtria += 10;
                tam = gtria - (gtrib+nho);
            } else {
                nho = 0;
                tam = (gtria - gtrib);
            }
            hieu = tam + hieu;
        }
        System.out.println(hieu);


    }
}
