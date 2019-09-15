package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class GamePanel  extends JPanel {
    private ReadMap map;
    private   String path = "C:\\Users\\Admin\\Desktop\\Bac\\BTBuoi9\\BTBuoi11\\src\\com\\bac\\bai2\\mapTank\\map2.txt";
    public GamePanel() throws FileNotFoundException {
        setBackground(Color.BLUE);
        map= new ReadMap(path,30);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        map.draw(g2d);
    }
}
