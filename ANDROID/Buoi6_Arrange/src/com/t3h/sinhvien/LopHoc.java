package com.t3h.sinhvien;

import java.util.ArrayList;
import java.util.Comparator;

public class LopHoc {
    private ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
    public int check(String maSV){
        for (int i = 0; i <sinhVienArrayList.size() ; i++) {
            if(sinhVienArrayList.get(i).getMaSV().equals(maSV)) {
                return i;
            }
        }
        return -1;

    }

    public void add(SinhVien sinhVien){
        if(check(sinhVien.getMaSV()) == -1) {
            sinhVienArrayList.add(sinhVien);
        }
        else {
            System.out.println("đã tồn tại sinh viên");
        }
    }

    public void update(SinhVien sinhVien) {
        int index = check(sinhVien.getMaSV());
        if(index>=0){
            sinhVienArrayList.set(index,sinhVien);
        }
        else{
            System.out.println("không có sinh viên");
        }
    }
    public void delete(String maSV){
        int index = check(maSV);
        if(index>0) {
            sinhVienArrayList.remove(maSV);
        }
        else {
            System.out.println("Sinh viên không tồn tại");
        }
    }
    public void sapXep(){
        sinhVienArrayList.sort(sinhVienComparator);
    }

    private Comparator<SinhVien> sinhVienComparator = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien o1, SinhVien o2) {
            if(o1.getDiem()>o2.getDiem()){
                return 1;
            }
            return 0;
        }
    };

    public void in(){
        for (SinhVien sinhVien:sinhVienArrayList) {
            sinhVien.inThongTin();
            System.out.println("----------------");
        }
    }

}
