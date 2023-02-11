package com.game;

import java.util.Random;

public class GameRole {
        private String name;
        private int health;
        private double criHit;

    public GameRole(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public GameRole() {
    }


    public int CriHit() {
        Random cri = new Random();
        criHit = cri.nextDouble();
        if(criHit > 0.5){
            return 1;
        }else {
            return 0;
        }
    }

    public void attack(GameRole role) {
       Random roleAtt = new Random();
       int hurt = roleAtt.nextInt(20) + 1;

      if (CriHit() == 1) {
          hurt = hurt * 2;
      }

       int result = role.getHealth() - hurt;
       result = result < 0 ? 0: result;

       role.setHealth(result);

        if (CriHit() == 1) {
            System.out.println(this.getName() + "造成暴击！伤害x2！");
        }
       System.out.println(this.getName() + "打了" + role.getName() + "造成" + hurt + "伤害" + "剩余血量" + role.getHealth());


}

}
