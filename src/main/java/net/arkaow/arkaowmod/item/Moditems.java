package net.arkaow.arkaowmod.item;

import net.arkaow.arkaowmod.ArkaowMod;
import net.arkaow.arkaowmod.ArkaowMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArkaowMod.MOD_ID);

    public static final RegistryObject<Item> FLIPFLOP = ITEMS.register("flipflop",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
