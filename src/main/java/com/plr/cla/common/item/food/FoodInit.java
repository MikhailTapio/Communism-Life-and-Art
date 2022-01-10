package com.plr.cla.common.item.food;

import com.plr.cla.common.item.food.base.FoodItem;
import com.plr.cla.common.item.food.properties.FoodPropertyInit;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import javax.annotation.Nonnull;

public class FoodInit {
    public static void register(){
        RegistryHandler.Items.register("vodka",() -> new FoodItem(Rarity.EPIC, FoodPropertyInit.VODKA, 2));
        RegistryHandler.Items.register("kvass",() -> new FoodItem(Rarity.UNCOMMON, FoodPropertyInit.KVASS, 2));
        RegistryHandler.Items.register("condensed_milk_pack",() -> new FoodItem(Rarity.UNCOMMON, FoodPropertyInit.CONDENSED_MILK, 2){
            @Override
            public int getUseDuration(@Nonnull ItemStack stack) {
                return 64;
            }
        });
    }
}
