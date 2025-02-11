package com.technological_cities.cities_of_technologies;

import com.technological_cities.cities_of_technologies.block.Basic_block;
import com.technological_cities.cities_of_technologies.creative_tabs.Creative_tabs;
import com.technological_cities.cities_of_technologies.item.Basic_item;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(technological_cities.MODID)
public class technological_cities
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "technological_cities";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "technological_cities" namespace


    public technological_cities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Creative_tabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        Basic_item.register(modEventBus);
        Basic_block.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event){

    }


}



