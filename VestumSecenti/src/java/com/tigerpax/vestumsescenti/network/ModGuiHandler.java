package com.tigerpax.vestumsescenti.network;

import com.tigerpax.vestumsescenti.client.gui.GuiEncyclopedia;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ModGuiHandler implements IGuiHandler {

	public static final int ENCYCLOPEDIA_GUI = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ENCYCLOPEDIA_GUI)
			return new GuiEncyclopedia();
		return null;
	}

}