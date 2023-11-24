package net.arkaow.arkaowmod.item;

import net.arkaow.arkaowmod.ArkaowMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArkaowMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARKAOWMOD_TAB = CREATIVE_MODE_TABs.register("misc_arkaow_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Moditems.FLIPFLOP.get()))
                    .title(Component.translatable("creativetab.misc_arkaow_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.FLIPFLOP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABs.register(eventBus);
    }

}
