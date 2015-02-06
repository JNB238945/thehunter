package thehunter.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.PicAxe), new Object[]
                {
                        "xxx",
                        " y ",
                        " y ",
                        'x', ModBlocks.TanziumOre, 'y', Items.stick
                });


      // "ttt", " s ", " s ", "t", new ItemStack(ModBlocks.TanziumOre), "s", new ItemStack(Items.stick));
    }
}
