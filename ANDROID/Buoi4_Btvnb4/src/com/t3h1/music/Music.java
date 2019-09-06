package com.t3h1.music;

import java.util.ArrayList;
import java.util.List;

public class Music {
    protected String tenBaiHat;
    protected String caSi;
    protected float dungLuong;
    protected float thoiGian;

    public Music(String tenBaiHat, String caSi, float dungLuong, float thoiGian) {
        this.tenBaiHat = tenBaiHat;
        this.caSi = caSi;
        this.dungLuong = dungLuong;
        this.thoiGian = thoiGian;
    }

    public ArrayList<String> addList(){
        ArrayList<String> musicDetail = new ArrayList<>();
        musicDetail.add("tên bài hát: "+ tenBaiHat);
        musicDetail.add("ca sĩ: "+ caSi);
        musicDetail.add("dung lượng: "+ dungLuong + "kb");
        musicDetail.add("thời gian: "+ thoiGian + "phút");
        return musicDetail;
    }


}
