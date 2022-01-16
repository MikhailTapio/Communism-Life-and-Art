package com.plr.cla.common.item.misc.base;

import com.plr.cla.common.creativeTab.init.TabInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

public class DiscItem extends RecordItem {
    public DiscItem(SoundEvent soundSupplier) {
        super(0, soundSupplier, new Properties().tab(TabInit.MAIN));
    }
}
