package com.t3h.main;

import com.t3h.connguoi.NguoiMau;
import com.t3h.connguoi.VanDongVien;
import com.t3h.dongvat.Cho;
import com.t3h.dongvat.Meo;

public class Main {
    public static void main(String[] args) {
        Cho c = new Cho("kiki", 13,true,"alaska",true,true);
        VanDongVien vdv = new VanDongVien("nguyễn A", 17, true, "123 nguyễn khang",
                13, "LALA", "Cầu thủ", c);
        vdv.intThongTin();
        vdv.datChoDiDao();

        Meo m = new Meo("kiki", 13,true,"mèo anh");
        NguoiMau nm = new NguoiMau("nguyễn A", 17, true, "123 nguyễn khang",
                180, 90, 60, 90, m);
        nm.intThongTin();
        nm.datMeoDiDao();
    }
}
