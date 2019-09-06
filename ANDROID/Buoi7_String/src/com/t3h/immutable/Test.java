package com.t3h.immutable;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,1};
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
