package github.epibatidine.epibatidinesitems.item;

import github.epibatidine.epibatidinesitems.EpibatidinesItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EPIBATIDINES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EpibatidinesItems.MOD_ID, "epibatidines_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BANDED_HAT))
                    .displayName(Text.translatable("itemgroup.epibatidinesitems.epibatidines_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BANDED_HAT);
                    }).build());

    public static void registerItemGroups() {
        EpibatidinesItems.LOGGER.info("Registering Item Group for " + EpibatidinesItems.MOD_ID);
    }
}
