package com.xxh.Factory;

public class SoliderFactory extends AbstractHeroFactory {

    @Override
    public Hero createHero(String name) {
       if(name.equals("sk")){
           return new SwordKing();
       }
       return null;
    }
}
