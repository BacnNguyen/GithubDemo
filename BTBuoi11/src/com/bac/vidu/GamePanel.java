package com.bac.vidu;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel  extends JPanel implements Runnable {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    private Thread thread;
    private boolean running;

    private BufferedImage image;
    private Graphics2D g2d;

    private int FPS = 30;
    private int targetTime = 1000/FPS;

    private TileMap tileMap ;

    public GamePanel(){
        super();
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setFocusable(true);
        requestFocus();
    }

    public void addNotify(){
        super.addNotify();
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run (){
        init();

        long startTime;
        long urdTime ;
        long waitTime;

        while (running){
            startTime = System.nanoTime();
            update();
            render();
            draw();
            urdTime = (System.nanoTime() - startTime)/1000000;
            waitTime = targetTime - urdTime;
            try{
                Thread.sleep(waitTime);
            }catch ( Exception e){

            }
        }
    }

    private void  init (){
        running = true;
        image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
        g2d = (Graphics2D) image.getGraphics();
        tileMap = new TileMap("C:\\Users\\Admin\\Desktop\\Bac\\BTBuoi9\\BTBuoi11\\src\\com\\bac\\vidu\\TileMap.txt",100);
    }
    ////////////////
    private void update(){
        tileMap.update();
    }

    private void render(){
        tileMap.draw(g2d);
    }

    private void draw(){
        Graphics g2 = getGraphics();
        g2.drawImage(image,0,0,null);
        g2.dispose();
    }
}
