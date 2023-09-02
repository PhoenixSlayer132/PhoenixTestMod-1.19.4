package phoenix.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import phoenix.testmod.block.ModBlocks;
import phoenix.testmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_BLQ), RecipeCategory.MISC, ModItems.BLQGOT,
                2.0f, 200, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModItems.RAW_PHOEN), RecipeCategory.MISC, ModItems.PHOENGOT,
                2.0f, 200, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModItems.RAW_SUPERN), RecipeCategory.MISC, ModItems.SUPERNGOT,
                2.0f, 200, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModItems.RAW_DAR), RecipeCategory.MISC, ModItems.DARGOT,
                2.0f, 200, "Phoenix Testmod");

        offerBlasting(exporter, List.of(ModItems.RAW_BLQ), RecipeCategory.MISC, ModItems.BLQGOT,
                2.0f, 100, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModItems.RAW_PHOEN), RecipeCategory.MISC, ModItems.PHOENGOT,
                2.0f, 100, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModItems.RAW_SUPERN), RecipeCategory.MISC, ModItems.SUPERNGOT,
                2.0f, 100, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModItems.RAW_DAR), RecipeCategory.MISC, ModItems.DARGOT,
                2.0f, 100, "Phoenix Testmod");

        offerSmelting(exporter, List.of(ModBlocks.BLQ_ORE), RecipeCategory.MISC, ModItems.BLQGOT,
                1.0f, 400, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModBlocks.PHOEN_ORE), RecipeCategory.MISC, ModItems.PHOENGOT,
                1.0f, 400, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModBlocks.SUPERN_ORE), RecipeCategory.MISC, ModItems.SUPERNGOT,
                1.0f, 400, "Phoenix Testmod");
        offerSmelting(exporter, List.of(ModBlocks.DAR_ORE), RecipeCategory.MISC, ModItems.DARGOT,
                1.0f, 400, "Phoenix Testmod");

        offerBlasting(exporter, List.of(ModBlocks.BLQ_ORE), RecipeCategory.MISC, ModItems.BLQGOT,
                1.0f, 200, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModBlocks.PHOEN_ORE), RecipeCategory.MISC, ModItems.PHOENGOT,
                1.0f, 200, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModBlocks.SUPERN_ORE), RecipeCategory.MISC, ModItems.SUPERNGOT,
                1.0f, 200, "Phoenix Testmod");
        offerBlasting(exporter, List.of(ModBlocks.DAR_ORE), RecipeCategory.MISC, ModItems.DARGOT,
                1.0f, 200, "Phoenix Testmod");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLQGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLQ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PHOENGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PHOEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SUPERNGOT, RecipeCategory.DECORATIONS,
                ModBlocks.SUPERN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DARGOT, RecipeCategory.DECORATIONS,
                ModBlocks.DAR_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BLQ, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_BLQ);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PHOEN, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_PHOEN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SUPERN, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_SUPERN);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DAR, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_DAR);

        /* ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmors.PHOEN_HELMET)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.PHOENGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.PHOENGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.PHOENGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModArmors.PHOEN_HELMET)));*/
    }
}
