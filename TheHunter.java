package thehunter;

//Imports
import thehunter.Handler.ConfigurationHandler;
import thehunter.Proxy.iProxy;
import thehunter.Reference.Reference;
import thehunter.Utility.LogHelper;
import thehunter.init.ModBlocks;
import thehunter.init.ModItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import thehunter.init.Recipes;

//FML FMC Identification
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME , version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

//Main Class
public class TheHunter {

    //Reference this instance of mod
    @Mod.Instance("thehunter")
    public static TheHunter instance;

    //Server Client Communication.
    @SidedProxy(clientSide = "thehunter.Proxy.ClientProxyClass", serverSide = "thehunter.Proxy.ServerProxyClass")
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("PreInitialization Complete.");
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete.");
    }
}
