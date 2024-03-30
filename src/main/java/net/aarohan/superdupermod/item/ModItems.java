package net.aarohan.superdupermod.item;

import net.aarohan.superdupermod.SuperDuperMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUPERITE = registerItem("superite", new Item(new FabricItemSettings()));
    public static final Item RAW_SUPERITE = registerItem("raw_superite", new Item(new FabricItemSettings()));
    public static final Item RAW_SUPERITE_SHARD = registerItem("raw_superite_shard", new Item(new FabricItemSettings()));
    public static final Item SUPERITE_SHARD = registerItem("superite_shard", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SUPERITE);
        entries.add(RAW_SUPERITE);
        entries.add(RAW_SUPERITE_SHARD);
        entries.add(SUPERITE_SHARD);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SuperDuperMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SuperDuperMod.LOGGER.info("Registering Mod Items for " + SuperDuperMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
