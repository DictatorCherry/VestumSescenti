package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.Main;
import net.minecraft.item.ItemPickaxe;

public class ModItemPickaxe extends ItemPickaxe{
	public ModItemPickaxe(String uncl, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(uncl);
		this.setTextureName(Main.MODID + ":" + uncl);
		this.setCreativeTab(ModItems.tabVS);
	}
}
