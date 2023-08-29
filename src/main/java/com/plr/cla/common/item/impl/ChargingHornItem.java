package com.plr.cla.common.item.impl;

import com.plr.cla.common.item.api.ICLAItem;
import com.plr.cla.common.sound.init.SoundInit;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class ChargingHornItem extends Item implements ICLAItem {
    public ChargingHornItem() {
        super(new Properties().fireResistant().durability(200).rarity(Rarity.UNCOMMON));
    }

    @Nonnull
    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level level, @Nonnull Player player, @Nonnull InteractionHand hand) {
        final ItemStack horn = player.getItemInHand(hand);
        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundInit.chargingHorn.get(), SoundSource.PLAYERS, 1, 1);
        player.getCooldowns().addCooldown(horn.getItem(), 600);
        return InteractionResultHolder.success(horn);
    }

    @Nonnull
    @Override
    public UseAnim getUseAnimation(@Nonnull ItemStack stack) {
        return UseAnim.BOW;
    }
}
