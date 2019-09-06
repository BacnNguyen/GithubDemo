package com.t3h.bai1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Bai1 {
    public static void main(String[] args) {
        Integer [] arr = {1 ,2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2};
        System.out.println("dãy số có tổng < 8:");
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]+ arr[i+1] < 8){
                System.out.println(arr[i] +" + "+ arr[i+1]);
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("vị trí của " + arr[i] + " trong mảng: ");
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]==arr[j]) {
                    System.out.print( j + ", ");
                }
            }
            System.out.println();
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length -1 ; i++) {
            if(arr[0]==arr[i]){}
            else {
                System.out.println("Giá trị nhỏ thứ 2: " + arr[i]);
                break;
            }
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        };
        Arrays.sort(arr, comparator);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        /*for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }*/



    }
}
