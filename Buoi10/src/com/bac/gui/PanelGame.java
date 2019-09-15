package com.bac.gui;

import javax.swing.*;
import java.awt.*;

public class PanelGame extends JPanel {
    public PanelGame() {
        setBackground(Color.CYAN);
//        setLocation(401,0);
//        setSize(400,600);
        setBounds(MyFrame.W_FRAME/3+1,0,(MyFrame.W_FRAME/3*2),MyFrame.H_FRAME);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(50));
        g2d.drawLine(300,0,300,600);

        g2d.drawOval(150,150,300,300);

        g2d.setFont(new Font("Times New Roman",Font.BOLD,20));
        g2d.drawString("Score : 100 ",50,50);
    }
}
