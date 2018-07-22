package de.derkalaender.ouchglass.proxy;

import de.derkalaender.ouchglass.OuchGlass;
import de.derkalaender.ouchglass.register.ServerRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements IProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OuchGlass.LOGGER.info("PreInit ServerProxy...");

        MinecraftForge.EVENT_BUS.register(new ServerRegistryHandler());
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OuchGlass.LOGGER.info("Init ServerProxy...");
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        OuchGlass.LOGGER.info("PostInit ServerProxy...");
    }
}
