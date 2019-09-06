package com.t3h.immutable;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        int len = str.length();
        System.out.println(len);

        char c = str.charAt(2);
        System.out.println(c);

        int valueC = (int) c;
        System.out.println(valueC);


        int a = 65;
        char valueA = (char) a;

        System.out.println(valueA);
        int index = str.indexOf("l");
        System.out.println(index);
        System.out.println("--------");
        System.out.print("Vị Trí của l: ");

     /*   for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == 108 ){
                System.out.print(i + "\t");
            }
        }*/

        int indexL = str.indexOf("l");
        while (indexL != -1){
            System.out.println(indexL);
            indexL = str.indexOf("l",indexL+1);
        }

        //thay tất cả, replaceFirts thay ký tự đầu tien
        str = str.replace("l", "L");
        System.out.println(str);

        String str1 = str.substring(6,9);
        System.out.println(str1);

        str = str.toUpperCase();
        System.out.println(str);

        str = "Văn học theo cách nói chung nhất, là bất kỳ tác phẩm nào bằng văn bản. Hiểu theo nghĩa hẹp hơn";

        int indexU = str.indexOf(" ");
            while (indexU != -1){
            String v = str.substring(indexU, indexU + 2);
            str = str.replace(v, v.toUpperCase());
            indexU = str.indexOf(" ", indexU+1);
        }
        System.out.println(str);

        str = " tam_123_ac@gamil.com";
        str = str.trim();
        String [] arr = str.split("_");
        for (String s: arr) {
            System.out.println(s);
        }
        /* hoặc:
        String username = arr[0];
        System.out.println(username);*/

        boolean contains = str.contains("world");
        System.out.println(contains);

        String s1 = "hello";
        String s2 = "hello";

        boolean equals = s1.equals(s2);
        System.out.println("Kiểm tra"+equals);

        // không phân biệt hoa thường
        boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
        System.out.println(equalsIgnoreCase);
        //compare phân biệt hoa thường
        //compareToIgnoreCase ko phân biệt
        int compare = s1.compareToIgnoreCase(s2);
        System.out.println(compare);

        //trả về giá trị bảng mã ascii ở vị trí index
        int ascii = s1.codePointAt(0);
        System.out.println(ascii);

    }
}
