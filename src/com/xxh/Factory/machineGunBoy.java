package com.xxh.Factory;

public class machineGunBoy implements Hero {
    @Override
    public void attack() {
        System.out.println("机枪男孩攻击！");
    }

    @Override
    public void weapons() {

        System.out.println("我的武器是机枪");
    }
}
