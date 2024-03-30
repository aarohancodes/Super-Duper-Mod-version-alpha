package net.aarohan.superdupermod;

import net.aarohan.superdupermod.item.ModItemGroups;
import net.aarohan.superdupermod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperDuperMod implements ModInitializer {
    public static final String MOD_ID = "superdupermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}