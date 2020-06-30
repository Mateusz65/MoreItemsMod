package com.theavanter.moreitemsmod.util;

import com.theavanter.moreitemsmod.MoreItemsMod;
import com.theavanter.moreitemsmod.blocks.*;
import com.theavanter.moreitemsmod.items.*;

import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreItemsMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MoreItemsMod.MOD_ID);

	
	public static void init()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}
	
	//Items
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust", ItemBase::new);
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItemBase(ItemTier.RUBY, 4.0f, -1.9F));
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItemBase(ItemTier.RUBY, -2.0F, -2.0F));
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItemBase(ItemTier.RUBY, 5.0f, -1.0f));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItemBase(ItemTier.RUBY, -1.0f, -3.0f));
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItemBase(ItemTier.RUBY, -3.0f));

	//Armour
	public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorBase(ArmorMaterial.RUBY, EquipmentSlotType.HEAD));
	
	
	//Blocks
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
	public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore_block", RubyOreBlock::new);

	
	//Block Items
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> RUBY_BLOCK_ORE_ITEM = ITEMS.register("ruby_ore_block", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));
	
}