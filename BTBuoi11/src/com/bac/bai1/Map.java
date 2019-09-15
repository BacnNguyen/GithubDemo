package com.bac.bai1;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private int numberLine = 19;
    private int sizeBox = GameFrame.W_FRAME/numberLine;
    public Map(){
        setSize(GameFrame.W_FRAME,GameFrame.H_FRAME);
        setLayout(null);
        setBackground(Color.BLUE);
        int oldX = 15;
        int oldY =3;
        for (int i = 0; i <numberLine-1 ; i++) {
            for (int j = 0; j <numberLine-1; j++) {
                Box box = new Box(oldX,oldY, sizeBox, sizeBox);
//                bt.setEnabled(true);
                add(box);
                oldX =15+ (j+1)*sizeBox;
            }
            oldX = 15;
            oldY = (i+1)*sizeBox;
        }
    }
}
