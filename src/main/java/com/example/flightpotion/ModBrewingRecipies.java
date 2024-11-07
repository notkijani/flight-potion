package com.example.flightpotion;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class ModBrewingRecipes {
    public static void registerBrewingRecipes() {
        // Register a recipe to brew the Potion of Flight
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SWIFTNESS, Items.FEATHER, ModPotions.POTION_OF_FLIGHT);
    }
}
