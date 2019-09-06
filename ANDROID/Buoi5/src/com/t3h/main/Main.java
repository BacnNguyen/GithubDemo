package com.t3h.main;

import com.t3h.hinhhoc.HinhChuNhat;
import com.t3h.hinhhoc.HinhHoc;
import com.t3h.hinhhoc.HinhTron;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
      /*  HinhTron ht = new HinhTron("hình tròn", 4f);
        HinhChuNhat hcn = new HinhChuNhat("hình chữ nhật", 2f,4f);
        ht.inThongTin();
        ht.tinhChuVi();
        ht.tinhDienTich();

        hcn.inThongTin();
        hcn.tinhChuVi();
        hcn.tinhDienTich();*/

      /*  Random rd = new Random();
        boolean v = rd.nextBoolean();
        HinhHoc hinhHoc;
        if( v == true ) {
             hinhHoc = new HinhTron("hình tròn", 5f);
        } else {
            hinhHoc = new HinhChuNhat("hình chữ nhật", 4f,2f);
        }
        hinhHoc.inThongTin();
        hinhHoc.tinhChuVi();
        hinhHoc.tinhDienTich();
        //ép kiểu
        boolean check = hinhHoc instanceof HinhTron;
        if( check == true) {
            HinhTron ht = (HinhTron) hinhHoc;
            ht.xoayTron();
        } else {
            HinhChuNhat hcn = (HinhChuNhat) hinhHoc;
            hcn.bienHinh();
        }*/

      int a = 3;
      HinhTron ht = new HinhTron("hình tròn", 5f);
      ht.inThongTin();
      ht.tinhDienTich();
      ht.tinhChuVi();
        System.out.println("----------------------");
        changValues(a,ht);
        System.out.println("giá trị a: " + a);
        ht.inThongTin();
        ht.tinhDienTich();
        ht.tinhChuVi();
    }

    private static void changValues(int a, HinhTron ht){
        a = 4; //nguyên thủy
       // tham chiếu : sẽ thay đổi giá trị tại lúc nó sử dụng
        ht.setBanKinh(10);
    }

}
