package net.hofskager.outset.util;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hofskager.outset.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs(){
        registerStrippables();
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.PINE_LEAVES, 5,5);
        instance.add(ModBlocks.PINE_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_PINE_LOG, 5,5);
        instance.add(ModBlocks.PINE_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_PINE_WOOD, 5,20);
        instance.add(ModBlocks.PINE_PLANKS, 30,60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.PINE_LOG, ModBlocks.STRIPPED_PINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_WOOD);
    }

}
