package com.tigerpax.vestumsescenti;


import com.tigerpax.vestumsescenti.event.ModEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "vs";
	public static final String MODNAME = "Vestum Sescenti";
	public static final String VERSION = "0.0.1";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide = "com.tigerpax.vestumsescenti.ClientProxy",
			    serverSide = "com.tigerpax.vestumsescenti.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
        proxy.init(e);        
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
        FMLCommonHandler.instance().bus().register(new ModEventHandler());
	}
}

