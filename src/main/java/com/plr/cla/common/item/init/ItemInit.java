package com.plr.cla.common.item.init;

import com.plr.cla.common.item.normal.NormalItem;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static RegistryObject<Item> beverageCan;
    public static RegistryObject<Item> emptyTin;

    public static void register(){
        beverageCan = RegistryHandler.Items.register("beverage_can", NormalItem::new);
        emptyTin = RegistryHandler.Items.register("empty_tin", NormalItem::new);
    }
}
