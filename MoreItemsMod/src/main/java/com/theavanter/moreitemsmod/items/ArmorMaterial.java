package com.theavanter.moreitemsmod.items;

import java.util.function.Supplier;

import com.theavanter.moreitemsmod.*;
import com.theavanter.moreitemsmod.util.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.LazyValue;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorMaterial implements IArmorMaterial
{
	//Custom Armour Materials
	RUBY(MoreItemsMod.MOD_ID + ":ruby", 5, new int[] {7, 9, 11, 7}, 420, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.9F, () ->
	{
		return Ingredient.fromItems(RegistryHandler.RUBY.get());	
	});
	
	
	private static final int [] MAX_DAMAGE = new int [] {16, 16, 16, 16};
	private final String NAME;
	private final int MAX_DAMAGE_FACTOR;
	private final int[] DAMAGE_REDUCTION_AMOUNT;
	private final int ENCHANTABILITY;
	private final SoundEvent SOUND_EVENT;
	private final float TOUGHNESS;
	private final LazyValue<Ingredient> REPAIR_MATERIAL;

	
	
	private ArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmount, int enchantability,
			SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
		NAME = name;
		MAX_DAMAGE_FACTOR = maxDamageFactor;
		DAMAGE_REDUCTION_AMOUNT = damageReductionAmount;
		ENCHANTABILITY = enchantability;
		SOUND_EVENT = soundEvent;
		TOUGHNESS = toughness;
		REPAIR_MATERIAL = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) 
	{
		return MAX_DAMAGE[slotIn.getIndex()] * MAX_DAMAGE_FACTOR;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) 
	{
		return DAMAGE_REDUCTION_AMOUNT[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() 
	{
		
		return ENCHANTABILITY;
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		
		return SOUND_EVENT;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		
		return REPAIR_MATERIAL.getValue();
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() 
	{
		
		return NAME;
	}

	@Override
	public float getToughness() 
	{
		return TOUGHNESS;
	}

}
