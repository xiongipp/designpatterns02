package com.xxh.Factory;

public class SwordKing implements Hero {
    @Override
    public void attack() {
        System.out.println("一代剑王的攻击");
    }

    @Override
    public void weapons() {
        System.out.println("我的武器是剑");
    }
}
