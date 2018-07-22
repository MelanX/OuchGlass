package de.derkalaender.ouchglass.register;

import de.derkalaender.ouchglass.blocks.ModBlocks;
import de.derkalaender.ouchglass.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ServerRegistryHandler {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    @SubscribeEvent
    public void onBlockRegistry(RegistryEvent.Register<Block> event) {
        ModBlocks.init();

        for(Block block : BLOCKS) {
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> event) {
        ModItems.init();

        for(Item item : ITEMS) {
            event.getRegistry().register(item);
        }
    }
}
