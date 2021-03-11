package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12,32,33,44,52};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverseArray(int[] arr) {
        for (int i=0; i< arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length - i - 1] = temp;

        }
    }
}
