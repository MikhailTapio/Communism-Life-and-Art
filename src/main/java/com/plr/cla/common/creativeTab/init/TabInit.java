package com.plr.cla.common.creativeTab.init;

import com.plr.cla.common.item.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class TabInit {
    public static final CreativeModeTab MAIN = new CreativeModeTab("cla.main") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return ItemInit.chargingHorn.get().getDefaultInstance();
        }
    };
}
