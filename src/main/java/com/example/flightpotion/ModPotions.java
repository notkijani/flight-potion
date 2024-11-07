package com.example.flightpotion;

import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    // Register the Potion
    public static final Potion POTION_OF_FLIGHT = new Potion(new FlightEffect());

    public static void registerPotions() {
        Registry.register(Registry.POTION, new Identifier("flightpotion", "potion_of_flight"), POTION_OF_FLIGHT);
    }
}
