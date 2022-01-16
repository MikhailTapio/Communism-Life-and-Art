package com.plr.cla.common.item.init;

import com.plr.cla.common.CLA;
import com.plr.cla.common.item.impl.ChargingHornItem;
import com.plr.cla.common.item.impl.NormalItem;
import com.plr.cla.common.item.misc.base.DiscItem;
import com.plr.cla.common.sound.init.SoundInit;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static RegistryObject<Item> beverageCan;
    public static RegistryObject<Item> emptyTin;
    public static RegistryObject<Item> sausageMould;

    public static RegistryObject<Item> discI;
    public static RegistryObject<Item> discII;
    public static RegistryObject<Item> discIII;
    public static RegistryObject<Item> discIV;
    public static RegistryObject<Item> discV;
    public static RegistryObject<Item> discVI;
    public static RegistryObject<Item> discVII;

    public static RegistryObject<Item> chargingHorn;

    public static void register(){
        //Food relevant
        beverageCan = RegistryHandler.Items.register("beverage_can", NormalItem::new);
        emptyTin = RegistryHandler.Items.register("empty_tin", NormalItem::new);
        sausageMould = RegistryHandler.Items.register("sausage_mould", NormalItem::new);
        //Discs
        discI = initDiscItem(SoundInit.I);
        discII = initDiscItem(SoundInit.II);
        discIII = initDiscItem(SoundInit.III);
        discIV = initDiscItem(SoundInit.IV);
        discV = initDiscItem(SoundInit.V);
        discVI = initDiscItem(SoundInit.VI);
        discVII = initDiscItem(SoundInit.VII);
        chargingHorn = RegistryHandler.Items.register("charging_horn", ChargingHornItem::new);

    }

    private static RegistryObject<Item> initDiscItem(String discName){
        return RegistryHandler.Items.register(discName, () -> new DiscItem(new SoundEvent(new ResourceLocation(CLA.MODID, discName))));
    }
}
