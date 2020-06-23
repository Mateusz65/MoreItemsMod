package com.theavanter.moreitemsmod.items;

import java.util.function.Supplier;

import com.theavanter.moreitemsmod.MoreItemsMod;
import com.theavanter.moreitemsmod.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public class ItemBase extends Item
{
	//Material Item
	public ItemBase() 
	{
		super(new Item.Properties().group(MoreItemsMod.TAB));
	}
	
	
	
//	//Tool Items
//	public ItemBase(char s) 
//	{
//		super(new SwordItem(MimItemTier.RUBY, 7, 15.0, new ItemP));
//	}
//
	
	
	public enum MimItemTier implements IItemTier
	{
		RUBY(4, 1500, 15.0F, 9.0F, 250, () -> 
		{
			return Ingredient.fromItems(RegistryHandler.RUBY.get());
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantibility;
		private final LazyValue<Ingredient> repairMaterial;
		
		
		private MimItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial)
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
}


