package com.bac.gui;

import com.bac.model.Tank;
import com.bac.until.ImagesLoader;

import java.awt.*;
import java.util.Random;

public class Boss extends Tank {

    private Random rd = new Random();


    public Boss(int x, int y) {
        super(x, y,DOWN);
        images = new Image[4];
        images[LEFT] = ImagesLoader.getImage("bossyellow_left.png",getClass());
        images[RIGHT] = ImagesLoader.getImage("bossyellow_right.png",getClass());
        images[UP] = ImagesLoader.getImage("bossyellow_up.png",getClass());
        images[DOWN] = ImagesLoader.getImage("bossyellow_down.png",getClass());
    }


    public void generateOrient(){
        int percent = rd.nextInt(101);
        if(percent<=95){
            return;
        }
        int newOrient = rd.nextInt(4);
        orient = newOrient;
    }
}
