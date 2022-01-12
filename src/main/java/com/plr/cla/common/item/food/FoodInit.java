package com.plr.cla.common.item.food;

import com.plr.cla.common.item.food.base.FoodItem;
import com.plr.cla.common.item.food.properties.FoodPropertyInit;
import com.plr.cla.common.util.RegistryHandler;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import javax.annotation.Nonnull;

public class FoodInit {
    public static void register(){
        //canned
        RegistryHandler.Items.register("vodka",() -> new FoodItem(Rarity.EPIC, FoodPropertyInit.VODKA, 2));
        RegistryHandler.Items.register("kvass",() -> new FoodItem(Rarity.UNCOMMON, FoodPropertyInit.KVASS, 2));
        RegistryHandler.Items.register("condensed_milk_pack",() -> new FoodItem(Rarity.UNCOMMON, FoodPropertyInit.CONDENSED_MILK, 2){
            @Override
            public int getUseDuration(@Nonnull ItemStack stack) {
                return 64;
            }
        });
        //bowled
        RegistryHandler.Items.register("okroshka",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.OKROSHKA, 1));
        RegistryHandler.Items.register("russian_soup",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.RUSSIAN_SOUP, 1));
        //tinned
        RegistryHandler.Items.register("tinned_caviar",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.TINNED_CAVIAR, -1));
        RegistryHandler.Items.register("tinned_salmon_caviar", () -> new FoodItem(Rarity.COMMON, FoodPropertyInit.TINNED_SALMON_CAVIAR, -1));
        //solid
        RegistryHandler.Items.register("rye_bread",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.RYE_BREAD, 0));
        RegistryHandler.Items.register("chocolate",() -> new FoodItem(Rarity.UNCOMMON, FoodPropertyInit.CHOCOLATE, 0));
        RegistryHandler.Items.register("raw_sausage",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.RAW_SAUSAGE, 0));
        RegistryHandler.Items.register("cooked_sausage",() -> new FoodItem(Rarity.COMMON, FoodPropertyInit.COOKED_SAUSAGE, 0));

    }
}
