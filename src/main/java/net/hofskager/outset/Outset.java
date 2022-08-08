package net.hofskager.outset;

import net.fabricmc.api.ModInitializer;
import net.hofskager.outset.block.ModBlocks;
import net.hofskager.outset.block.ModSemiBlocks;
import net.hofskager.outset.item.ModItems;
import net.hofskager.outset.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Outset implements ModInitializer {
	public static final String MOD_ID = "outset";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSemiBlocks.registerModSemiBlocks();
	}
}
