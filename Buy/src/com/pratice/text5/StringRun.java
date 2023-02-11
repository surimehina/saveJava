package com.pratice.text5;

import java.util.Scanner;

public class StringRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr(arr));
    }
    public static String arr(int[] arr) {
        if (arr == null) {
            return " ";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
           if (i == arr.length - 1){
               result = result + arr[i];
           } else {
               result = result + arr[i] + ",";
           }
        }
        return result + "]";
    }
}
