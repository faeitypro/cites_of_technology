package com.technological_cities.cities_of_technologies.creative_tabs;

import com.technological_cities.cities_of_technologies.block.Basic_block;
import com.technological_cities.cities_of_technologies.item.Basic_item;
import com.technological_cities.cities_of_technologies.technological_cities;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Creative_tabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, technological_cities.MODID);

    public static final RegistryObject<CreativeModeTab> TECHNOLOGICAL_CITIES = CREATIVE_MODE_TABS.register("technological_cities",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Basic_item.fps_item.get()))
                    .title(Component.translatable("createativetab.technological_cities"))
                    .displayItems((p_270258_, p_259752_) ->{
                        p_259752_.accept(Basic_item.fps_item.get());
                        p_259752_.accept(Basic_item.item_test.get());
                        p_259752_.accept(Basic_item.seconditem_test.get());
                        p_259752_.accept(Basic_item.tellurium_ingot.get());


                        p_259752_.accept(Basic_block.TELLURIUM_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
