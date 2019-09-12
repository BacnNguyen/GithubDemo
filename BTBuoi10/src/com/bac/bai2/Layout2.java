package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout2 extends JPanel implements MouseListener {
    public Layout2() {
        setSize(GUI.W_FRAME,GUI.H_FRAME);
        setLayout(null);
        setBackground(Color.BLACK);
        addMouseListener(this);
        int size = (GUI.H_FRAME-40)/5;
        int size1 = GUI.W_FRAME/5-3;
        Panel2 lefttop = new Panel2(0,0,size1,size,"RED","lefttop");
        Panel2 top = new Panel2(2*size1,0,size1,size,"BLUE","top");
        Panel2 righttop = new Panel2(4*size1,0,size1,size,"RED","righttop");
        Panel2 left = new Panel2(0,2*size,size1,size,"BLACK","left");
        Panel2 center = new Panel2(2*size1,size*2,size1,size,"GRAY","center");
        Panel2 right = new Panel2(4*size1,2*size,size1,size,"PINK","right");
        Panel2 leftbottom = new Panel2(0,4*size,size1,size,"RED","leftbottom");
        Panel2 bottom = new Panel2(2*size1,4*size,size1,size,"YELLOW","bottom");
        Panel2 rightbottom = new Panel2(4*size1,4*size,size1,size,"RED","rightbottom");

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
