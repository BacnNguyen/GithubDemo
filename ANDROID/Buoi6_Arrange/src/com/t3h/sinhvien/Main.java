package com.t3h.sinhvien;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
           SinhVien sv1 = new SinhVien("GCS1","tâm",13,"nam",7f);
           SinhVien sv2 = new SinhVien("GCS1","tâm1",13,"nam",7f);
           SinhVien sv3 = new SinhVien("GCS2","tâm1",13,"nam",7f);

           LopHoc lh = new LopHoc();
           lh.add(sv1);
           lh.add(sv2);
           lh.add(sv3);
           lh.in();
           lh.update(sv1);
        System.out.println(lh);
    }
}
