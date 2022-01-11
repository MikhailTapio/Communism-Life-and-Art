package com.plr.cla.common.item.food.base;

import com.plr.cla.common.item.init.ItemInit;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class FoodItem extends Item {
    //-1 -> tinned, 0 -> solid, 1 -> bowled, 2 -> canned.
    public final int foodType;
    public FoodItem(Rarity rarity, FoodProperties properties, int foodType) {
        //todo:creative tab
        super(new Properties().tab(CreativeModeTab.TAB_FOOD).rarity(rarity).food(properties));
        this.foodType = foodType;
    }

    @Nonnull
    @Override
    public UseAnim getUseAnimation(@Nonnull ItemStack itemstack) {
        return (foodType <= 0)? UseAnim.EAT: UseAnim.DRINK;
    }

    @Nonnull
    @Override
    public ItemStack finishUsingItem(@Nonnull ItemStack stack, @Nonnull Level world, @Nonnull LivingEntity eater) {
        ItemStack finish = super.finishUsingItem(stack, world, eater);
        switch(foodType){
            case 2 -> {
                return returnConsumed(stack, ItemInit.beverageCan.get().getDefaultInstance(), eater);
            }
            case 1 -> {
                return returnConsumed(stack, Items.BOWL.getDefaultInstance(), eater);
            }
            case -1 -> {
                return returnConsumed(stack, ItemInit.emptyTin.get().getDefaultInstance(), eater);
            }
        }
        return finish;
    }

    public static ItemStack returnConsumed(ItemStack stack, ItemStack container, LivingEntity eater){
        if (stack.isEmpty()) {
            return container;
        } else {
            if (eater instanceof Player player) {
                if (!player.isCreative() && !player.getInventory().add(container))
                    player.drop(container, false);
            }
            return stack;
        }
    }
}
