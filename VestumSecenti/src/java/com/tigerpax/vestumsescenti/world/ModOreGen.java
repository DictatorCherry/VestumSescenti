package com.tigerpax.vestumsescenti.world;

import java.util.Random;
import com.tigerpax.vestumsescenti.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModOreGen implements IWorldGenerator{
	
	private WorldGenerator genFireOre;
	private WorldGenerator genWaterOre;
	private WorldGenerator genAirOre;
	private WorldGenerator genEarthOre;
	private WorldGenerator genIceOre;
	private WorldGenerator genLightningOre;
	
	private WorldGenerator genFireCOre;
	private WorldGenerator genWaterCOre;
	private WorldGenerator genAirCOre;
	private WorldGenerator genEarthCOre;
	private WorldGenerator genIceCOre;
	private WorldGenerator genLightningCOre;
	
	private WorldGenerator genInfusedRock;
	
	
	public ModOreGen(){
		//Defining Shard Ore Generator
		this.genFireOre = new WorldGenMinable(ModBlocks.fireOre, 6);
		this.genWaterOre = new WorldGenMinable(ModBlocks.waterOre, 6);
		this.genAirOre = new WorldGenMinable(ModBlocks.airOre, 6);
		this.genEarthOre = new WorldGenMinable(ModBlocks.iceOre, 6);
		this.genIceOre = new WorldGenMinable(ModBlocks.earthOre, 6);
		this.genLightningOre = new WorldGenMinable(ModBlocks.lightningOre, 6);
		
		this.genInfusedRock = new WorldGenSingleMinable(ModBlocks.infusedRock);
		//Defining Crystal Ore Generator
		this.genFireCOre = new WorldGenSingleMinable(ModBlocks.fireCOre);
		this.genWaterCOre = new WorldGenSingleMinable(ModBlocks.waterCOre);
		this.genAirCOre = new WorldGenSingleMinable(ModBlocks.airCOre);
		this.genEarthCOre = new WorldGenSingleMinable(ModBlocks.earthCOre);
		this.genIceCOre = new WorldGenSingleMinable(ModBlocks.iceCOre);
		this.genLightningCOre = new WorldGenSingleMinable(ModBlocks.lightningCOre);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.dimensionId) {
	    case 0:
	    	//Running Generators for Shard Ore
	    	this.runGenerator(this.genFireOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	this.runGenerator(this.genWaterOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	this.runGenerator(this.genAirOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	this.runGenerator(this.genEarthOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	this.runGenerator(this.genIceOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	this.runGenerator(this.genLightningOre, world, random, chunkX, chunkZ, 10, 0, 64);
	    	
	    	//Running Generators for Crystal Ore
	    	this.runGenerator(this.genFireCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	this.runGenerator(this.genWaterCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	this.runGenerator(this.genAirCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	this.runGenerator(this.genEarthCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	this.runGenerator(this.genIceCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	this.runGenerator(this.genLightningCOre, world, random, chunkX, chunkZ, 4, 0, 20);
	    	
	    	this.runGenerator(this.genInfusedRock, world, random, chunkX, chunkZ, 40, 0, 64);
	        break;
	    case -1:

	        break;
	    case 1:

	        break;
	    }
	}
	//End Generate
	
	
}
