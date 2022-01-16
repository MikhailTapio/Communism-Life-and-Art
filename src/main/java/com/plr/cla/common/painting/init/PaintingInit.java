package com.plr.cla.common.painting.init;

import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.world.entity.decoration.Motive;

public class PaintingInit {
    public static final String S = "_small";
    public static final String P = "poster_";
    public static void register(){
        for(int id = 1;id <= 6;id++){
            initPosters(P + id + "");
        }
        RegistryHandler.Painting.register("soviet_flag",() -> new Motive(96, 48));
        RegistryHandler.Painting.register("soviet_flag_medium",() -> new Motive(64, 32));
        RegistryHandler.Painting.register("soviet_flag_small",() -> new Motive(32, 16));
        RegistryHandler.Painting.register("streamer_serve_the_people",() -> new Motive(96, 32));
        RegistryHandler.Painting.register("streamer_serve_the_people_small",() -> new Motive(48, 16));
    }

    private static void initPosters(String posterId){
        RegistryHandler.Painting.register(posterId,() -> new Motive(64, 96));
        RegistryHandler.Painting.register(posterId + S,() -> new Motive(32, 48));
    }
}
