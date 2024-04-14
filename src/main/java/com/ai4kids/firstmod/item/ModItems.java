package com.ai4kids.firstmod.item;

import com.ai4kids.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registers Mod Objects
    // Deferred Register delays item registration, until all necessary data has been loaded
    // Prevents conflicts
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    // add an item - no texture, no name, not in creative mod tab (yet)
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    // Manages the events and forwards them to the correct mod handlers.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
