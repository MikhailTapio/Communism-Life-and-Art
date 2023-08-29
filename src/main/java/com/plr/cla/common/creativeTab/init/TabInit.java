package com.plr.cla.common.creativeTab.init;

import com.plr.cla.common.item.api.ICLAItem;
import com.plr.cla.common.item.init.ItemInit;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
    public static void register() {
    }

    public static final RegistryObject<CreativeModeTab> MAIN = RegistryHandler.Tabs.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cla.main"))
            .icon(() -> ItemInit.chargingHorn.get().getDefaultInstance())
            .displayItems((a, l) -> {
                RegistryHandler.Items.getEntries().forEach(r -> {
                    final Item i = r.get();
                    if (i instanceof ICLAItem) l.accept(i);
                });
            })
            .build());
}
