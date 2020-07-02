package com.theavanter.moreitemsmod.util.enums;

import java.util.function.Supplier;

import com.theavanter.moreitemsmod.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTier implements IItemTier
{
	/*
	 * Attack Damage 1.0F = 3 Attack Damage in game
	 * 2.0F = 5 Attack Damage
	 * 3.0F = 7 Attack Damage
	 */
	 
	
	//Custom Tiers
	RUBY(4, 1500, 15.0F, 3.0F, 250, () -> 
	{
		return Ingredient.fromItems(RegistryHandler.RUBY.get());
	});
	
	
	//Tier Object
	private final int HARVEST_LEVEL;
	private final int MAXUSES;
	private final float EFFICIENCY;
	private final float ATTACK_DAMAGE;
	private final int ECHANTABILITY;
	private final LazyValue<Ingredient> REPAIR_MATERIAL;


	private ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial)
	{
		this.HARVEST_LEVEL= harvestLevel;
		this.MAXUSES = maxUses;
		this.EFFICIENCY = efficiency;
		this.ATTACK_DAMAGE = attackDamage;
		this.ECHANTABILITY = enchantibility;
		this.REPAIR_MATERIAL = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getHarvestLevel() 
	{
		return HARVEST_LEVEL;
	}


	@Override
	public int getMaxUses() 
	{
		return MAXUSES;
	}


	@Override
	public float getEfficiency() 
	{
		return EFFICIENCY;
	}


	@Override
	public float getAttackDamage() 
	{
		return ATTACK_DAMAGE;
	}


	@Override
	public int getEnchantability()
	{
		return ECHANTABILITY;
	}


	@Override
	public Ingredient getRepairMaterial() 
	{
		return REPAIR_MATERIAL.getValue();
	}
}
