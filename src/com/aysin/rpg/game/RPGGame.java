package com.aysin.rpg.game;

public class RPGGame {
    public static void main(String[] args){
       Troll troll = new Troll("aysin", 100, 50);
        System.out.println("troll: " + troll);

        System.out.println("attact "+troll.attact());

        System.out.println("attact2: " + troll.attact());
    }
}
