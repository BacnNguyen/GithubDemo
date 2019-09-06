package com.t3h.mangdong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(3);
        arr.add(5);
        arr.add(1,100);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(83);
        arr1.add(50);

        arr.addAll(arr1);
        arr.set(1,1000); //update
        arr.remove(1);//delete
        arr.removeAll(arr1);
        //arr.clear(); // xóa hết phần tử

        //contain : chưa phần tử
        Collections.reverse(arr); // đảo ngược
        Collections.shuffle(arr);//ngẫu nhiên
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int size = arr.size();
        System.out.println(size);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }
    }
}
