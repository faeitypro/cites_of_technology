package com.technological_cities.cities_of_technologies.item;

import com.technological_cities.cities_of_technologies.technological_cities;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Basic_item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, technological_cities.MODID);

    //début d'un item
    public static final RegistryObject<Item> fps_item = ITEMS.register("fps", () -> new Item(new Item.Properties()));
    //fin d'un item

    //stack d'item
    public static final RegistryObject<Item> item_test = ITEMS.register("item_test", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> seconditem_test = ITEMS.register("seconditem_test", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> tellurium_ingot = ITEMS.register("tellurium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_lead = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> lead_Ingot = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_Lead_Plate = ITEMS.register("raw_lead_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Renforced_Lead_Plate = ITEMS.register("reinforced_lead_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Armored_Lead_Safe = ITEMS.register("armored_lead_safe", () -> new Item(new Item.Properties()));
    //fin stack d'item

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
