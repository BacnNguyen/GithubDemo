package com.bac.bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JButton implements MouseListener {

    public Box(int x,int y,int width,int height){
        setBackground(Color.gray);
        setText("");
        setFont(new Font(null,Font.BOLD,10));
        setBounds(x,y,width,height);
        addMouseListener(this);
    }


    public void changeText(){
        switch (GameManager.player){
            case GameManager.PLAYER_1:
                if(this.getText()==""){
                    GameManager.player = GameManager.PLAYER_2;
                    this.setText("X");
                }
                break;
             case GameManager.PLAYER_2:
                 if(this.getText()==""){
                     GameManager.player = GameManager.PLAYER_1;
                     this.setText("O");
                 }
                 break;
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        changeText();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
