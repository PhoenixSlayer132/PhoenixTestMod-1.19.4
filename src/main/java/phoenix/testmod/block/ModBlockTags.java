package phoenix.testmod.block;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> PHOEN_ORE = TagKey.of(RegistryKeys.BLOCK, new Identifier("testmod", "phoen_ore"));
    public static final TagKey<Block> BLQ_ORE = TagKey.of(RegistryKeys.BLOCK, new Identifier("testmod", "blq_ore"));
    public static final TagKey<Block> SUPERN_ORE = TagKey.of(RegistryKeys.BLOCK, new Identifier("testmod", "supern_ore"));
    public static final TagKey<Block> DAR_ORE = TagKey.of(RegistryKeys.BLOCK, new Identifier("testmod", "dar_ore"));

    public static final TagKey<Block> MAGMA_ORE_REPLACABLES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft", "magma_block"));
    public static final TagKey<Block> PRISMARINE_ORE_REPLACABLES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft", "prismarine"));
    public static final TagKey<Block> END_STONE_ORE_REPLACABLES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft", "end_stone"));
    public static final TagKey<Block> OBSIDIAN_ORE_REPLACABLES = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft", "obsidian"));
}
