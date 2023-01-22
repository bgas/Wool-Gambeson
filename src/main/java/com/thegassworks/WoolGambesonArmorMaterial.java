package com.thegassworks;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoolGambesonArmorMaterial implements ArmorMaterial {
    // see https://fabricmc.net/wiki/tutorial:armor
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {1, 2, 3, 1};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 5;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 1;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(        
            Items.WHITE_CARPET, 
            Items.ORANGE_CARPET, 
            Items.MAGENTA_CARPET, 
            Items.LIGHT_BLUE_CARPET, 
            Items.YELLOW_CARPET, 
            Items.LIME_CARPET, 
            Items.PINK_CARPET, 
            Items.GRAY_CARPET, 
            Items.LIGHT_GRAY_CARPET, 
            Items.CYAN_CARPET, 
            Items.PURPLE_CARPET, 
            Items.BLUE_CARPET, 
            Items.BROWN_CARPET, 
            Items.GREEN_CARPET, 
            Items.RED_CARPET, 
            Items.BLACK_CARPET
        );
	}


	@Override
	public String getName() {
		// Must be all lowercase. applies armor texture
		return "wool_gambeson";
	}
 
	@Override
	public float getToughness() {
		return 0.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0;
	}

}
