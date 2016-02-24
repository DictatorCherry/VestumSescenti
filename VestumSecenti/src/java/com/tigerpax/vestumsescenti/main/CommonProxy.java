package com.tigerpax.vestumsescenti.main;

import com.tigerpax.vestumsescenti.blocks.ModBlocks;
import com.tigerpax.vestumsescenti.crafting.ModCrafting;
import com.tigerpax.vestumsescenti.items.ModItems;
import com.tigerpax.vestumsescenti.network.ModGuiHandler;
import com.tigerpax.vestumsescenti.world.ModOreGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy{
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    	ModBlocks.init();
    	ModCrafting.modCrafting();
    }

    public void init(FMLInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new ModOreGen(), 0);
    	NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new ModGuiHandler());
    }
    
    public void postInit(FMLPostInitializationEvent e) {

    }
}
