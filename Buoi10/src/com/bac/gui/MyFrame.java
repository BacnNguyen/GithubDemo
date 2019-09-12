package com.bac.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener {
    public static final int W_FRAME = 800;
    public static final int H_FRAME = 600;


    public MyFrame() {
        setTitle("MyFrame");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//dispose_on_close chỉ tắt khi các frame được tắt hết
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//do not thing khi tắt bằng cách khác
        setResizable(false);
        addWindowListener(this);
        MyPanel panel = new MyPanel();
        add(panel);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(null,
                "Continue close window?",
                "Exit",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
