package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.magic.HealthMagic;
import com.narxoz.rpg.equipment.magic.WizardStaff;

public class MagicFactory implements EquipmentFactory {
     public Weapon createWeapon() {
         return new WizardStaff();
         }
    public Armor createArmor() { 
        return new HealthMagic(); 
    }
}