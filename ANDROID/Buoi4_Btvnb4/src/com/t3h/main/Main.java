package com.t3h.main;

import com.t3h.butve.ButDo;
import com.t3h.butve.ButXanh;
import com.t3h.hinh.TamGiac;
import com.t3h.hinh.Tron;
import com.t3h.hinh.Vuong;

public class Main {
    public static void main(String[] args) {
        ButDo butDo = new ButDo(20f,"long nhật");
        ButXanh butXanh = new ButXanh(15f,"lala");
        butDo.ve();
        System.out.println("-------------------");

        Vuong vuong = new Vuong(butDo);
        vuong.ve();
        System.out.println("-------------------");
        Tron tron = new Tron(butXanh);
        tron.ve();
        System.out.println("-------------------");
        TamGiac tg = new TamGiac(butDo);
        tg.ve();



    }

}
