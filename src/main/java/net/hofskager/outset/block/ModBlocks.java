package net.hofskager.outset.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hofskager.outset.Outset;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

//Block builds and individual registry
    //public static final Block NAME = registerBlock("name", new Block(FabricBlockSettings.of(Material.MATERIAL.settings), group));
    // /files(3) /texture /recipe&&||loot_table /completed

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC); // - //





//General registry methods

    //JMethod called to build and register the blocks as specified
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Outset.MOD_ID, name), block);
    }
    //JMethod called to register the items from the blocks
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Outset.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    //JMethod to log the block registry to the game
    public static void registerModBlocks() {Outset.LOGGER.debug("Item register for " + Outset.MOD_ID);}

}



/*  FILE TEMPLATES: blockstate, lang, block model, item model

BLOCKSTATES.JSON
{
  "variants": {
    "": { "model": "outset:block/block_name" }
  }
}

LANG.JSON: "block.outset.block_name": "Name"

MODELS.BLOCK.JSON
{
  "parent": "block/cube_all",
  "textures": {
    "all": "outset:block/block_name"
  }
}

MODELS.ITEM.JSON
{
  "parent": "outset:block/silver_block"
}

*/