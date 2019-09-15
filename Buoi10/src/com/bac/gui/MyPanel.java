package com.bac.gui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null);
//        setBackground(Color.black);
        PanelGame panelGame = new PanelGame();
        PanelMenu panelMenu = new PanelMenu();

        add(panelGame);
        add(panelMenu);
    }
}
