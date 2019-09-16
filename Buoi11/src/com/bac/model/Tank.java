package com.bac.model;

import com.bac.gui.TankFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tank {

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    protected int x;
    protected int y;
    protected Image[] images;
    protected int orient;
    protected int speed = 1;
    private long time;

    public Tank(int x, int y, int orient) {
        this.x = x;
        this.y = y;
        this.orient = orient;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(images[orient], x, y, null);
    }

    public void drawRect(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.blue);
        g2d.drawRect(x,y,images[orient].getWidth(null),images[orient].getHeight(null));
    }

    public void move(ArrayList<Brick> arr) {
        int xR = x;
        int yR = y;
        switch (orient) {
            case LEFT:
                x -= speed;
                break;
            case RIGHT:
                x += speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
        }
        if (x <= 0 || x >= TankFrame.W_FRAME - images[orient].getWidth(null)-10){
            x= xR;
        }
        if( y <= 0 || y >= TankFrame.H_FRAME - images[orient].getHeight(null)-35) {
            y=yR;
        }
        boolean check = checkTouch(arr);
            if(check) {
                int result = JOptionPane.showConfirmDialog(null, "Continue?", "Touch", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.NO_OPTION) System.exit(0);
            }
    }

    public void fire(ArrayList<Bullet> arr){

        //thoi gian delay
        long T = System.currentTimeMillis();
        if(T-time<500){
            return;
        }
        time = T;
        int xB = x + images[orient].getWidth(null)/2;
        int yB = y + images[orient].getHeight(null)/2;

        Bullet b = new Bullet(xB,yB,orient);
        arr.add(b);
    }

    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,
                images[orient].getWidth(null),
                images[orient].getHeight(null));
        return rect;
    }

    public boolean checkDie(ArrayList<Bullet> arr){
        for (int i = 0; i < arr.size(); i++) {
            Rectangle rect = getRect().intersection(arr.get(i).getRect());
            if(rect.isEmpty()==false){
                arr.remove(i);
                return true;
            }
        }
        return false;
    }


    public boolean checkTouch(ArrayList<Brick> arr){
        for (Brick b :arr) {
            Rectangle rect = this.getRect().intersection(b.getRect());
            if(rect.isEmpty()) return true;
        }
        return false;
    }
}
