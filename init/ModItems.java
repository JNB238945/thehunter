package thehunter.init;

import thehunter.Reference.Reference;
import thehunter.items.ItemRM;
import thehunter.items.RubiTanPick;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{

    public static final ItemRM PicAxe = new RubiTanPick();

    public static void init()
    {
        GameRegistry.registerItem(PicAxe, "Rangers_Pick_axe");
    }
}
