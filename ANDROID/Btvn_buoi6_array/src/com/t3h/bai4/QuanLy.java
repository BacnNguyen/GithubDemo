package com.t3h.bai4;

import java.util.ArrayList;

public class QuanLy {
    private ArrayList<DanhBa> danhBaArrayList = new ArrayList<>();
    public int check(String sdt){
        for (int i = 0; i <danhBaArrayList.size() ; i++) {
            if(danhBaArrayList.get(i).getSdt().equals(sdt)) {
                return i;
            }
        }
        return -1;
    }

    public void add(String ten, String sdt){
        int check = check(sdt);
        if(check < 0 ) {
            DanhBa db = new DanhBa("an", "33333333");
            danhBaArrayList.add(db);
            System.out.println("đã thêm danh bạ thành công");
        }
        else {
            System.out.println("đã tồn số điện thoại");
        }
    }

    public void update(String sdt, String sdtMoi){
        for (int i = 0; i <  danhBaArrayList.size(); i++) {
            if(danhBaArrayList.get(i).getSdt().equals(sdt)){
                String gtTen = danhBaArrayList.get(i).getTen();
                DanhBa db = new DanhBa(gtTen, sdtMoi);
                danhBaArrayList.set(i, db);
                System.out.println("Đã sửa danh bạ thành công");
                break;
            }System.out.println("Danh bạ không tồn tại");
        }
    }


}
