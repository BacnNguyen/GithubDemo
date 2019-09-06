package com.t3h.butve;
public class ButXanh extends ButVe {

    public ButXanh(float giaTien, String thuongHieu) {
        super(giaTien, thuongHieu);
    }

    @Override
    public void ve() {
        System.out.println("màu xanh");
        super.ve();
    }
}
