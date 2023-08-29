package com.plr.cla.common.util;

import com.plr.cla.common.CLA;
import com.plr.cla.common.creativeTab.init.TabInit;
import com.plr.cla.common.item.food.FoodInit;
import com.plr.cla.common.item.init.ItemInit;
import com.plr.cla.common.painting.init.PaintingInit;
import com.plr.cla.common.sound.init.SoundInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<SoundEvent> Sounds = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CLA.MODID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, CLA.MODID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, CLA.MODID);
    public static final DeferredRegister<PaintingVariant> Paintings = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, CLA.MODID);
    public static final DeferredRegister<CreativeModeTab> Tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CLA.MODID);

    public static void register() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PaintingInit.register();
        SoundInit.register();
        ItemInit.register();
        FoodInit.register();
        TabInit.register();
        Paintings.register(eventBus);
        Sounds.register(eventBus);
        Blocks.register(eventBus);
        Items.register(eventBus);
        Tabs.register(eventBus);
    }
}
