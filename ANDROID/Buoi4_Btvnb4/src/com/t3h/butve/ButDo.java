package com.t3h.butve;

public class ButDo extends ButVe {
    public ButDo(float giaTien, String thuongHieu) {
        super(giaTien, thuongHieu);
    }

    @Override
    public void ve() {
        System.out.println("màu đỏ");
        super.ve();
    }
}
