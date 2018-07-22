package de.derkalaender.ouchglass.proxy;

import de.derkalaender.ouchglass.register.ClientRegistryHandler;
import de.derkalaender.ouchglass.OuchGlass;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OuchGlass.LOGGER.info("PreInit ClientProxy...");

        MinecraftForge.EVENT_BUS.register(new ClientRegistryHandler());
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OuchGlass.LOGGER.info("Init ClientProxy...");
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        OuchGlass.LOGGER.info("PostInit ClientProxy...");
    }
}
