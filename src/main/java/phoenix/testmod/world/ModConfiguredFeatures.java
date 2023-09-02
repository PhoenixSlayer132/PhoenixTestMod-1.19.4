package phoenix.testmod.world;

import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import phoenix.testmod.TestMod;
import phoenix.testmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> THE_BOYS_KEY = registerKey("the_boys");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLQ_ORE_KEY = registerKey("blq_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOEN_ORE_KEY = registerKey("phoen_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUPERN_ORE_KEY = registerKey("supern_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DAR_ORE_KEY = registerKey("dar_ore");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest magmaReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest endstoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest prismarineReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest obsidianReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldBlqOres =
                List.of(OreFeatureConfig.createTarget(prismarineReplacables, ModBlocks.BLQ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherPhoenOres =
                List.of(OreFeatureConfig.createTarget(magmaReplacables, ModBlocks.PHOEN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endSupernOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplacables, ModBlocks.SUPERN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endDarOres =
                List.of(OreFeatureConfig.createTarget(obsidianReplaceables, ModBlocks.DAR_ORE.getDefaultState()));

        register(context, THE_BOYS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.THE_BOYS_LOG),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.of(ModBlocks.THE_BOYS_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TestMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
