package de.derkalaender.ouchglass.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

public class ClientRegistryHandler {

    public static final Map<ItemStack, ModelResourceLocation> MODELS = new HashMap<>();

    @SubscribeEvent
    public void onModelRegistry(ModelRegistryEvent event) {
        for(Map.Entry<ItemStack, ModelResourceLocation> entry : MODELS.entrySet()) {
            ModelLoader.setCustomModelResourceLocation(entry.getKey().getItem(), entry.getKey().getItemDamage(), entry.getValue());
        }
    }
}
