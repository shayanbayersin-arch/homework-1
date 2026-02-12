package com.narxoz.rpg.character;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int intelligence;

    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 120;
        this.intelligence = 15;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts a powerful fireball!");
    }

    @Override
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void getStats() {
        displayStats();
    }
    
}
