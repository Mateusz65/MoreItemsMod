package com.theavanter.moreitemsmod.items;

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
	RUBY(4, 1500, 10.0F, 3.0F, 250, () -> 
	{
		return Ingredient.fromItems(RegistryHandler.RUBY.get());
	});
	
	
	//Tier Object
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantibility;
	private final LazyValue<Ingredient> repairMaterial;


	private ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial)
	{
		this.harvestLevel= harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantibility = enchantibility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getHarvestLevel() 
	{
		return harvestLevel;
	}


	@Override
	public int getMaxUses() 
	{
		return maxUses;
	}


	@Override
	public float getEfficiency() 
	{
		return efficiency;
	}


	@Override
	public float getAttackDamage() 
	{
		return attackDamage;
	}


	@Override
	public int getEnchantability()
	{
		return enchantibility;
	}


	@Override
	public Ingredient getRepairMaterial() 
	{
		return repairMaterial.getValue();
	}
}
