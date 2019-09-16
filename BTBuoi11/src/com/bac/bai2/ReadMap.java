package com.bac.bai2;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class ReadMap {
    private int maxtr[][];
    private int mapSize;

    private int WIDTH;
    private int HEIGHT;
    private Image img0;
    private Image img1;
    private Image img2;
    private Image img4;
    private Image img5;
    private Image img9;

    public ReadMap(String path, int mapSize) throws IOException {
        File file = new File(path);
        this.mapSize = mapSize;
        BufferedReader br = new BufferedReader(new FileReader(file));

        WIDTH = Integer.parseInt(br.readLine());
        HEIGHT = Integer.parseInt(br.readLine());
        maxtr = new int[HEIGHT][WIDTH];
        String line;
        for (int i = 0; i <HEIGHT ; i++) {
            line = br.readLine();
            for (int j = 0; j < WIDTH; j++) {
                maxtr[i][j] = Integer.parseInt(line.charAt(j)+"");
            }
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(maxtr[i][j]+" ");
            }
            System.out.println();
        }

        img1 = new ImageIcon(
                getClass().getResource("brick.png")
        ).getImage();

        img4 = new ImageIcon(
                getClass().getResource("grass.png")
        ).getImage();

        img2 = new ImageIcon(
                getClass().getResource("rock.png")
        ).getImage();


        img0 = new ImageIcon(
                getClass().getResource("soil1.png")
        ).getImage();

        img5 = new ImageIcon(
                getClass().getResource("tree.png")
        ).getImage();

        img9 = new ImageIcon(
                getClass().getResource("bird.png")
        ).getImage();

    }

    public void draw(Graphics2D g2d){
        for (int i = 0; i <HEIGHT ; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if(maxtr[i][j]==0){
                    g2d.drawImage(img0,j*mapSize,i*mapSize,mapSize,mapSize,null);
                }
                if(maxtr[i][j]==1){
                    g2d.drawImage(img1,j*mapSize,i*mapSize,mapSize,mapSize,null);
                }
                if(maxtr[i][j]==2){
                    g2d.drawImage(img2,j*mapSize,i*mapSize,mapSize,mapSize,null);
                }
                if(maxtr[i][j]==4){
                    g2d.drawImage(img4,j*mapSize,i*mapSize,mapSize,mapSize,null);
                }

                if(maxtr[i][j]==5){
                    g2d.drawImage(img5,j*mapSize,i*mapSize,mapSize,mapSize,null);
                }
                if(maxtr[i][j]==9) {
                    g2d.drawImage(img9,j*mapSize,i*mapSize,2*mapSize,2*mapSize,null);
                }
            }
        }
    }
}
