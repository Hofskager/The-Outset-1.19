package net.hofskager.outset.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hofskager.outset.Outset;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

//Block builds and individual registry
    //public static final Block NAME = registerBlock("name", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    // *files(3)  *texture  *recipe&&||loot_table

    //functional
/*    public static final Block FILTER = registerBlock("filter", new _Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    public static final Block REFLECTIVE_GLASS = registerBlock("reflective_glass", new _Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //

    //illumination
    public static final Block BIOLUMINESCENT_BLOCK = registerBlock("_bioluminescent_block", new LightBlock(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    public static final Block BLUE_BIOLUMINESCENT_BLOCK = registerBlock("_bioluminescent_block", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    public static final Block GREEN_BIOLUMINESCENT_BLOCK = registerBlock("_bioluminescent_block", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    public static final Block PURPLE_BIOLUMINESCENT_BLOCK = registerBlock("_bioluminescent_block", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
    public static final Block RED_BIOLUMINESCENT_BLOCK = registerBlock("_bioluminescent_block", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup); //
*/
    //ores
    public static final Block BRASS_BLOCK = registerBlock("brass_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.PALE_YELLOW)
            .requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.TERRACOTTA_MAGENTA)
            .requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CASSITERITE = registerBlock("cassiterite", new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE)
            .requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.BONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GRIZZLETITE_BLOCK = registerBlock("grizzletite_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE_GRAY)
            .requiresTool().strength(4.5F, 6.0F).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new OreBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY)
            .requiresTool().strength(3.0F, 3.0F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new OreBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY)
            .requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE_GRAY)
            .requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_CYAN)
            .requiresTool().strength(5.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);


    //outset
    // public static final Block OUTSET_PORTAL = registerBlock("outset_portal", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup);
    //public static final Block OUTSET_PORTAL_FRAME = registerBlock("outset_portal_frame", new Block(FabricBlockSettings.of(Material.MATERIAL)), ItemGroup);
    public static final Block OUTSET_STONE = registerBlock("outset_stone", new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_OUTSET_STONE = registerBlock("smooth_outset_stone", new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block OUTSET_STONE_PILLAR = registerBlock("outset_stone_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block OUTSET_STONE_BRICKS = registerBlock("outset_stone_bricks", new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block OUTSET_STONE_TILES = registerBlock("outset_stone_tiles", new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_OUTSET_STONE = registerBlock("chiseled_outset_stone", new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool().strength(3.0F,9.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    //wood
    public static final Block PINE_LEAVES = registerBlock("pine_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)
            .nonOpaque()), ItemGroup.DECORATIONS); // **:(lt:spruce_sapling)
    public static final Block PINE_LOG = registerBlock("pine_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)
            .requiresTool().strength(2.5F).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PINE_PLANKS = registerBlock("pine_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)
            .requiresTool().strength(2.5F,3.0F).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PINE_WOOD = registerBlock("pine_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)
            .requiresTool().strength(2.5F).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)
            .requiresTool().strength(2.5F).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)
            .requiresTool().strength(2.5F).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);



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
  "variants":
  {
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

RECIPES.JSON [BASIC]
{
  "type": "minecraft:crafting_shaped",
  "key": {
    "#": {
      "item": "outset:brass_ingot"
    }
  },
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "result": {
    "item": "outset:brass_block"
  }
}



*/