package thehunter.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        // Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.PicAxe), new Object[]{"xxx", " y ", " y ", 'x', ModBlocks.TanziumOre, 'y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.Axe), new Object[]{"xx ", "xy ", " y ", 'x', ModBlocks.TanziumOre, 'y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItems.shovel), new Object[]{" x ", " y ", " y ", 'x', ModBlocks.TanziumOre, 'y', Items.stick});

        // Weapons

        //Items
        GameRegistry.addRecipe(new ItemStack(ModItems.rHandle), new Object[]{"  x", " x ", "x  ", 'x', ModItems.rPowder,});


        // Smelting
        GameRegistry.addSmelting(new ItemStack(ModBlocks.RubiouxOre), new ItemStack(ModItems.rPowder), 0.1f);
        //GameRegistry.addSmelting(new ItemStack(ModBlocks.TanziumOre), new ItemStack(ModBlocks.tIngot), 0.1f);

    }
}
