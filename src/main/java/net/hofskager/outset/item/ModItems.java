package net.hofskager.outset.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hofskager.outset.Outset;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

//Item builds and individual registry
    // public static final Item NAME = registerItem("name", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    // *files(1)   *texture   *recipe &&|| loot_table   :missing

    //spawn eggs
    public static final Item ANGLERFISH_SPAWN_EGG = registerItem("anglerfish_spawn_egg",
            new SpawnEggItem(EntityType.GUARDIAN, 8428710, 9794178,  new FabricItemSettings().group(ItemGroup.MISC))); // **:entity
    public static final Item ARMADILLO_SPAWN_EGG = registerItem("armadillo_spawn_egg",
            new SpawnEggItem(EntityType.PANDA, 12098330, 8222313, new FabricItemSettings().group(ItemGroup.MISC))); // **:entity
    public static final Item MANTA_RAY_SPAWN_EGG = registerItem("manta_ray_spawn_egg",
            new SpawnEggItem(EntityType.DOLPHIN, 12705254, 3357115, new FabricItemSettings().group(ItemGroup.MISC))); // **:entity
    public static final Item OWL_SPAWN_EGG = registerItem("owl_spawn_egg",
            new SpawnEggItem(EntityType.BEE, 16447966, 10710381, new FabricItemSettings().group(ItemGroup.MISC))); // **:entity
    public static final Item SALAMANDER_SPAWN_EGG = registerItem("salamander_spawn_egg",
            new SpawnEggItem(EntityType.AXOLOTL, 14408623, 7512957, new FabricItemSettings().group(ItemGroup.MISC))); // **:entity

/*
    public static final Item ARCANIC_FRUIT = registerItem("arcanic_fruit",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD))); //
    public static final Item ARMADILLO_SHELL = registerItem("armadillo_shell",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item ENHANCED_SHIELD = registerItem("enhanced_shield",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT))); //
    public static final Item ESCA = registerItem("esca",
            new Item(new FabricItemSettings().group(ItemGroup.BREWING))); //
    public static final Item GILL_PLATE = registerItem("gill_plate",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item GRIZZLETITE_INGOT = registerItem("grizzletite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item MANTA_RAY_BANNER_PATTERN = registerItem("manta_ray_banner_pattern",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item OWL_BANNER_PATTERN = registerItem("owl_banner_pattern",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item PLANKTON_BOTTLE = registerItem("plankton_bottle",
            new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS))); //
    public static final Item PLUMBICORN = registerItem("plumbicorn",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
*/    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); // **
/*    public static final Item SALAMANDER_TAIL = registerItem("salamander_tail",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item TIN_SCRAP = registerItem("tin_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
    public static final Item ZINC_SCRAP = registerItem("zinc_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); //
*/


//General registry methods

    //JMethod called to build and register the items as specified
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Outset.MOD_ID, name), item);
    }
    //JMethod to log the item registry to the game
    public static void registerModItems() {Outset.LOGGER.debug("Item register for " + Outset.MOD_ID);}

}



/*  FILE TEMPLATES: lang, item model

LANG.JSON: "item.outset.item_name": "Name"

MODELS.ITEM.JSON
{
  "parent": "item/generated",
  "textures": {
    "layer0": "outset:item/item_name"
  }
}

*/