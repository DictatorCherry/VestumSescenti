package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.Main;
import net.minecraft.item.ItemHoe;

public class ModItemHoe extends ItemHoe{
	public ModItemHoe(String uncl, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uncl);
		this.setTextureName(Main.MODID + ":" + uncl);
		this.setCreativeTab(ModItems.tabVS);
	}
}
