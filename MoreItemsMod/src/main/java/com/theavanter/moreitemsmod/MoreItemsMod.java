package com.theavanter.moreitemsmod;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import com.theavanter.moreitemsmod.util.RegistryHandler;
import com.theavanter.moreitemsmod.world.gen.OreGen;


@Mod("mim")
@Mod.EventBusSubscriber(modid = MoreItemsMod.MOD_ID, bus = Bus.MOD)
public class MoreItemsMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mim";
    
    public MoreItemsMod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        RegistryHandler.init();
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
       
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    	
    }
    
    @SubscribeEvent
    public static void loadCompleteLevel(FMLClientSetupEvent event)
    {
    	OreGen.generateOre();
    }
    
    public static final ItemGroup TAB = new ItemGroup("mimTab") 
    {
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(RegistryHandler.RUBY.get());
    	}
    };
    
}
