package com.t3h1.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video extends Music{
   private String album;

    public Video(String tenBaiHat, String caSi, float dungLuong, float thoiGian, String album) {
        super(tenBaiHat, caSi, dungLuong, thoiGian);
        this.album = album;
    }

    public ArrayList<String> addList(){
        ArrayList<String> musicDetail = new ArrayList<>();
        musicDetail.add("tên bài hát: "+ tenBaiHat);
        musicDetail.add("ca sĩ: "+ caSi);
        musicDetail.add("dung lượng: "+ dungLuong + "kb");
        musicDetail.add("thời gian: "+ thoiGian + "phút");
        musicDetail.add("album: "+ album );
        return musicDetail;
    }
}
