package com.t3h.hinh;

import com.t3h.butve.ButVe;

public class TamGiac extends Hinh {
    public TamGiac(ButVe butve) {
        super(butve);
    }

    @Override
    public void ve() {
        System.out.println("hình tam giác");
        super.ve();
    }
}
