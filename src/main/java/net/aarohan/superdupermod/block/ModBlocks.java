package net.aarohan.superdupermod.block;

import net.aarohan.superdupermod.SuperDuperMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block SUPERITE_BLOCK = registerBlock("superite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_SUPERITE_BLOCK = registerBlock("raw_superite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

    public static final Block SUPERITE_ORE = registerBlock("superite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), FabricBlockSettings.copyOf(Blocks.STONE).strength(35.0f)));
    public static final Block DEEPSLATE_SUPERITE_ORE = registerBlock("deepslate_superite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(37.0f)));
    public static final Block NETHER_SUPERITE_ORE = registerBlock("nether_superite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(33.0f)));
    public static final Block END_STONE_SUPERITE_ORE = registerBlock("end_stone_superite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 10), FabricBlockSettings.copyOf(Blocks.END_STONE).strength(37.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SuperDuperMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SuperDuperMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SuperDuperMod.LOGGER.info("Registering ModBLocks for " + SuperDuperMod.MOD_ID);
    }
}
