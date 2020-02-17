package com.xxh.Factory;

public class ShooterFactory  extends AbstractHeroFactory {
    @Override
    public Hero createHero(String name) {
        if(name.equals("mb")){
            return new machineGunBoy();
        }else if(name.equals("gg")){
            return new GayGunMan();
        }
        return null;
    }
}
