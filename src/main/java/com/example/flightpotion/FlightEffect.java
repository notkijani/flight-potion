package com.example.flightpotion;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class FlightEffect extends Effect {
    public FlightEffect() {
        super(EffectType.BENEFICIAL, 0x00A3E0); // Blue color
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            // Enable creative-like flight abilities
            player.getAbilities().allowFlying = true;
            // Don't force flying, let player toggle with space bar
            player.sendAbilitiesUpdate();
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // Make sure the effect updates every tick
        return true;
    }

    @Override
    public void onRemoved(LivingEntity entity) {
        if (entity instanceof PlayerEntity player && !player.isCreative()) {
            // Disable flight when effect ends (but not if they're in creative mode)
            player.getAbilities().allowFlying = false;
            player.getAbilities().flying = false;
            player.sendAbilitiesUpdate();
        }
    }

    @Override
    public boolean isInstant() {
        return false;
    }
}
