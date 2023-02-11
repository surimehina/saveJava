package com.game;

public class RunGame {
    public static void main(String[] args) {
        GameRole A = new GameRole("A" , 100);
        GameRole B = new GameRole("B" , 100);

        while (true){
            A.attack(B);
            if(B.getHealth() == 0){
                System.out.println("A win");
                break;
            }
            B.attack(A);
            if (A.getHealth() == 0){
                System.out.println("B win");
                break;
            }

        }
    }
}
