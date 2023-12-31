package com.javastudy.gedouGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    public void attack(Role role){
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //修改一下挨揍的人的血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做验证，如果为负数，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //另一种方法
        //remainBlood = Math.max(remainBlood, 0);
        //修改挨揍人的血量
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "打了"+role.getName()+"一下，"+
                "造成" + hurt + "点伤害，"+ role.getName() +"还剩"+ remainBlood +"点血量");
    }
}
