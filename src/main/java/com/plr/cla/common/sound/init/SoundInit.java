package com.plr.cla.common.sound.init;

import com.plr.cla.common.CLA;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;


public class SoundInit {
    public static RegistryObject<SoundEvent> internationaleRu;
    public static RegistryObject<SoundEvent> internationaleCn;
    public static RegistryObject<SoundEvent> sovietAnthem;
    public static RegistryObject<SoundEvent> weAreYourFirmSuccessor;
    public static RegistryObject<SoundEvent> weAreTomorrowsSovietPeople;
    public static RegistryObject<SoundEvent> ourTriumphantSatellite;
    public static RegistryObject<SoundEvent> maoism;
    public static final String I = "disc_01";
    public static final String II = "disc_02";
    public static final String III = "disc_03";
    public static final String IV = "disc_04";
    public static final String V = "disc_05";
    public static final String VI = "disc_06";
    public static final String VII = "disc_07";

    public static void register(){
        internationaleRu = initSound(I);
        internationaleCn = initSound(II);
        sovietAnthem = initSound(III);
        weAreYourFirmSuccessor = initSound(IV);
        weAreTomorrowsSovietPeople = initSound(V);
        ourTriumphantSatellite = initSound(VI);
        maoism = initSound(VII);
    }

    private static RegistryObject<SoundEvent> initSound(String discName){
        return RegistryHandler.Sounds.register(discName, () -> new SoundEvent(new ResourceLocation(CLA.MODID, discName)));
    }
}
