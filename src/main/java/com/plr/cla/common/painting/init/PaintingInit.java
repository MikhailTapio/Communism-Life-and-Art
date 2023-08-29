package com.plr.cla.common.painting.init;

import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class PaintingInit {
    public static void register() {
        for (int id = 1; id <= 6; id++) {
            initPosters("poster_" + id + "");
        }
        RegistryHandler.Paintings.register("soviet_flag", () -> new PaintingVariant(96, 48));
        RegistryHandler.Paintings.register("soviet_flag_medium", () -> new PaintingVariant(64, 32));
        RegistryHandler.Paintings.register("soviet_flag_small", () -> new PaintingVariant(32, 16));
        RegistryHandler.Paintings.register("streamer_serve_the_people", () -> new PaintingVariant(96, 32));
        RegistryHandler.Paintings.register("streamer_serve_the_people_small", () -> new PaintingVariant(48, 16));
    }

    private static void initPosters(String posterId) {
        RegistryHandler.Paintings.register(posterId, () -> new PaintingVariant(64, 96));
        RegistryHandler.Paintings.register(posterId + "_small", () -> new PaintingVariant(32, 48));
    }
}
