package com.example.flightpotion;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;

public class FlightPotionMod implements ModInitializer {
    public static final String MOD_ID = "flightpotion";
    
    // Register the effect
    public static final FlightEffect FLIGHT_EFFECT = Registry.register(
        Registries.STATUS_EFFECT,
        new Identifier(MOD_ID, "flight"),
        new FlightEffect()
    );
    
    // Create and register the potion
    public static final Potion FLIGHT_POTION = Registry.register(
        Registries.POTION,
        new Identifier(MOD_ID, "flight_potion"),
        new Potion(new StatusEffectInstance(FLIGHT_EFFECT, 20 * 120)) // 120 seconds
    );

    @Override
    public void onInitialize() {
        // Register the brewing recipe (Awkward + Feather = Flight Potion)
        FabricBrewingRecipeRegistry.registerPotionRecipe(
            Potions.AWKWARD,
            Items.FEATHER,
            FLIGHT_POTION
        );
    }
}
