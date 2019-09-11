package com.bac.bai2;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public static final  int W_FRAME =615;
    public static final  int H_FRAME = 635;

    public GUI() {
        setSize(W_FRAME,H_FRAME);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        Layout1 layout1 = new Layout1();
//        add(layout1);
        Layout2 layout2 = new Layout2();
        add(layout2);
    }
}
