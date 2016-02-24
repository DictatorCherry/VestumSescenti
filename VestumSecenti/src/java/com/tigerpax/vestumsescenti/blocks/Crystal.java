package com.tigerpax.vestumsescenti.blocks;

import com.tigerpax.vestumsescenti.items.ModItems;
import com.tigerpax.vestumsescenti.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class Crystal extends Block{
	
	protected Crystal(String unlcName, Material mat) {
		super(mat);
		this.setBlockName(unlcName);
		this.setBlockTextureName(Main.MODID + ":" + unlcName);
		this.setCreativeTab(ModItems.tabVS);
		this.setHardness(5.0F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		
	}
	
}
