package com.tigerpax.vestumsescenti.blocks;

import com.tigerpax.vestumsescenti.items.ModFuelHandler;
import com.tigerpax.vestumsescenti.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	//Shard Ore
	public static Block fireOre;
	public static Block airOre;
	public static Block waterOre;
	public static Block lightningOre;
	public static Block earthOre;
	public static Block iceOre;
	
	//Crystal Ore
	public static Block fireCOre;
	public static Block waterCOre;
	public static Block airCOre;
	public static Block earthCOre;
	public static Block iceCOre;
	public static Block lightningCOre;
	
	//Crystal Blocks
	public static Block fireCrystalB;
	public static Block iceCrystalB;
	public static Block earthCrystalB;
	public static Block waterCrystalB;
	public static Block airCrystalB;
	public static Block lightningCrystalB;
	
	//Refined Fuel
	public static Block infusedRock;
	
	
	public static final void init(){
		//Registering Shard Ore
		GameRegistry.registerBlock(fireOre = new Ore("fireOre", Material.iron, ModItems.fireShard), "fireOre");
		GameRegistry.registerBlock(airOre = new Ore("airOre", Material.iron, ModItems.airShard), "airOre");
		GameRegistry.registerBlock(waterOre = new Ore("waterOre", Material.iron, ModItems.waterShard), "waterOre");
		GameRegistry.registerBlock(lightningOre = new Ore("lightningOre", Material.iron, ModItems.lightningShard), "lightningOre");
		GameRegistry.registerBlock(earthOre = new Ore("earthOre", Material.iron, ModItems.earthShard), "earthOre");
		GameRegistry.registerBlock(iceOre = new Ore("iceOre", Material.iron, ModItems.iceShard), "iceOre");
		
		//Registering Crystal Ore
		GameRegistry.registerBlock(fireCOre = new SmeltOre("fireCOre", Material.iron), "fireCOre");
		GameRegistry.registerBlock(waterCOre = new SmeltOre("waterCOre", Material.iron), "waterCOre");
		GameRegistry.registerBlock(airCOre = new SmeltOre("airCOre", Material.iron), "airCOre");
		GameRegistry.registerBlock(earthCOre = new SmeltOre("earthCOre", Material.iron), "earthCOre");
		GameRegistry.registerBlock(iceCOre = new SmeltOre("iceCOre", Material.iron), "iceCOre");
		GameRegistry.registerBlock(lightningCOre = new SmeltOre("lightningCOre", Material.iron), "lightningCOre");
		
		//Registering Crystal Blocks
		GameRegistry.registerBlock(fireCrystalB = new Crystal("fireCrystalB", Material.iron), "fireCrystalB");
		GameRegistry.registerBlock(iceCrystalB = new Crystal("iceCrystalB", Material.iron), "iceCrystalB");
		GameRegistry.registerBlock(earthCrystalB = new Crystal("earthCrystalB", Material.iron), "earthCrystalB");
		GameRegistry.registerBlock(waterCrystalB = new Crystal("waterCrystalB", Material.iron), "waterCrystalB");
		GameRegistry.registerBlock(airCrystalB = new Crystal("airCrystalB", Material.iron), "airCrystalB");
		GameRegistry.registerBlock(lightningCrystalB = new Crystal("lightningCrystalB", Material.iron), "lightningCrystalB");
		
		//Refined Fuel
		GameRegistry.registerBlock(infusedRock = new SmeltOre("infusedRock", Material.iron), "infusedRock");
		GameRegistry.registerFuelHandler(new ModFuelHandler());
		
	}
}