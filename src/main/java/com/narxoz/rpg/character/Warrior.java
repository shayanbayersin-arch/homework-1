package com.narxoz.rpg.character;


public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;


    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }
    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }
    @Override
    public void getStats() {
        displayStats();
    }

}
