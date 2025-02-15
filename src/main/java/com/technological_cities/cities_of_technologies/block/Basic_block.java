package com.technological_cities.cities_of_technologies.block;

import com.technological_cities.cities_of_technologies.item.Basic_item;
import com.technological_cities.cities_of_technologies.technological_cities;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
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
    public static final RegistryObject<Block> TELLURIUM_BLOCK = registriesBlock("tellurium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3.0F, 6.0F)));
    //fin d'un block

    //stack de block
    public static final RegistryObject<Block> LEAD_ORE = registriesBlock("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3.0F, 6.0F).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    //fin stak de block



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
