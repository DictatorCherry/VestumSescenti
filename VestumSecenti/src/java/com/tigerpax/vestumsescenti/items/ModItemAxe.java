package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.main.Main;

import net.minecraft.item.ItemAxe;

public class ModItemAxe extends ItemAxe{
	public ModItemAxe(String uncl, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uncl);
		this.setTextureName(Main.MODID + ":" + uncl);
		this.setCreativeTab(ModItems.tabVS);
	}
}
