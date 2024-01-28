package com.aysin.rpg.game;

public abstract class Monster implements Bleedable, Poisonable{
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage){
        this.name= name;
        this.hitPoints=hitPoints;
        this.damage=damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double attact(){
        return getDamage() + bleed() + poison();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name  +
                ", hitPoints=" + hitPoints +
                ", damage=" + damage +
                '}';
    }
}
