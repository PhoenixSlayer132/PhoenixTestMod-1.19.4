package phoenix.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import phoenix.testmod.block.ModBlocks;
import phoenix.testmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_DAR);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_PHOEN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_SUPERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_RAW_BLQ);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DAR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLQ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPERN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHOEN_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DAR_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLQ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPERN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHOEN_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.THE_BOYS_LOG).log(ModBlocks.THE_BOYS_LOG).wood(ModBlocks.THE_BOYS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_THE_BOYS_LOG).log(ModBlocks.STRIPPED_THE_BOYS_LOG).wood(ModBlocks.STRIPPED_THE_BOYS_WOOD);


        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THE_BOYS_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THE_BOYS_LEAVES);


        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.THE_BOYS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEVEN_HARVARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PHOEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BLQ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SUPERN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PHOENGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLQGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERNGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARGOT, Models.GENERATED);
    }
}
