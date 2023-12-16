package com.example.mcexpander.items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelItem extends Item {
    private final int burnTicks;
    public FuelItem(Properties properties, int burnTimeInTicks) {
        super(properties);
        this.burnTicks = burnTimeInTicks;
    }
}
