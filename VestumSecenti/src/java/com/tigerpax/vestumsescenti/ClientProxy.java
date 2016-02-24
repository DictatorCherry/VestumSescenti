package com.tigerpax.vestumsescenti;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy{
	
	public static KeyBinding[] keyBindings;
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
    	keyBindings = new KeyBinding[1];
    	keyBindings[0] = new KeyBinding("key.eventgui.resetgui", Keyboard.KEY_ESCAPE, "key.vs.category");
    	ClientRegistry.registerKeyBinding(keyBindings[0]);
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
