package github.epibatidine.epibatidinesitems.item;

import github.epibatidine.epibatidinesitems.EpibatidinesItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LINTED_HAT = registerItem("linted_hat", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EpibatidinesItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EpibatidinesItems.LOGGER.info("Registering Mod Items for " + EpibatidinesItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(entries -> {
            entries.add(LINTED_HAT);
        });
    }
}
