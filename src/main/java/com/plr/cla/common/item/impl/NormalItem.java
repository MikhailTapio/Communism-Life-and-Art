package com.plr.cla.common.item.impl;

import com.plr.cla.common.creativeTab.init.TabInit;
import net.minecraft.world.item.Item;

public class NormalItem extends Item {
    public NormalItem() {
        //todo:tab
        super(new Properties().tab(TabInit.MAIN));
    }
}
