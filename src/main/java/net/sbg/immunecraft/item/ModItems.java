package net.sbg.immunecraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sbg.immunecraft.ImmuneCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ImmuneCraft.MOD_ID);

    public static final RegistryObject<Item> PIPETTE1000 = ITEMS.register("pipette_100-1000",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMUNECRAFT_TAB)));
    public static final RegistryObject<Item> PIPETTE10000 = ITEMS.register("pipette_1000-10000",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMUNECRAFT_TAB)));
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMUNECRAFT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
