package com.t3h.bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
/*    private int n;
    private Integer [] arr = new Integer[n];
    private Random rd = new Random();
    public ArrayUtil(int n) {
        this.n = n;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }
    }*/

    int[] arr = {1, 5, 6, 4, 2, 3, 3, 4, 2};


    public void inmang() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void findTriangle() {
        System.out.println();
        System.out.println("các cạnh hợp thành tam giác: ");
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] + arr[j + 1] > arr[j + 2]) || (arr[j + 2] + arr[j + 1] > arr[j]) || (arr[j] + arr[j + 2] > arr[j + 1])) {
                    System.out.println(arr[j] + " " + arr[j + 1] + " " + arr[j + 2]);
                } else {
                    System.out.println("không tồn tại tam giác");
                }
            }
    }

    public void findSecondSmallestElement(){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[0]==arr[i]){
                System.out.println("Khong co phan tu be thu 2");
            }
            else {
                System.out.println("Giá trị nhỏ thứ 2: " + arr[i]);
                break;
            }
        }
    }

}
