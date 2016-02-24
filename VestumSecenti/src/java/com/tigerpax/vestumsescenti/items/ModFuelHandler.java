package com.tigerpax.vestumsescenti.items;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
	        Item itemFuel = fuel.getItem(); //Use to get item off an ItemStack
	        if (itemFuel == ModItems.infusedCarbon)
	        {
	            return 6400;
	        }
	        else return 0;
	        
	}
}
