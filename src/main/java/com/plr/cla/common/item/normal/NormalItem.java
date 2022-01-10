package com.plr.cla.common.item.normal;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class NormalItem extends Item {
    public NormalItem() {
        //todo:tab
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }
}
