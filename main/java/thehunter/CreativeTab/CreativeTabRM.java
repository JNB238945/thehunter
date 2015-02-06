package thehunter.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thehunter.Reference.Reference;
import thehunter.init.ModBlocks;
import thehunter.init.ModItems;

public class CreativeTabRM
{
    public static final CreativeTabs RM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.PicAxe;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "The Hunter";
        }
    };
}
