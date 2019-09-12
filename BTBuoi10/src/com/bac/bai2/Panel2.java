package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class Panel2 extends JPanel {
    private Color color;
    private String nameColor;
    private String position;
    private int x, y,w,h;

    public Panel2 (int x, int y, int w, int h, String color, String position) {
        setBounds(x, y, w, h);
        setLayout(null);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
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

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void draw(Graphics2D g2d){
        int fontSize = 15;
        Font f = new Font(null,Font.BOLD,fontSize);
        FontRenderContext context = g2d.getFontRenderContext();
        TextLayout txt = new TextLayout(position,f,context);
        Rectangle2D bounds = txt.getBounds();
        int xString = (int) (getW()-bounds.getWidth())/2;
        int yString = (int) (getH()+bounds.getHeight())/2;

        g2d.setFont(f);
        g2d.drawString(position,xString,yString);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        draw(g2d);
    }
}
