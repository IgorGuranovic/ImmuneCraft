package net.sbg.immunecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab IMMUNECRAFT_TAB = new CreativeModeTab("immunecrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PIPETTE10000.get());
        }
    };
}
