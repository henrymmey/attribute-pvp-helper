package de.henrymmey.attributepvphelperreforged;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpearEnchantmentBooster implements ModInitializer {
	public static final String MOD_ID = "attribute-pvp-helper-reforged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Combat Assistant Mod loaded - Attribute swap detection & mace range helper enabled!");
	}
}
