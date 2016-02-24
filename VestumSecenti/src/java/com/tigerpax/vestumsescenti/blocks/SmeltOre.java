package com.tigerpax.vestumsescenti.blocks;

import com.tigerpax.vestumsescenti.Main;
import com.tigerpax.vestumsescenti.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SmeltOre extends Block{
	
	protected SmeltOre(String unlcName,Material mat){
		super(mat);
		this.setBlockName(unlcName);
		this.setBlockTextureName(Main.MODID + ":" + unlcName);
		this.setCreativeTab(ModItems.tabVS);
		this.setHardness(2.0F);
		this.setResistance(6.0F); 
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}
	
	protected SmeltOre(String unlc, Material mat, boolean x){
		super(mat);
		this.setBlockName(unlc);
		this.setBlockTextureName(Main.MODID + ":" + unlc);
		this.setCreativeTab(ModItems.tabVS);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(soundTypeStone);
	}
}
