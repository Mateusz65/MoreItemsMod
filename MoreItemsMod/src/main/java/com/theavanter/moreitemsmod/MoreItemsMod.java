package com.theavanter.moreitemsmod;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.theavanter.moreitemsmod.util.RegistryHandler;


@Mod("mim")
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
}
