package thehunter.init;

import thehunter.Reference.Reference;
import thehunter.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

import javax.print.attribute.standard.MediaSize;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{

    //Tools
    public static final ItemRM PicAxe = new RubiTanPick();
    public static final ItemRM Axe = new RubiTanAxe();
    public static final ItemRM shovel = new RubiTanShovel();
    public static final ItemRM hoe = new RubiTanHoe();

    // Items
    public static final ItemRM rPowder = new RubiouxPowder();
    public static final ItemRM rHandle = new Rubioux_Handle();

    public static void init()
    {
        //Tools
        GameRegistry.registerItem(PicAxe, "RMPic");
        GameRegistry.registerItem(Axe, "RMAxe");
        GameRegistry.registerItem(shovel, "RMShovel");
        GameRegistry.registerItem(hoe, "RMHoe");

        //Items
        GameRegistry.registerItem(rPowder, "rPowder");
        GameRegistry.registerItem(rHandle, "rHandle");
    }
}
