package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout2 extends JPanel implements MouseListener {
    public Layout2() {
        setLayout(null);
        setBackground(Color.BLACK);
        addMouseListener(this);
        Panel2 lefttop = new Panel2(0,0,120,120,"RED","lefttop");
        Panel2 top = new Panel2(240,0,120,120,"BLUE","top");
        Panel2 righttop = new Panel2(480,0,120,120,"RED","righttop");
        Panel2 left = new Panel2(0,240,120,120,"BLACK","left");
        Panel2 center = new Panel2(240,240,120,120,"GRAY","center");
        Panel2 right = new Panel2(480,240,120,120,"PINK","right");
        Panel2 leftbottom = new Panel2(0,480,120,120,"RED","leftbottom");
        Panel2 bottom = new Panel2(240,480,120,120,"YELLOW","bottom");
        Panel2 rightbottom = new Panel2(480,480,120,120,"RED","rightbottom");

        add(top);
        add(bottom);
        add(right);
        add(left);
        add(center);
        add(leftbottom);
        add(rightbottom);
        add(lefttop);
        add(righttop);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.GRAY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        setBackground(Color.RED);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.BLUE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.WHITE);
    }

}
