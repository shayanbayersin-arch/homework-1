package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class WizardStaff implements Weapon{
    @Override
    public String getWeaponInfo() {
        return "Wizard Staff: A magical staff that enhances spellcasting abilities.";
    }

    @Override
    public int getDamage() {
        return 15;
    }

}
