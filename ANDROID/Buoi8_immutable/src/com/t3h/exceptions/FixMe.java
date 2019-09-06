package com.t3h.exceptions;

public class FixMe {
    StringBuilder builder = new StringBuilder();

    public FixMe(){
        builder.append("hello");
        builder.append("world");
    }

    public void sumDigit(){
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {
            if(i % 2 == 0) {
                sum += builder.codePointAt(i);
            }
            else {
                sum += builder.codePointAt(i);
            }

        }
        System.out.println(sum);
    }
}
