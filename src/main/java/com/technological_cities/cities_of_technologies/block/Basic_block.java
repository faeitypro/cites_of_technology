package com.technological_cities.cities_of_technologies.block;

import com.technological_cities.cities_of_technologies.item.Basic_item;
import com.technological_cities.cities_of_technologies.technological_cities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Basic_block {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, technological_cities.MODID);

    //début d'un block
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registriesBlock("sapphire_block",)
    //fin d'un block

    private static <T extends Block> RegistryObject<T> registriesBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Basic_item.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
// premier SAPPHIRE_BLOCK = TELLURE_BLOCK
//second   saphire_block = tellure_block