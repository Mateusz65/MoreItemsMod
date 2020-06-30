package com.theavanter.moreitemsmod.items;

import com.theavanter.moreitemsmod.MoreItemsMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ShovelItemBase extends ShovelItem
{

	public ShovelItemBase(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(MoreItemsMod.TAB));
		
	}
	
}
