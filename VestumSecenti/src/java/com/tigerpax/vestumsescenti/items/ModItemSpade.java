package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.Main;
import net.minecraft.item.ItemSpade;

public class ModItemSpade extends ItemSpade{
	public ModItemSpade(String uncl, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uncl);
		this.setTextureName(Main.MODID + ":" + uncl);
		this.setCreativeTab(ModItems.tabVS);
	}
}
