package com.bac.gui;

import javax.swing.*;
import java.awt.*;

public class TankFrame extends JFrame {
    public static final  int W_FRAME =800;
    public static final  int H_FRAME = 600;

    public TankFrame() {
        setTitle("Tank 90");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(W_FRAME,H_FRAME);
        setResizable(false);
        setLocationRelativeTo(null);
        TankPanel panel = new TankPanel();
        add(panel);
    }
}
