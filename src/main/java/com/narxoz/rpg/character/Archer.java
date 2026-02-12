package com.narxoz.rpg.character;

public class Archer implements Character {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Archer(String name) {
        this.name = name;
        this.health = 80;
        this.attackPower = 15;
        this.defense = 5;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Arrow Rain, hitting multiple enemies!");
    }

    @Override
    public void displayStats() {
        System.out.println("Character: " + name);
        System.out.println("Class: Archer");
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
    }

    @Override
    public void getStats() {
        displayStats();
    }
    
}
