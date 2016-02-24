package com.tigerpax.vestumsescenti.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSingleMinable extends WorldGenerator{
	
	private Block block;
	private Block target;
	private int blockMeta;
	
	public WorldGenSingleMinable(Block block, Block target, int blockMeta){
		this.block = block;
		this.target = target;
		this.blockMeta = blockMeta;
	}
	
	public WorldGenSingleMinable(Block block, Block target){
		this(block, target, 0);
	}
	
	public WorldGenSingleMinable(Block block){
		this(block, Blocks.stone);
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		if (world.getBlock(x, y, z).isReplaceableOreGen(world, x, y, z, this.target))
	        world.setBlock(x, y, z, this.block, this.blockMeta, 2);
	    return true;
	}
}
