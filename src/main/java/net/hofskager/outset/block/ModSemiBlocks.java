package net.hofskager.outset.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hofskager.outset.Outset;
import net.hofskager.outset.world.feature.tree.PineSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSemiBlocks {
//Block builds and individual registry
    //public static final Block NAME = registerSemiBlock("name", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    // *files(3)  *texture  *recipe&&||loot_table

    //wood
    public static final Block PINE_SAPLING = registerSemiBlock("pine_sapling", new SaplingBlock(new PineSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);


    //General registry methods

    //JMethod called to build and register the blocks as specified
    private static Block registerSemiBlock(String name, Block block, ItemGroup group) {
        registerSemiBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Outset.MOD_ID, name), block);
    }
    //JMethod called to register the items from the blocks
    private static Item registerSemiBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Outset.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    //JMethod to log the block registry to the game
    public static void registerModSemiBlocks() {Outset.LOGGER.debug("Semi Block register for " + Outset.MOD_ID);}

}
