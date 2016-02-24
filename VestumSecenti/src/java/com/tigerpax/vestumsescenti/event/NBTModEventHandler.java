package com.tigerpax.vestumsescenti.event;

import com.tigerpax.vestumsescenti.main.ClientProxy;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;

public class NBTModEventHandler {
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled = false)
	public void onSkillUpdate(){
		
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled = true)
	public void onKeyPressESC(KeyInputEvent event){
		System.out.println("The world hears keys.");
		
		KeyBinding[] keyBindings = ClientProxy.keyBindings;
		
		if(keyBindings[0].isPressed()){
			System.out.println("Reset the GUI, "+ keyBindings[0].getKeyDescription());
		}
	}
}