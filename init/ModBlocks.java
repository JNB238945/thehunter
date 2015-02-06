package thehunter.init;

import cpw.mods.fml.common.registry.GameRegistry;
import thehunter.Reference.Reference;
import thehunter.block.BlockRM;
import thehunter.block.RubiouxOre;
import thehunter.block.TanziumOre;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final BlockRM TanziumOre = new TanziumOre();
    public static final BlockRM RubiouxOre = new RubiouxOre();

    public static void init()
    {
        GameRegistry.registerBlock(TanziumOre, "tanziumore");
        GameRegistry.registerBlock(RubiouxOre, "rubiouxore");
    }
}
