package com.t3h.bai2;

public class Student {
    private String id;
    private String name;
    private float score;

    public Student(String id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return id+name+score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }
}
