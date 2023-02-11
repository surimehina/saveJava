package com.pratice.text2;

import java.util.Scanner;

public class RunCar {
    public static void main(String[] args) {
        Car[] carList = new Car[3];

        Scanner userInputCar = new Scanner(System.in);
        for (int i = 0; i < carList.length; i++) {
           int temp = i + 1;// 用于提醒用户此次输入为第几次
            Car userCar = new Car();

            System.out.println("输入第" + temp + "辆汽车品牌");
           String brand = userInputCar.next();
           userCar.setCarBrand(brand);

            System.out.println("输入第" + temp + "辆汽车价格");
           double price = userInputCar.nextDouble();
           userCar.setCarPrice(price);

            System.out.println("输入第" + temp + "辆汽车颜色");
           String color = userInputCar.next();
           userCar.setCarColor(color);

           carList[i] = userCar;
        }
        for (int i = 0; i < carList.length; i++) {
            Car result = carList[i];
            System.out.println(result.getCarBrand() + "\n" + result.getCarColor() + "\n" +  result.getCarPrice());
        }

    }
}