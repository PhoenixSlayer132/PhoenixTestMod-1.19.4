package phoenix.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import phoenix.testmod.TestMod;
import phoenix.testmod.item.ModItemGroup;
import phoenix.testmod.world.tree.TheBoysSaplingGenerator;

public class ModBlocks {

    public static final Block BLOCK_OF_RAW_BLQ = registerBlock("block_of_raw_blq",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block BLOCK_OF_RAW_PHOEN = registerBlock("block_of_raw_phoen",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block BLOCK_OF_RAW_SUPERN = registerBlock("block_of_raw_supern",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block BLOCK_OF_RAW_DAR = registerBlock("block_of_raw_dar",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block BLQ_BLOCK = registerBlock("blq_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block DAR_BLOCK = registerBlock("dar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block PHOEN_BLOCK = registerBlock("phoen_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block SUPERN_BLOCK = registerBlock("supern_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 7.0F).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block BLQ_ORE = registerBlock("blq_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1, 2)), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block DAR_ORE = registerBlock("dar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1, 2)), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block PHOEN_ORE = registerBlock("phoen_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1, 2)), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block SUPERN_ORE = registerBlock("supern_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(1, 2)), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block THE_BOYS_LOG = registerBlock("the_boys_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block THE_BOYS_WOOD = registerBlock("the_boys_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block STRIPPED_THE_BOYS_LOG = registerBlock("stripped_the_boys_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block STRIPPED_THE_BOYS_WOOD = registerBlock("stripped_the_boys_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);

    public static final Block THE_BOYS_PLANKS = registerBlock("the_boys_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);
    public static final Block THE_BOYS_LEAVES = registerBlock("the_boys_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);

    public static final Block THE_BOYS_SAPLING = registerBlock("the_boys_sapling",
            new SaplingBlock(new TheBoysSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.PHOENIX_TESTMOD);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
