package com.thegassworks;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    private static final ArmorMaterial WOOL_GAMBERSON_ARMOR_MATERIAL = new WoolGambesonArmorMaterial();

    private static final Item WOOL_GAMBERSON_HELMET = new ArmorItem(WOOL_GAMBERSON_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());//.group(ItemGroup.COMBAT));
    private static final Item WOOL_GAMBERSON_CHESTPLATE = new ArmorItem(WOOL_GAMBERSON_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());//.group(ItemGroup.COMBAT));
    private static final Item WOOL_GAMBERSON_LEGGINGS = new ArmorItem(WOOL_GAMBERSON_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());//.group(ItemGroup.COMBAT));
    private static final Item WOOL_GAMBERSON_BOOTS = new ArmorItem(WOOL_GAMBERSON_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());//.group(ItemGroup.COMBAT));

    public static void register() { 

        Registry.register(Registry.ITEM, new Identifier("wool_gambeson", "wool_gambeson_helmet"), WOOL_GAMBERSON_HELMET);
        Registry.register(Registry.ITEM, new Identifier("wool_gambeson", "wool_gambeson_chestplate"), WOOL_GAMBERSON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("wool_gambeson", "wool_gambeson_leggings"), WOOL_GAMBERSON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("wool_gambeson", "wool_gambeson_boots"), WOOL_GAMBERSON_BOOTS);
    }

}
