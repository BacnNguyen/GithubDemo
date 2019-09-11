package com.bac.bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuPanel extends JPanel implements MouseListener {
    public MenuPanel() {
        setBackground(Color.RED);
        setBounds(0,0,Frame.W_FRAME,Frame.H_FRAME);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.PINK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.RED);
    }
}
