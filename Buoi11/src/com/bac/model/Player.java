package com.bac.model;

import com.bac.until.ImagesLoader;

import java.awt.*;

public class Player extends Tank {
    private int hp;
    public Player(int x, int y,int hp) {
        super(x, y, UP);
        this.hp = hp;
        images = new Image[4];
        images[LEFT] = ImagesLoader.getImage("player_green_left.png",getClass());
        images[RIGHT] = ImagesLoader.getImage("player_green_right.png",getClass());
        images[UP] = ImagesLoader.getImage("player_green_up.png",getClass());
        images[DOWN] = ImagesLoader.getImage("player_green_down.png",getClass());
    }

    public void changeOrient(int newOrient){
        this.orient = newOrient;
    }
}
