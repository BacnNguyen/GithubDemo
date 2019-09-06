package com.t3h.mammals;

public class Dog extends Mammals{
    private String danhHoi;

    public String getDanhHoi() {
        return danhHoi;
    }

    public void setDanhHoi(String danhHoi) {
        this.danhHoi = danhHoi;
    }

    public void Sua(){
        System.out.println("Gâu gâu");
    }
    public void CoiNha(){
        System.out.println("đang coi nhà");
    }
    public void SsDanhHoi(){
        System.out.println("so sánh đánh hơi");
    }
}
