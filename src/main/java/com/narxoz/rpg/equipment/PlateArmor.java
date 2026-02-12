package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    private int defense;
    private String armorInfo;

    public PlateArmor() {
        this.defense = 20;
        this.armorInfo = "Plate Armor: Heavy armor with high defense.";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return armorInfo;
    }
    
}
