package com.bac.bai2;


import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GameFrame extends JFrame {
        public static final int W_FRAME = 800;
        public static final int H_FRAME =820;

    public GameFrame() throws IOException {
//            Image img =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/com/bac/image/tower.png"));
//            this.setIconImage(img);
            setSize(W_FRAME,H_FRAME);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Tank Game");
            setResizable(false);
            setLocationRelativeTo(null);
            GamePanel panel = new GamePanel();
            add(panel);
    }
}
