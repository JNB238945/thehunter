package thehunter.init;

import thehunter.Reference.Reference;
import thehunter.items.ItemRM;
import thehunter.items.RubiTanAxe;
import thehunter.items.RubiTanPick;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{

    public static final ItemRM PicAxe = new RubiTanPick();
    public static final ItemRM Axe = new RubiTanAxe();

    public static void init()
    {
        GameRegistry.registerItem(PicAxe, "RMPic");
        GameRegistry.registerItem(Axe, "RMAxe");
    }
}
