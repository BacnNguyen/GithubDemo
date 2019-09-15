package com.bac.bai1;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Map map = new Map();
    public GamePanel(){;
        setBackground(Color.BLACK);
        setLayout(null);
        JButton button = new JButton("demo");
        JPanel map = new Map();
//        add(button);
        add(map);
    }
}
