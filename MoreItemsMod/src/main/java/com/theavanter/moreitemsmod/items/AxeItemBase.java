package com.theavanter.moreitemsmod.items;

import com.theavanter.moreitemsmod.MoreItemsMod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AxeItemBase extends AxeItem
{

	public AxeItemBase(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, (int) attackDamageIn, attackSpeedIn, new Item.Properties().group(MoreItemsMod.TAB));
		
	}

}
