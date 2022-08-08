package net.hofskager.outset.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PrimalFruitItem extends Item {
    public PrimalFruitItem(Settings settings) {super(settings);}

    @Override
    public boolean hasGlint(ItemStack stack) {return true;}
}
