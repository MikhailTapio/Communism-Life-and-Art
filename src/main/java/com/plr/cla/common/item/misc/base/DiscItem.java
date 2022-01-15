package com.plr.cla.common.item.misc.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.RecordItem;

public class DiscItem extends RecordItem {
    public DiscItem(SoundEvent soundSupplier) {
        super(0, soundSupplier, new Properties().tab(CreativeModeTab.TAB_MISC));
    }
}
