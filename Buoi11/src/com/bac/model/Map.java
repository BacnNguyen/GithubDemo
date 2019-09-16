package com.bac.model;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Map {
    private Image img0;
//    private Image img1;
    private Image img2;
    private Image img5;
    private Image img4;
    private Image img8;


    private File file;
    public static int size;
    private int WIDTH;
    private int HEIGHT;
    private int map[][];

    private static ArrayList<Brick> bricks ;

    public Map(String path,int size) throws IOException {
        this.size = size;

        bricks = new ArrayList<>();

        file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader (file));

        WIDTH = Integer.parseInt(br.readLine());
        HEIGHT = Integer.parseInt(br.readLine());

        map = new int[HEIGHT][WIDTH];

        for (int i = 0; i <HEIGHT ; i++) {
            String line = br.readLine();
            for (int j = 0; j <WIDTH ; j++) {
                int number = Integer.parseInt(line.charAt(j)+"");
                map[i][j] = number;
                if(number==1) {
                    Brick brick = new Brick(j, i, size);
                    bricks.add(brick);
                }
            }
        }


        img0 = new ImageIcon(getClass().getResource("/images/soil1.png")).getImage();
//        img1 = new ImageIcon(getClass().getResource("/images/brick.png")).getImage();
        img2 = new ImageIcon(getClass().getResource("/images/rock.png")).getImage();
        img5 = new ImageIcon(getClass().getResource("/images/water.png")).getImage();
        img4 = new ImageIcon(getClass().getResource("/images/tree.png")).getImage();
        img8 = new ImageIcon(getClass().getResource("/images/bird.png")).getImage();


//        for (int i = 0; i <HEIGHT ; i++) {
//            for (int j = 0; j < WIDTH; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
    }


    public  ArrayList<Brick> getArrayBrick(){
        return bricks;
    }


    public void draw(Graphics2D g2d){
        for (int i = 0; i <HEIGHT ; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if(map[i][j]==0){
                    g2d.drawImage(img0,j*size,i*size,size,size,null);
                }
//                if(map[i][j]==1){
//                    g2d.drawImage(img1,j*size,i*size,size,size,null);
//                }
//
                if(map[i][j]==2){
                    g2d.drawImage(img2,j*size,i*size,size,size,null);
                }

                if(map[i][j]==5){
                    g2d.drawImage(img5,j*size,i*size,size,size,null);
                }
                if(map[i][j]==4){
                    g2d.drawImage(img4,j*size,i*size,size,size,null);
                }

                if(map[i][j]==8){
                    g2d.drawImage(img8,j*size,i*size,size*2,size*2,null);
                }
            }
        }
    }
}
