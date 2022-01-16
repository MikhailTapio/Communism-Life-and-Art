package com.plr.cla.common.sound.init;

import com.plr.cla.common.CLA;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;


public class SoundInit {

    public static RegistryObject<SoundEvent> chargingHorn;

    public static final String I = "disc_01";
    public static final String II = "disc_02";
    public static final String III = "disc_03";
    public static final String IV = "disc_04";
    public static final String V = "disc_05";
    public static final String VI = "disc_06";
    public static final String VII = "disc_07";

    public static void register(){
        initSound(I);
        initSound(II);
        initSound(III);
        initSound(IV);
        initSound(V);
        initSound(VI);
        initSound(VII);
        chargingHorn = initSound("charging_horn");
    }

    private static RegistryObject<SoundEvent> initSound(String soundName){
        return RegistryHandler.Sounds.register(soundName, () -> new SoundEvent(new ResourceLocation(CLA.MODID, soundName)));
    }
}
