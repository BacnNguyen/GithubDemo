package com.bac.vidu;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame("mygame");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setContentPane(new GamePanel());
        window.pack();
//        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\Admin\\Desktop\\Bac\\BTBuoi9\\BTBuoi11\\src\\com\\bac\\vidu\\map2.txt");
//        boolean check = file.exists();
//        System.out.println(check);
//        Scanner sc = new Scanner(new FileReader(file));
//
//        while (sc.hasNextLine()){
//            String tmp = sc.nextLine();
//            System.out.println(tmp);
//        }
//    }
}
