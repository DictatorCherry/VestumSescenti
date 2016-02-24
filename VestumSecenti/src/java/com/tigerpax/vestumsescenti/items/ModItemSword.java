package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.main.Main;

import net.minecraft.item.ItemSword;

public class ModItemSword extends ItemSword{

	public ModItemSword(String uncl, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uncl);
		this.setTextureName(Main.MODID + ":" + uncl);
		this.setCreativeTab(ModItems.tabVS);
	}

}
