package com.bac.model;

import javax.swing.*;
import java.awt.*;

public class Brick {
    private int x=0;
    private int y=0;
    private int size=0;
    private Image img= new ImageIcon(getClass().getResource("/images/brick.png")).getImage();

    public Brick(int x, int y,int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void showXY(){
        System.out.println(x+":"+y);
    }

    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,img.getWidth(null),img.getHeight(null));
        return rect;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(img,x*size,y*size,size,size,null);
    }

    public void drawRect(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(x*size,y*size,size,size);
    }

}
