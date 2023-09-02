package phoenix.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import phoenix.testmod.TestMod;

public class ModItemGroup {
    public static ItemGroup PHOENIX_TESTMOD;

    public static void registerItemGroups(){
        PHOENIX_TESTMOD = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID, "phoenix_testmod"))
                .displayName(Text.literal("Phoenix Testmod"))
                .icon(() -> new ItemStack(ModItems.STEVEN_HARVARD)).build();
    }



}
