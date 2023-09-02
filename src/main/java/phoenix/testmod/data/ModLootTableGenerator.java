package phoenix.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import phoenix.testmod.block.ModBlocks;
import phoenix.testmod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLQ_BLOCK);
        addDrop(ModBlocks.PHOEN_BLOCK);
        addDrop(ModBlocks.SUPERN_BLOCK);
        addDrop(ModBlocks.DAR_BLOCK);

        addDrop(ModBlocks.BLOCK_OF_RAW_BLQ);
        addDrop(ModBlocks.BLOCK_OF_RAW_PHOEN);
        addDrop(ModBlocks.BLOCK_OF_RAW_SUPERN);
        addDrop(ModBlocks.BLOCK_OF_RAW_DAR);

        addDrop(ModBlocks.BLQ_ORE, oreDrops(ModBlocks.BLQ_ORE, ModItems.RAW_BLQ));
        addDrop(ModBlocks.PHOEN_ORE, oreDrops(ModBlocks.PHOEN_ORE, ModItems.RAW_PHOEN));
        addDrop(ModBlocks.SUPERN_ORE, oreDrops(ModBlocks.SUPERN_ORE, ModItems.RAW_SUPERN));
        addDrop(ModBlocks.DAR_ORE, oreDrops(ModBlocks.DAR_ORE, ModItems.RAW_DAR));

    }
}
