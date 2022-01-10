package com.plr.cla.common.item.food.properties;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodPropertyInit {
    public static final FoodProperties VODKA = new FoodProperties.Builder().nutrition(1).saturationMod(2).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0),1)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 1)
            .build();
    public static final FoodProperties KVASS = new FoodProperties.Builder().nutrition(3).saturationMod(1).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1)
            .build();
    public static final FoodProperties CONDENSED_MILK = new FoodProperties.Builder().nutrition(6).saturationMod(6).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1000, 0), 0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1000, 1), 0.05F)
            .build();
}
