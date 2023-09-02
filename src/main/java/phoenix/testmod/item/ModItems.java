package phoenix.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import phoenix.testmod.TestMod;

public class ModItems {
    public static final Item STEVEN_HARVARD = registerItem("steven_harvard",
            new Item(new FabricItemSettings()));
    public static final Item RAW_BLQ = registerItem("raw_blq",
            new Item(new FabricItemSettings()));
    public static final Item RAW_DAR = registerItem("raw_dar",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SUPERN = registerItem("raw_supern",
            new Item(new FabricItemSettings()));
    public static final Item RAW_PHOEN = registerItem("raw_phoen",
            new Item(new FabricItemSettings()));
    public static final Item BLQGOT = registerItem("blqgot",
            new Item(new FabricItemSettings()));
    public static final Item DARGOT = registerItem("dargot",
            new Item(new FabricItemSettings()));
    public static final Item SUPERNGOT = registerItem("superngot",
            new Item(new FabricItemSettings()));
    public static final Item PHOENGOT = registerItem("phoengot",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){

        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, STEVEN_HARVARD);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, RAW_BLQ);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, RAW_DAR);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, RAW_SUPERN);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, RAW_PHOEN);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, BLQGOT);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, DARGOT);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, SUPERNGOT);
        addToItemGroup(ModItemGroup.PHOENIX_TESTMOD, PHOENGOT);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModeItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);

        addItemsToItemGroup();
    }
}
