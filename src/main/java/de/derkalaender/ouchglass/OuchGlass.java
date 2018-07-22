package de.derkalaender.ouchglass;

import de.derkalaender.ouchglass.proxy.IProxy;
import de.derkalaender.ouchglass.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = OuchGlass.MODID, name = OuchGlass.NAME, version = OuchGlass.VERSION)
public class OuchGlass {

    public static final String MODID = "ouchglass";
    public static final String NAME = "OuchGlass!";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance(MODID)
    public static OuchGlass INSTANCE;

    @SidedProxy(clientSide = "de.derkalaender.ouchglass.proxy.ClientProxy", serverSide = "de,derkalaender.ouchglass.proxy.ServerProxy")
    public static IProxy PROXY;

    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        OuchGlass.LOGGER.info("Starting PreInit...");

        PROXY.preInit(event);

        OuchGlass.LOGGER.info("PreInit finished.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        OuchGlass.LOGGER.info("Starting Init...");

        PROXY.init(event);

        OuchGlass.LOGGER.info("Init finished.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        OuchGlass.LOGGER.info("Starting PostInit...");

        PROXY.postInit(event);

        OuchGlass.LOGGER.info("PostInit finished.");
    }
}
