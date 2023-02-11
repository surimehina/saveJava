package com.pratice.text6;

import java.util.Scanner;

public class Balance {
    public static int[] lowerCase = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String[] upperCase = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        int[] inputArr = new int[10];
        String[] upperResult = new String[10];

        // 对数组进行初始化
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = strInput.nextInt();
        }

        // 将输入的小写数字转换为大写数字
        for (int i = 0; i < inputArr.length; i++) {
            upperResult[i] = upperCase[inputArr[i]];
            System.out.printf(upperResult[i]);
        }

            System.out.printf("\n"); // 第一次输出结束后换行

        // 将转换出的大写数字转换回小写数字
        for (int i = 0; i < upperResult.length; i++) {
            System.out.printf(String.valueOf(lowerCase[inputArr[i]]));
        }
    }
}
