package com.plr.cla.common.item.food.properties;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodPropertyInit {
    public static final FoodProperties VODKA = new FoodProperties.Builder().nutrition(1).saturationMod(2).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0),1)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.5F)
            .build();
    public static final FoodProperties KVASS = new FoodProperties.Builder().nutrition(3).saturationMod(1).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20, 0), 0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 0.7F)
            .build();
    public static final FoodProperties CONDENSED_MILK = new FoodProperties.Builder().nutrition(6).saturationMod(6).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1000, 0), 0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1000, 1), 0.05F)
            .build();
    public static final FoodProperties OKROSHKA = new FoodProperties.Builder().nutrition(7).saturationMod(6)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 0.8F)
            .build();
    public static final FoodProperties RUSSIAN_SOUP = new FoodProperties.Builder().nutrition(8).saturationMod(6).meat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 0.8F)
            .build();
    public static final FoodProperties TINNED_CAVIAR = new FoodProperties.Builder().nutrition(4).saturationMod(2)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160, 0),0.5F)
            .build();
    public static final FoodProperties TINNED_SALMON_CAVIAR = new FoodProperties.Builder().nutrition(4).saturationMod(2)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160, 0),0.3F)
            .build();
}
