package com.pratice.text1;

public class Main {

    public static void main(String[] args) {
        ShoppingCart[] goods = new ShoppingCart[3];
        
        ShoppingCart g1 = new ShoppingCart(001, "牙刷", 5, 100);
        ShoppingCart g2 = new ShoppingCart(002, "牙膏", 5, 150);
        ShoppingCart g3 = new ShoppingCart(003, "杯子", 15, 50);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i]);
        }

        
    }
}
