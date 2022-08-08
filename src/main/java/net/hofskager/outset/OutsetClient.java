package net.hofskager.outset;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.hofskager.outset.block.ModBlocks;
import net.hofskager.outset.block.ModSemiBlocks;
import net.minecraft.client.render.RenderLayer;

public class OutsetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModSemiBlocks.PINE_SAPLING, RenderLayer.getCutout());

    }
}
