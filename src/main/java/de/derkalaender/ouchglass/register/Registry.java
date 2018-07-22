package de.derkalaender.ouchglass.register;

import de.derkalaender.ouchglass.OuchGlass;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Objects;

public class Registry {

    public static void registerItem(Item item, String name) {
        item.setUnlocalizedName(OuchGlass.MODID + "." + name);
        item.setRegistryName(OuchGlass.MODID, name);

        ServerRegistryHandler.ITEMS.add(item);
    }

    public static void registerBlock(Block block, String name) {
        block.setUnlocalizedName(OuchGlass.MODID + "." + name);
        block.setRegistryName(OuchGlass.MODID, name);

        ServerRegistryHandler.BLOCKS.add(block);
    }

    public static void registerModel(Item item) {
        registerAnyModel(item);
    }

    public static void registerModel(Block block) {
        registerAnyModel(block);
    }

    private static void registerAnyModel(Object obj) {
        if(obj instanceof Item) {
            Item item = (Item) obj;
            ClientRegistryHandler.MODELS.put(new ItemStack(item), new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
        } else {
            Block block = (Block) obj;
            ClientRegistryHandler.MODELS.put(new ItemStack(block), new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory"));
        }
    }
}
