package github.epibatidine.epibatidinesitems;

import github.epibatidine.epibatidinesitems.item.ModItemGroups;
import github.epibatidine.epibatidinesitems.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpibatidinesItems implements ModInitializer {
	public static final String MOD_ID = "epibatidinesitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}