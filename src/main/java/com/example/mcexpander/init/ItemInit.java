package com.example.mcexpander.init;

import com.example.mcexpander.items.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class itemInit {
  public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, McExpander.MOD_ID);
  public static final RegistryObject<Item> CORRUPT_SHARDS = ITEMS.register("corrupt_shards",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> HORSE = ITEMS.register("horse",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance).food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build())));
  public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new FuelItem(new Item.Properties().tab(ModCreativeTab.instance), 3000));
  public static final RegistryObject<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance), 3000));
  public static final RegistryObject<Item> GRANITE_RAW_DIAMOND = ITEMS.register("granite_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> GRANITE_RAW_EMERALD = ITEMS.register("granite_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> RAW_LAPIS = ITEMS.register("raw_lapis",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  public static final RegistryObject<Item> GRANITE_RAW_LAPIS = ITEMS.register("granite_raw_lapis",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
}
public static class ModCreativeTab extends CreativeModeTab {
    public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "mcexpander");
    private ModCreativeTab(int index, String label) {
        super(index, label);
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(LOGO.get());
    }
}
