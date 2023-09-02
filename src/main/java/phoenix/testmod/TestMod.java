package phoenix.testmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import phoenix.testmod.block.ModBlocks;
import phoenix.testmod.block.ModFlammableBlockRegistry;
import phoenix.testmod.item.ModItemGroup;
import phoenix.testmod.item.ModItems;
import phoenix.testmod.world.gen.ModWorldGeneration;

public class TestMod implements ModInitializer {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

    @Override
    public void onInitialize() {

        ModItemGroup.registerItemGroups();
        ModItems.registerModeItems();
        ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGen();

        ModFlammableBlockRegistry.registerFlammableBlocks();
        StrippableBlockRegistry.register(ModBlocks.THE_BOYS_LOG, ModBlocks.STRIPPED_THE_BOYS_LOG);
        StrippableBlockRegistry.register(ModBlocks.THE_BOYS_WOOD, ModBlocks.STRIPPED_THE_BOYS_WOOD);
    }
}