package com.bac.model;

import com.bac.gui.TankFrame;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class GameManager {
    //điều khiển các hoạt động của các đối tượng
    private Player player;
    private ArrayList<Boss> arrBoss;
    private ArrayList<Bullet> arrBulletPlayer;
    private ArrayList<Bullet> arrBulletBoss;
    private  Map map ;
    private ArrayList<Brick> arrBrick;

    public void initGame() throws IOException {
        map = new Map("C:\\Users\\Admin\\Desktop\\Bac\\BTBuoi9\\Buoi11\\src\\map\\map2.txt",30);
        arrBulletBoss = new ArrayList<>();
        arrBulletPlayer = new ArrayList<>();
        arrBrick = map.getArrayBrick();

        player = new Player(250, 720, 3);
        arrBoss = new ArrayList<>();
        generateBoss();


    }

    private void generateBoss() {
        Boss boss = new Boss(0, 0);
        arrBoss.add(boss);
        Boss boss1 = new Boss(TankFrame.W_FRAME / 2 - 25, 0);
        arrBoss.add(boss1);
        Boss boss2 = new Boss(TankFrame.W_FRAME - 50, 0);
        arrBoss.add(boss2);
    }

    public void draw(Graphics2D g2d) {
        map.draw(g2d);
        for (Brick b: arrBrick) {
            b.draw(g2d);
        }

        drawBullet(g2d,arrBulletBoss);
        drawBullet(g2d,arrBulletPlayer);

        player.draw(g2d);
        for (Boss boss : arrBoss) {
            boss.draw(g2d);
            boss.drawRect(g2d);
        }


        for (Brick b:arrBrick) {
            b.drawRect(g2d);
        }
        player.drawRect(g2d);
    }

    public void drawBullet (Graphics2D g2d,ArrayList<Bullet> arr){
        for (Bullet b: arr) {
            b.draw(g2d);
        }
    }

    public void playerMove(int newOrient) {
        player.changeOrient(newOrient);
        player.move(arrBrick);
    }

    public void playerFire(){
        player.fire(arrBulletPlayer);
    }

    public boolean AI(){
        for (int i = arrBoss.size()-1; i >=0 ; i--) {
            arrBoss.get(i).generateOrient();
            arrBoss.get(i).move(arrBrick);
            arrBoss.get(i).fire(arrBulletBoss);
            boolean die = arrBoss.get(i).checkDie(arrBulletPlayer);
            if(die) arrBoss.remove(i);//xoa boss va co the them chuc nang cong diem
            if(arrBoss.size()<2){
                generateBoss();
            }

        }
        moveBullet(arrBulletPlayer);
        moveBullet(arrBulletBoss);
        return player.checkDie(arrBulletBoss);
    }

    private void moveBullet(ArrayList<Bullet> arr){
        for (int i = arr.size()-1; i >=0 ; i--) {
            boolean move = arr.get(i).move();
            if(move==false){
                arr.remove(i);
            }
        }
    }
}
