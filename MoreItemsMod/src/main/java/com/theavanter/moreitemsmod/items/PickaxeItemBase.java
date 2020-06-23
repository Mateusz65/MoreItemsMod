package com.theavanter.moreitemsmod.items;

import com.theavanter.moreitemsmod.MoreItemsMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeItemBase extends PickaxeItem
{

	public PickaxeItemBase(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, (int) attackDamageIn, attackSpeedIn, new Item.Properties().group(MoreItemsMod.TAB));
	}

}
