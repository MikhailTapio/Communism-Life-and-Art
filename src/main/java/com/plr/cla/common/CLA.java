package com.plr.cla.common;

import com.plr.cla.common.util.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CLA.MODID)
public class CLA {
    public static final String MODID = "cla";
    public static final String MODNAME = "Communism: Life and Art";
    public static final Logger LOGGER = LogManager.getLogger();

    public CLA() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        RegistryHandler.register();
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading {}, salute to you comrade!", CLA.MODNAME);
    }

}
