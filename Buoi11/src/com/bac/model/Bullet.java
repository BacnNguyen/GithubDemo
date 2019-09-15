package com.bac.model;

import com.bac.gui.TankFrame;
import com.bac.until.ImagesLoader;
import com.sun.deploy.ui.ImageLoader;

import java.awt.*;

public class Bullet {
    private int x,y,orient;

    private Image img = ImagesLoader.getImage("bullet.png",getClass());

    public Bullet(int x, int y, int orient) {
        this.x = x-img.getWidth(null)/2;
        this.y = y-img.getHeight(null)/2;
        this.orient = orient;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(img,x,y,null);
    }


    //kiem tra xem dan da ra ngoai man hinh chua
    boolean move(){
        switch (orient){
            case Tank.LEFT:
                x-=2;
                break;
            case Tank.RIGHT:
                x+=2;
                break;
            case Tank.UP:
                y-=2;
                break;
            case Tank.DOWN:
                y+=2;
                break;
        }
        if(x<0||x>TankFrame.W_FRAME||y<0||y>TankFrame.H_FRAME) return false;
        else return true;
    }


    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,img.getWidth(null),img.getHeight(null));
        return rect;
    }
}
