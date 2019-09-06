package com.t3h1.main;
import com.t3h1.music.BaiHat;
import com.t3h1.music.Video;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("La vie en Rose","hana",1.4f,3.04f,"nhạc trẻ hana");
        Video video1 = new Video("La vie en Rose1","hana",1.4f,3.04f,"nhạc trẻ hana");
        Video video2 = new Video("La vie en Rose2","hana",1.4f,3.04f,"nhạc trẻ hana");

        BaiHat baiHat = new BaiHat("La vie est belle","hana",1.4f,3.04f);
        BaiHat baiHat1 = new BaiHat("Courage","hana1",1.4f,3.04f);
        BaiHat baiHat2 = new BaiHat("Courage1","hana1",1.4f,3.04f);

        ArrayList<ArrayList> listNhac = new ArrayList<>();
        listNhac.add(baiHat.addList());
        listNhac.add(baiHat1.addList());
        listNhac.add(baiHat2.addList());
        System.out.println("Danh sách list nhạc: " + listNhac);

        ArrayList<ArrayList> listVideo = new ArrayList<>();
        listVideo.add(video.addList());
        listVideo.add(video1.addList());
        listVideo.add(video2.addList());
        System.out.println("Danh sách list video: " + listVideo);

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please choose Music or video: \n" +
                "1: Music \n" +
                "2: Video \n");
        Integer number = sc.nextInt();

        System.out.println("Enter your choise: \n" +
                "1: Show info the song playing \n" +
                "2: Next \n" +
                "3: Back \n" +
                "4: Pause \n");
        Integer option = sc.nextInt();
        if(number == 1){
            int n =1;
            switch (option) {
                case 1:
                    System.out.println("Info of the song: " + listNhac.get(n));
                    break;
                case 2:
                    n=n+1;
                    System.out.println(listNhac.get(n));
                    break;
                case 3:
                    n=n-1;
                    System.out.println(listNhac.get(n));
                    break;
                case 4:
                    System.out.println(listNhac.get(n));
                    break;
                default:
                    System.out.println("nhập lại số hợp lệ \n");
            }
        }
        else if(number==2){
            int n =1;
            switch (option) {
                case 1:
                    System.out.println(listVideo.get(n));
                    break;
                case 2:
                    n=n+1;
                    System.out.println(listVideo.get(n));
                    break;
                case 3:
                    n=n-1;
                    System.out.println(listVideo.get(n));
                    break;
                case 4:
                    System.out.println(listVideo.get(n));
                    break;
                default:
                    System.out.println("nhập lại số hợp lệ \n");
            }
        }
        else {
            System.out.println("nhập lại số hợp lệ \n");
        }
    }
}
