package com.plr.cla.common.item.misc.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public class DiscItem extends RecordItem {
    public DiscItem(Supplier<SoundEvent> soundSupplier, int lengthInTicks) {
        super(0, soundSupplier, new Properties(), lengthInTicks);
    }
}
