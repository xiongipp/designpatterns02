package com.xxh.Factory;


public class MainClass {
    public static void main(String[] args) {
//        不同种类的工厂生产不同种类的英雄，同种类的工厂根据名字创建具体的英雄实例。

//        我这里想要一个射手类型的英雄mp
        Hero hero = new ShooterFactory().createHero("mb");
        hero.attack();
        hero.weapons();
        System.out.println("=====================");
//        我还想要一个射手类型的英雄gg
        Hero hero1 = new ShooterFactory().createHero("gg");
        hero1.attack();
        hero1.weapons();
        System.out.println("=========================");
//        这里来一个不同类型（战士）的英雄sk
        Hero hero2 = new SoliderFactory().createHero("sk");
        hero2.attack();
        hero2.weapons();
    }
}
