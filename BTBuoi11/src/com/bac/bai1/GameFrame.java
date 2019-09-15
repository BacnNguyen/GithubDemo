package com.bac.bai1;

import javax.swing.*;

public class GameFrame extends JFrame {
    public static final int W_FRAME = 800;
    public static final int H_FRAME = 800;

    public GameFrame(){
        setSize(W_FRAME,H_FRAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        GamePanel panel = new GamePanel();
        add(panel);
    }
}
