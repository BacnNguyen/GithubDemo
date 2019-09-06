package com.t3h.hinh;

import com.t3h.butve.ButVe;

public class Vuong extends Hinh{
    public Vuong(ButVe butve) {
        super(butve);
    }

    @Override
    public void ve() {
        System.out.println("Hình vuông");
        super.ve();
    }
}
