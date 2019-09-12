package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout1 extends JPanel implements MouseListener {

    public Layout1() {
        setLayout(null);
        setBackground(Color.BLACK);
        addMouseListener(this);
        Panel1 panelRed = new Panel1(50,20,60,40,"RED");
        Panel1 panelOrange = new Panel1(110,60,60,40,"ORANGE");
        Panel1 panelYellow = new Panel1(170,100,60,40,"YELLOW");
        Panel1 panelGreen = new Panel1(230,140,60,40,"GREEN");
        Panel1 panelBlue = new Panel1(170,180,60,40,"BLUE");
        Panel1 panelIndigo = new Panel1(110,220,60,40,"INDIGO");
        Panel1 panelViolet = new Panel1(50,260,60,40,"VIOLET");

        add(panelRed);
        add(panelOrange);
        add(panelYellow);
        add(panelGreen);
        add(panelBlue);
        add(panelIndigo);
        add(panelViolet);
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
