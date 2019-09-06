package com.t3h.mutable;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append(" world");
        builder.insert(4,"hahaha");
        builder.delete(10,13);
        builder.reverse();
        System.out.println(builder);
    }
}
