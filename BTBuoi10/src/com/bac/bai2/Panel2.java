package com.bac.bai2;

import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {
    private Color color;
    private String nameColor;
    private String position;
    private int x, y;

    public Panel2 (int x, int y, int w, int h, String color, String position) {
        setBounds(x, y, w, h);
        this.x = x;
        this.y = y;
        this.position = position;
        if (color.equals("RED")) this.color = Color.red;
        else if (color.equals("PINK")) this.color = Color.pink;
        else if (color.equals("YELLOW")) this.color = Color.yellow;
        else if (color.equals("GREEN")) this.color = Color.green;
        else if (color.equals("BLUE")) this.color = Color.blue;
        else if (color.equals("GRAY")) this.color = Color.GRAY;
        else this.color = new Color(247, 129, 243);
        setBackground(this.color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font(null, Font.BOLD, 15));
        g2d.setColor(Color.white);
        g2d.drawString(position, 30, 60);
    }
}
