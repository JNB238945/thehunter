package thehunter.items;

import thehunter.CreativeTab.CreativeTabRM;

public class RubiTanAxe extends ItemRM
{
    public RubiTanAxe()
    {
        super();
        this.setUnlocalizedName("Axe");
        this.setCreativeTab(CreativeTabRM.RM_TAB);
        this.setMaxStackSize(1);
        this.setHarvestLevel("axe", 3);
    }
}
