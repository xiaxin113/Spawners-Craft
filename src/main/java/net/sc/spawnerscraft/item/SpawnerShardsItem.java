
package net.sc.spawnerscraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SpawnerShardsItem extends Item {
	public SpawnerShardsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
