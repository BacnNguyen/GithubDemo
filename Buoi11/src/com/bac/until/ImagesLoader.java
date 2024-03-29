package com.bac.until;

import javax.swing.*;
import java.awt.*;

public interface ImagesLoader {
    public static Image getImage(String name,Class clz){
        Image im = new ImageIcon(
                clz.getResource("/images/"+name)
        ).getImage();
        return im;
    }
}
