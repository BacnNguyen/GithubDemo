package com.bac.gui;

import com.bac.model.GameManager;
import com.bac.model.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class TankPanel extends JPanel implements KeyListener ,Runnable{
    private GameManager manager = new GameManager();//hiển thị đối tượng gameManager
    private boolean[] flags = new boolean[256];
    public TankPanel() throws IOException {
        setBackground(Color.BLACK);
        manager.initGame();
        setFocusable(true);
        addKeyListener(this);
        Thread thread = new Thread(this);
        thread.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        manager.draw(g2d);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        switch (e.getKeyCode()){
//            case KeyEvent.VK_LEFT:
//                manager.playerMove(Tank.LEFT);
//                break;
//            case KeyEvent.VK_RIGHT:
//                manager.playerMove(Tank.RIGHT);
//                break;
//            case KeyEvent.VK_UP:
//                manager.playerMove(Tank.UP);
//                break;
//            case KeyEvent.VK_DOWN:
//                manager.playerMove(Tank.DOWN);
//                break;
//        }
//        repaint();
        flags[e.getKeyCode()] = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        flags[e.getKeyCode()] = false;
    }

    @Override
    public void run() {
        while (true){
            if(flags[KeyEvent.VK_LEFT]){
                manager.playerMove(Tank.LEFT);
            }

            else if(flags[KeyEvent.VK_RIGHT]){
                manager.playerMove(Tank.RIGHT);
            }

            else if(flags[KeyEvent.VK_UP]){
                manager.playerMove(Tank.UP);
            }

            else if(flags[KeyEvent.VK_DOWN]){
                manager.playerMove(Tank.DOWN);
            }

            if(flags[KeyEvent.VK_SPACE]){
                manager.playerFire();
            }
           boolean isDie = manager.AI();
            if(isDie){
                int result = JOptionPane.showConfirmDialog(null,
                        "play again?",
                        "Game Over",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.YES_OPTION) {
                    flags = new boolean[256];
                    try {
                        manager.initGame();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else System.exit(0);
            }
            repaint();
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
