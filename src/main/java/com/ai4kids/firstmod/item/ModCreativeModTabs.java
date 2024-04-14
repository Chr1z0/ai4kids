package com.ai4kids.firstmod.item;

import com.ai4kids.firstmod.FirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    // add Items to the new creative mod tab (also existing items can be added here, like diamonds, wood, etc..)
    // .get() only necessary for custom items
    public static final RegistryObject<CreativeModeTab> FIRSTMOD_TAB = CREATIVE_MODE_TABS.register("firstmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.firstmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // order = order inside the tab
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
