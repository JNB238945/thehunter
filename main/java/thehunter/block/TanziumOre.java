package thehunter.block;

import net.minecraft.item.Item;
import net.minecraft.util.WeightedRandom;
import thehunter.CreativeTab.CreativeTabRM;

import java.util.Random;

public class TanziumOre extends BlockRM
{
    public TanziumOre()
    {
        super();
        this.setBlockName("TanziumOre");
        this.setHardness(3.0f);
        this.setResistance(10.0f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabRM.RM_TAB);
        this.setHarvestLevel("pickaxe", 3);
    }
}
