package com.example.flightpotion;

import net.fabricmc.api.ModInitializer;

public class FlightPotionMod implements ModInitializer {

    @Override
    public void onInitialize() {
        // Register the potion effect and potion item
        ModPotions.registerPotions();
        
        // Register brewing recipe
        ModBrewingRecipes.registerBrewingRecipes();
    }
}
