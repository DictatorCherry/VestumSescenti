package com.tigerpax.vestumsescenti.crafting;

import com.tigerpax.vestumsescenti.blocks.ModBlocks;
import com.tigerpax.vestumsescenti.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class ModCrafting {
	
	public static void modCrafting(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fireCrystalB), new Object[] {"###", "###", "###", '#', ModItems.fireCrystal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.waterCrystalB), new Object[] {"###", "###", "###", '#', ModItems.waterCrystal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.earthCrystalB), new Object[] {"###", "###", "###", '#', ModItems.earthCrystal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.airCrystalB), new Object[] {"###", "###", "###", '#', ModItems.airCrystal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.iceCrystalB), new Object[] {"###", "###", "###", '#', ModItems.iceCrystal});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lightningCrystalB), new Object[] {"###", "###", "###", '#', ModItems.lightningCrystal});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.fireSC), new Object[] { "##", "##", "##", '#', ModItems.fireShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.waterSC), new Object[] { "##", "##", "##", '#', ModItems.waterShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.earthSC), new Object[] { "##", "##", "##", '#', ModItems.earthShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.airSC), new Object[] { "##", "##", "##", '#', ModItems.airShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.iceSC), new Object[] { "##", "##", "##", '#', ModItems.iceShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.lightningSC), new Object[] { "##", "##", "##", '#', ModItems.lightningShard});
		/*
		GameRegistry.addRecipe(new ItemStack(ModItems.pickHead), new Object[] { "C#C", "#C#", '#', ModBlocks.infusedRock, 'C', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.toolRod), new Object[] {"C#C","C#C","C#C", '#', ModBlocks.infusedRock ,'C', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.firePick), new Object[] {"#T#", " C ", " C ", '#', ModItems.fireCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
		GameRegistry.addRecipe(new ItemStack(ModItems.waterPick), new Object[] {"#T#", " C ", " C ", '#', ModItems.waterCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
		GameRegistry.addRecipe(new ItemStack(ModItems.earthPick), new Object[] {"#T#", " C ", " C ", '#', ModItems.earthCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
		GameRegistry.addRecipe(new ItemStack(ModItems.airPick), new Object[] {"#T#", " C ", " C ", '#', ModItems.airCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
		GameRegistry.addRecipe(new ItemStack(ModItems.icePick), new Object[] {"#T#", " C ", " C ", '#', ModItems.iceCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
		GameRegistry.addRecipe(new ItemStack(ModItems.lightningPick), new Object[] {"#T#", " C ", " C ", '#', ModItems.lightningCrystal, 'T', ModItems.pickHead, 'C', ModItems.toolRod});
				*/
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.balancedCrystal), ModItems.fireCrystal, ModItems.waterCrystal, ModItems.earthCrystal, ModItems.airCrystal,
				ModItems.iceCrystal, ModItems.lightningCrystal);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.balancedSC), ModItems.fireSC, ModItems.waterSC, ModItems.earthSC, ModItems.airSC, ModItems.iceSC, ModItems.lightningSC);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vse), ModItems.balancedSC, Items.book, ModItems.balancedCrystal);
	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fireCrystal, 9), ModBlocks.fireCrystalB);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.waterCrystal, 9), ModBlocks.waterCrystalB);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.earthCrystal, 9), ModBlocks.earthCrystalB);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.airCrystal, 9), ModBlocks.airCrystalB);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iceCrystal, 9), ModBlocks.iceCrystalB);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lightningCrystal, 9), ModBlocks.lightningCrystalB);
		
		GameRegistry.addSmelting(ModBlocks.infusedRock, new ItemStack(ModItems.infusedCarbon), 4.0F);
		GameRegistry.addSmelting(ModBlocks.fireCOre, new ItemStack(ModItems.fireCrystal), 4.0F);
		GameRegistry.addSmelting(ModBlocks.waterCOre, new ItemStack(ModItems.waterCrystal), 4.0F);
		GameRegistry.addSmelting(ModBlocks.earthCOre, new ItemStack(ModItems.earthCrystal), 4.0F);
		GameRegistry.addSmelting(ModBlocks.airCOre, new ItemStack(ModItems.airCrystal), 4.0F);
		GameRegistry.addSmelting(ModBlocks.iceCOre, new ItemStack(ModItems.iceCrystal), 4.0F);
		GameRegistry.addSmelting(ModBlocks.lightningCOre, new ItemStack(ModItems.lightningCrystal), 4.0F);
		
	}
}