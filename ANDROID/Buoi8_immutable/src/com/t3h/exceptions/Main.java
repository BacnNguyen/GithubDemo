package com.t3h.exceptions;

public class Main {
    public static void main(String[] args) {
       /* try {
            int a = Integer.parseInt("2");
            System.out.println(a);
            String str  = "hello";
            System.out.println(str.charAt(10));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("kết thúc chương trình");*/
       FixMe fixMe = new FixMe();
       fixMe.sumDigit();
    }
}
