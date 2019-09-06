package com.t3h.hinh;

import com.t3h.butve.ButVe;

public class Hinh {
    protected ButVe butve;

    public Hinh(ButVe butve) {
        this.butve = butve;
    }

    public void ve() {
        System.out.print("được vẽ bằng: ");
        butve.ve();
    }
}
