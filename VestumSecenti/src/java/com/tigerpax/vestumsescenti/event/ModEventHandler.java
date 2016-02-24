package com.tigerpax.vestumsescenti.event;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;

public class ModEventHandler {
	public void registerEventListeners(){
		System.out.print("The World is listening.");
		
		FMLCommonHandler.instance().bus().register(new NBTModEventHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
	}
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event){
		if(event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity )== null)
			ExtendedPlayer.register((EntityPlayer) event.entity);
		if(event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null)
			event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer((EntityPlayer) event.entity));
	}
}
