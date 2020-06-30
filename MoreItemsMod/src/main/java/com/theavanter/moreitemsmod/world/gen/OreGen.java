package com.theavanter.moreitemsmod.world.gen;

import com.theavanter.moreitemsmod.blocks.RubyOreBlock;
import com.theavanter.moreitemsmod.util.RegistryHandler;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen 
{

	public static void generateOre()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{	
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(RubyOreBlock.getPlacementConfig()));
		}
	}
	
}