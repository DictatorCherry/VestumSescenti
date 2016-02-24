package com.tigerpax.vestumsescenti.items;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.tigerpax.vestumsescenti.main.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ModItemTools extends ItemPickaxe{
	//TODO FINISH CLASS

	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium, Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
	
	protected ModItemTools(String uncln, ToolMaterial mat){
		super(mat);
		this.setUnlocalizedName(uncln);
		this.setTextureName(Main.MODID + ":" + uncln);
	} 
	
	@Override
	public float func_150893_a(ItemStack stack, Block block) {
	    return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	}
	
	@Override
	public boolean func_150897_b(Block block) {
	    return effectiveAgainst.contains(block) ? true : super.func_150897_b(block);
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack stack){
		return ImmutableSet.of("pickaxe", "spade", "axe");
	}
}
