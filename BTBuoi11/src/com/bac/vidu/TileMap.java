package com.bac.vidu;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TileMap {
   private int x;
   private int y;

   private int tileSize;
   private int[][] map;
   private int mapWidth ;
   private int mapHeight ;



   public TileMap(String s, int tileSize){
       this.tileSize = tileSize;
       try {
           BufferedReader br = new BufferedReader(new FileReader(s));
           mapWidth = Integer.parseInt(br.readLine());
           mapHeight = Integer.parseInt(br.readLine());
           map = new int[mapHeight][mapWidth];

           String delimiters = " ";
           for (int i = 0; i <mapHeight ; i++) {
               String line  = br.readLine();
               String [] tokens = line.split(delimiters);
               for (int j = 0; j <mapWidth ; j++) {
                   map[i][j] = Integer.parseInt(tokens[j]);
               }
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   public void update(){

   }

   public void draw (Graphics2D g){
       for (int i = 0; i <mapHeight ; i++) {
           for (int j = 0; j <mapWidth ; j++) {
               int rc = map[i][j];
               if(rc == 0){
                   g.setColor(Color.pink);
               }
               if(rc== 1){
                   g.setColor(Color.gray);
               }
               g.fillRect(j*tileSize,i*tileSize,tileSize,tileSize);
           }

       }
   }
}
