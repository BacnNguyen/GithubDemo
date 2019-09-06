package com.t3h.main;

import com.t3h.quanli.Chi;
import com.t3h.quanli.No;
import com.t3h.quanli.Thu;
import com.t3h.quanli.Vay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Chi chi = new Chi();
        Chi chi1 = new Chi();
        chi1.setSoTien(4000f);
        System.out.println("báo cáo khoản chi trong tuần");
        chi.setThoiGian("20/03/2016");
        chi.setDiaDiem("Lớp LAND0602E");
        chi.setSoTien(300000f);
        chi.setLyDo("mua đồ sinh nhật các bạn ");
        chi.setNguoiThuHuong("Lớp LAND0602E");

        System.out.println("STT: 1");
        System.out.println("Thời gian: " + chi.getThoiGian());
        System.out.println("Địa điểm: " + chi.getDiaDiem());
        System.out.println("Số tiền đã chi: " + chi.getSoTien());
        System.out.println("Lý do chi : " + chi.getLyDo());
        System.out.println("Người thụ hưởng : " + chi.getNguoiThuHuong());
        float a =chi.getSoTien() + chi1.getSoTien();
        System.out.println("tổng tiền chi: " + a);

        System.out.println("----------------------------");

        Thu thu = new Thu();
        System.out.println("báo cáo khoản thu trong tuần");
        thu.setThoiGian("19/03/2016");
        thu.setDiaDiem("Cty FPT");
        thu.setSoTien(5000000f);
        thu.setLyDo("Lương tháng 3 ");
        thu.setNguoiThuHuong("Tôi");

        System.out.println("STT: 1");
        System.out.println("Thời gian: " + thu.getThoiGian());
        System.out.println("Địa điểm: " + thu.getDiaDiem());
        System.out.println("Số tiền đã thu: " + thu.getSoTien());
        System.out.println("Lý do thu : " + thu.getLyDo());
        System.out.println("Người thụ hưởng : " + thu.getNguoiThuHuong());

        System.out.println("------------------------------");
        Vay vay = new Vay();
        System.out.println("báo cáo khoản vay trong tuần");
        vay.setThoiGian("12/03/2016");
        vay.setDiaDiem("Nhà riêng");
        vay.setSoTien(1000000f);
        vay.setLyDo("Vay mua tủ lạnh");
        vay.setNguoiVay("Chị Hồng");
        vay.setThoiHanVay("7 ngày");
        vay.setLaiSuat(0f);
        vay.setNgayTra("12/08/2016");
        vay.setXacNhanTra(false);

        System.out.println("STT: 1");
        System.out.println("Thời gian: " + vay.getThoiGian());
        System.out.println("Địa điểm: " + vay.getDiaDiem());
        System.out.println("Số tiền đã vay: " + vay.getSoTien());
        System.out.println("Lý do vay : " + vay.getLyDo());
        System.out.println("Người vay : " + vay.getNguoiVay());
        System.out.println("Thời hạn vay : " + vay.getThoiHanVay());
        System.out.println("Lãi suất : " + vay.getLaiSuat());
        System.out.println("Ngày trả : " + vay.getNgayTra());
        boolean tra = vay.getXacNhanTra();
        System.out.println("xác nhận trả: " + (tra == true ? "đã trả" : "chưa trả") );

        System.out.println("------------------------------");
        No no = new No();
        System.out.println("báo cáo khoản nợ trong tuần");
        no.setThoiGian("18/03/2016");
        no.setDiaDiem("Ngân Hàng");
        no.setSoTien(1000000f);
        no.setLyDo("Vay mua máy giặt");
        no.setNguoiVay("Tôi");
        no.setThoiHanVay("60 ngày");
        no.setLaiSuat(1000f);
        no.setNgayTra("18/05/2016");
        no.setXacNhanTra(false);

        System.out.println("STT: 1");
        System.out.println("Thời gian: " + no.getThoiGian());
        System.out.println("Địa điểm: " + no.getDiaDiem());
        System.out.println("Số tiền đã vay: " + no.getSoTien());
        System.out.println("Lý do vay : " + no.getLyDo());
        System.out.println("Người vay : " + no.getNguoiVay());
        System.out.println("Thời hạn vay : " + no.getThoiHanVay());
        System.out.println("Lãi suất : " + no.getLaiSuat());
        System.out.println("Ngày trả : " + no.getNgayTra());
        boolean tra1 = no.getXacNhanTra();
        System.out.println("xác nhận trả: " + (tra == true ? "đã trả" : "chưa trả") );




    }
}
