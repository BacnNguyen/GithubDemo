package com.bac.bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayGame extends JPanel implements MouseListener {
    public PlayGame() {
        setBackground(Color.BLUE);
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
        setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.BLUE);
    }
}
