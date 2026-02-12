package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class HealthMagic implements Armor{

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public String getArmorInfo() {
        return "Health Magic: Restores health points over time.";
    }

    
}
