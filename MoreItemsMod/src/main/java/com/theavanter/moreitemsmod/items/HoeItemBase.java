package com.theavanter.moreitemsmod.items;

import com.theavanter.moreitemsmod.MoreItemsMod;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class HoeItemBase extends HoeItem
{

	public HoeItemBase(IItemTier tier, float attackSpeedIn)
	{
		super(tier, attackSpeedIn, new Item.Properties().group(MoreItemsMod.TAB));
		
	}

}
