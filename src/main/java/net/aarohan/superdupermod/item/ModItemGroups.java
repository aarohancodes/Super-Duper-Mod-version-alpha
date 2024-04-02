package net.aarohan.superdupermod.item;

import net.aarohan.superdupermod.SuperDuperMod;
import net.aarohan.superdupermod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SUPER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SuperDuperMod.MOD_ID, "super"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.super"))
                    .icon(() -> new ItemStack(ModItems.SUPERITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SUPERITE_SHARD);
                        entries.add(ModItems.SUPERITE);
                        entries.add(ModItems.RAW_SUPERITE_SHARD);
                        entries.add(ModItems.RAW_SUPERITE);

                        entries.add(ModBlocks.SUPERITE_BLOCK);
                        entries.add(ModBlocks.RAW_SUPERITE_BLOCK);

                        entries.add(ModBlocks.NETHER_SUPERITE_ORE);
                        entries.add(ModBlocks.END_STONE_SUPERITE_ORE);
                        entries.add(ModBlocks.SUPERITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SUPERITE_ORE);
                    }).build());

    public static void registerItemGroups() {
        SuperDuperMod.LOGGER.info("Registering Item Groups for " + SuperDuperMod.MOD_ID);
    }
}
