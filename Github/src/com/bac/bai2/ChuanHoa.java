package com.bac.bai2;

import java.util.Stack;

public class ChuanHoa {
    private String s;

    public ChuanHoa(String s){
        this.s = s;
    }

    public String chuyenDoi(){
        String s1 = s.replace("-+","-");
        s1 = s1.replace("+-","-");
        s1 = s1.replace("--","-0-");
        s1 = s1.replace("++","+0+");
        return s1;
    }
    // 3+4-5-6+9+1-0-4-23-10
//    public int tinhTong() {
//        String s1 = this.chuyenDoi();
//        int tong  = 0;String tmp;
//        char dau ='-';
//        int index1 = s1.indexOf("+");
//        int index2 = s1.indexOf("-");
////        System.out.println("index1 :"+index1+"/index2 :"+index2);
//        int index = 0;
//        if(index1>index2){
//            tmp = s1.substring(0,index2);
//            index = index2;
//            dau ='-';
//        }
//        else {
//            tmp = s1.substring(0,index1);
//            dau='+';
//            index = index1;
//        }
//
//        if(dau=='-'){
//            tong-=Integer.parseInt(tmp);
//        }
//        else tong+=Integer.parseInt(tmp);
////        System.out.println(index+"=="+tmp+"dau= :("+dau+")===Tong: "+tong);
//
//        while (index!=-1){
//            char dau1=dau;
//            index1 = s1.indexOf("+",index+1);
//            index2 = s1.indexOf("-",index+1);
////            System.out.println("index1 :"+index1+"/index2 :"+index2);
//            if(index1!=-1&&index2!=-1  ){
//                if(index1>index2) {
//                    dau = '-';
//                    tmp = s1.substring(index+1,index2);
//                    index = index2;
//                }
//                else {
//                    tmp = s1.substring(index+1,index1);
//                    index = index1;
//                    dau = '+';
//                }
//            }
//            else if(index1!=-1||index2!=-1){
//                if(index1!=-1) {
//                    tmp = s1.substring(index+1,index1);
//                    index = index1;
//                    dau='+';
//                }
//                else {
//                    tmp = s1.substring(index+1,index2);
//                    index = index2;
//                    dau='-';
//                }
//            }
//            else {
//                tmp = s1.substring(index+1);
//                index =-1;
//            }
//
//            //tinh tong
//            if(dau1=='+'){
//                tong+=Integer.parseInt(tmp);
//                dau1 = dau;
//            }
//            else {
//                tong-=Integer.parseInt(tmp);
//                dau1= dau;
//            }
////            System.out.println(index+"=="+tmp+"dau= :("+dau+")===Tong: "+tong);
//
//        }
//        return tong;
//    }

    public int tinhTong1(){
        int tong =0;
        String arr[] = s.split("\\+");
        for (int i = 0; i < arr.length; i++) {
            String arr1[] = arr[i].split("-");
            for (int j = 0; j <arr1.length ; j++) {
                if(j==0){
                    tong+=Integer.parseInt(arr1[j]);
                }
                else {
                    tong-=Integer.parseInt(arr1[j]);
                }
            }
        }
        return tong;
    }

}

