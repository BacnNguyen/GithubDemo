package com.t3h.hinh;

import com.t3h.butve.ButVe;

public class Tron extends Hinh {
    public Tron(ButVe butve) {
        super(butve);
    }

    @Override
    public void ve() {
        System.out.println("hình tròn");
        super.ve();
    }
}
