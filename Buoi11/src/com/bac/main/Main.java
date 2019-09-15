package com.bac.main;

import com.bac.gui.TankFrame;

public class Main {
    public static void main(String[] args) {
        TankFrame tankFrame = new TankFrame();
        tankFrame.setVisible(true);
    }
}


/*
* Main thread là luồng chính thực hiện chương trình.được dùng để cập nhật giao diện người dùng và xử lí những logic nhanh gọn không
* mất nhiều thời gian
*
* Worker thread được sinh ra để thực hiện các công việc mất nhiều thời gian và hoạt động song song không liên quan đến main thread
* Sinh ra dựa trên main thread,
*
*
* */

/*
* Xu li va cham:
* coi rang cac doi tuong se duoc bao boi cac hinh chu nhat
* cac va cham se duoc xet bang su giao nhau cua cac hinh chu nhat
*
*
* */