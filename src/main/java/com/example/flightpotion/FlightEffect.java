package com.example.flightpotion;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class FlightEffect extends Effect {

    public FlightEffect() {
        super(EffectType.BENEFICIAL, 0x00A3E0); // Set the color to blue (RGB)
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            // Enable flight for the player
            if (!player.getAbilities().flying) {
                player.getAbilities().flying = true;
                player.sendAbilitiesUpdate();
            }
        }
    }

    @Override
    public boolean isInstant() {
        return false;  // Potion is not instant.
    }
}
