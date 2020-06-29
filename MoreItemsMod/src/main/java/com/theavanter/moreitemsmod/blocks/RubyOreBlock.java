package com.theavanter.moreitemsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.ToolType;

public class RubyOreBlock extends Block
{
	
	public RubyOreBlock() 
	{
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(5.0f, 6.0f)
				.sound(SoundType.STONE)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
				);
	}
	
	public static final ConfiguredPlacement<CountRangeConfig> getPlacementConfig()
	{
		ConfiguredPlacement<CountRangeConfig> rubyOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 3, 6, 16));
		return rubyOreConfig;
	}
	
}
