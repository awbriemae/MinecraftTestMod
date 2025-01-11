package com.aubrey.tutorial.item;

import com.aubrey.tutorial.MallowWonderland;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // DeferredRegister<"type"> - This tells Minecraft what we want to register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MallowWonderland.MOD_ID);

    public static final RegistryObject<Item> MULCH = ITEMS.register("mulch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEBAB = ITEMS.register("kebab",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASEBALL = ITEMS.register("baseball",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
