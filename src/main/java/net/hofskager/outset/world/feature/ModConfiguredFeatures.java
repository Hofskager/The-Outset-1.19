package net.hofskager.outset.world.feature;

import net.hofskager.outset.Outset;
import net.hofskager.outset.block.ModBlocks;
import net.hofskager.outset.block.ModSemiBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PINE_TREE =
            ConfiguredFeatures.register("pine_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PINE_LOG),
                    new ForkingTrunkPlacer(5, 4, 3),
                    BlockStateProvider.of(ModBlocks.PINE_LEAVES),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 2, 3)).build());

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Outset.MOD_ID);
    }
}
