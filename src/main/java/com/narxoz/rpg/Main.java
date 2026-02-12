package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.MagicFactory;
import com.narxoz.rpg.factory.MedievalFactory;
import com.narxoz.rpg.factory.RangerFactory;
import com.narxoz.rpg.factory.WarriorFactory;


public class Main {
    public static void main(String[] args) {
        

        Character warrior = new WarriorFactory().createCharacter("Zelda");
        EquipmentFactory medieval = new MedievalFactory();

        warrior.getStats();
        warrior.useSpecialAbility();
        System.out.println(medieval.createWeapon().getWeaponInfo());
        System.out.println(medieval.createArmor().getArmorInfo());


        Character mage = new MageFactory().createCharacter("Dinamo");
        EquipmentFactory magic = new MagicFactory();

        mage.getStats();
        mage.useSpecialAbility();
        System.out.println(magic.createWeapon().getWeaponInfo());
        System.out.println(magic.createArmor().getArmorInfo());


        Character archer = new ArcherFactory().createCharacter("BlackBow");
        archer.getStats();
        archer.useSpecialAbility();

        EquipmentFactory ranger = new RangerFactory();
        archer.getStats();
        System.out.println(ranger.createWeapon().getWeaponInfo());
        System.out.println(ranger.createArmor().getArmorInfo());
    }
}
