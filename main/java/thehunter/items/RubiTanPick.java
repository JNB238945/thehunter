package thehunter.items;

import thehunter.CreativeTab.CreativeTabRM;

public class RubiTanPick extends ItemRM
{
    public RubiTanPick()
    {
        super();
        this.setUnlocalizedName("PicAxe");
        this.setCreativeTab(CreativeTabRM.RM_TAB);
        this.setMaxDamage(2000);
        this.setHarvestLevel("pickaxe", 3);
        this.setMaxStackSize(1);
    }


}
