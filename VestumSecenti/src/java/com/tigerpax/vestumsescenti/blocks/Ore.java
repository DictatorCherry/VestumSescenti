package com.tigerpax.vestumsescenti.blocks;

import java.util.Random;

import com.tigerpax.vestumsescenti.items.ModItems;
import com.tigerpax.vestumsescenti.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Ore extends Block{
	
	private Item drop;
	private int meta;
	private int leastQuantity;
	private int mostQuantity;
	
	protected Ore(String unlcName,Material mat, Item drop, int meta, int leastQuantity, int mostQuantity){
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.leastQuantity = leastQuantity;
		this.mostQuantity = mostQuantity;
		this.setBlockName(unlcName);
		this.setBlockTextureName(Main.MODID + ":" + unlcName);
		this.setCreativeTab(ModItems.tabVS);
		this.setHardness(2.0F);
		this.setResistance(6.0F); 
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}
	
	protected Ore(String unlcName, Material mat, Item drop, int leastQuantity, int mostQuantity){
		this(unlcName, mat, drop, 0, leastQuantity, mostQuantity);
	}
	
	protected Ore(String unlcName, Material mat, Item drop){
		this(unlcName, mat, drop, 2, 2);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune){
		return this.drop;
	}
	
	@Override
	public int damageDropped(int metadata){
		return this.meta;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		if(this.leastQuantity >= this.mostQuantity)
			return this.leastQuantity;
		return this.leastQuantity + random.nextInt(this.mostQuantity - this.leastQuantity + fortune + 1);
	}
}
