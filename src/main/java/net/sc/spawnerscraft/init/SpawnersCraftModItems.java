
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sc.spawnerscraft.init;

import net.sc.spawnerscraft.item.SpawnerShardsItem;
import net.sc.spawnerscraft.item.BlankEggItem;
import net.sc.spawnerscraft.SpawnersCraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class SpawnersCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpawnersCraftMod.MODID);
	public static final RegistryObject<Item> SPAWNER_SHARDS = REGISTRY.register("spawner_shards", () -> new SpawnerShardsItem());
	public static final RegistryObject<Item> BLANK_EGG = REGISTRY.register("blank_egg", () -> new BlankEggItem());
}
