package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	//Shards
	public static Item fireShard;
	public static Item waterShard;
	public static Item airShard;
	public static Item lightningShard;
	public static Item earthShard;
	public static Item iceShard;
	
	//MASTER PLAYEROOK
	public static Item vse;	
	
	//Crystals
	public static Item fireCrystal;
	public static Item waterCrystal;
	public static Item lightningCrystal;
	public static Item earthCrystal;
	public static Item iceCrystal;
	public static Item airCrystal;
	public static Item balancedCrystal;
	
	//Shard Clusters
	public static Item fireSC;
	public static Item waterSC;
	public static Item airSC;
	public static Item earthSC;
	public static Item iceSC;
	public static Item lightningSC;
	public static Item balancedSC;
	
	//Tool Parts
	public static Item toolRod;
	public static Item pickHead;
	
	//Refined Fuel
	public static Item infusedCarbon; //ipsum crystal
	
	//Tools
	public static ModItemPickaxe firePick; //AutoSmelt?
	public static ModItemPickaxe waterPick; //
	public static ModItemPickaxe earthPick; //
	public static ModItemPickaxe airPick; //Haste
	public static ModItemPickaxe icePick;
	public static ModItemPickaxe lightningPick;
	public static final ModItemPickaxe[] pickaxes = {firePick, waterPick, earthPick, airPick, icePick, lightningPick};
	
	//Armors
	public static ModItemArmor fireHead;
	public static ModItemArmor waterHead;
	public static ModItemArmor earthHead;
	public static ModItemArmor airHead;
	public static ModItemArmor iceHead;
	public static ModItemArmor lightningHead;
	public static ModItemArmor fireChest;
	public static ModItemArmor waterChest;
	public static ModItemArmor earthChest;
	public static ModItemArmor airChest;
	public static ModItemArmor iceChest;
	public static ModItemArmor lightningChest;
	public static ModItemArmor fireLegs;
	public static ModItemArmor waterLegs;
	public static ModItemArmor earthLegs;
	public static ModItemArmor airLegs;
	public static ModItemArmor iceLegs;
	public static ModItemArmor lightningLegs;
	public static ModItemArmor fireBoots;
	public static ModItemArmor waterBoots;
	public static ModItemArmor earthBoots;
	public static ModItemArmor airBoots;
	public static ModItemArmor iceBoots;
	public static ModItemArmor lightningBoots;
	
	//Crystal Tool Material for Tools + Armor
	public static ToolMaterial crystalTool = EnumHelper.addToolMaterial("crystal", 4, 3122, 10.0F, 4.5F, 16);
	public static ArmorMaterial crystalArmor = EnumHelper.addArmorMaterial("crystal", 40, new int[] {4, 7, 6, 3}, 35);
	
	
	//Simple Creative Tabs
	public static final CreativeTabs tabVS = new CreativeTabs("Vestum Sescenti"){
		@Override public Item getTabIconItem(){
			return vse;
		}
	};
	
	public static final void init(){
		//Setting Shards
		fireShard = new Item().setUnlocalizedName("fireShard").setTextureName(Main.MODID + ":fireShard").setCreativeTab(tabVS);
		waterShard = new Item().setUnlocalizedName("waterShard").setTextureName(Main.MODID + ":waterShard").setCreativeTab(tabVS);
		airShard = new Item().setUnlocalizedName("airShard").setTextureName(Main.MODID + ":airShard").setCreativeTab(tabVS);
		lightningShard = new Item().setUnlocalizedName("lightningShard").setTextureName(Main.MODID + ":lightningShard").setCreativeTab(tabVS);
		earthShard = new Item().setUnlocalizedName("earthShard").setTextureName(Main.MODID + ":earthShard").setCreativeTab(tabVS);
		iceShard = new Item().setUnlocalizedName("iceShard").setTextureName(Main.MODID + ":iceShard").setCreativeTab(tabVS);
		
		//Setting Crystals
		fireCrystal = new Item().setUnlocalizedName("fireCrystal").setTextureName(Main.MODID + ":fireCrystal").setCreativeTab(tabVS);
		waterCrystal = new Item().setUnlocalizedName("waterCrystal").setTextureName(Main.MODID + ":waterCrystal").setCreativeTab(tabVS);
		airCrystal = new Item().setUnlocalizedName("airCrystal").setTextureName(Main.MODID + ":airCrystal").setCreativeTab(tabVS);
		earthCrystal = new Item().setUnlocalizedName("earthCrystal").setTextureName(Main.MODID + ":earthCrystal").setCreativeTab(tabVS);
		iceCrystal = new Item().setUnlocalizedName("iceCrystal").setTextureName(Main.MODID + ":iceCrystal").setCreativeTab(tabVS);
		lightningCrystal= new Item().setUnlocalizedName("lightningCrystal").setTextureName(Main.MODID + ":lightningCrystal").setCreativeTab(tabVS);
		balancedCrystal = new Item().setUnlocalizedName("balancedCrystal").setTextureName(Main.MODID + ":balancedCrystal").setCreativeTab(tabVS);
		
		//Setting Shard Clusters
		fireSC = new Item().setUnlocalizedName("fireSC").setTextureName(Main.MODID + ":fireSC").setCreativeTab(tabVS);
		waterSC = new Item().setUnlocalizedName("waterSC").setTextureName(Main.MODID + ":waterSC").setCreativeTab(tabVS);
		airSC = new Item().setUnlocalizedName("airSC").setTextureName(Main.MODID + ":airSC").setCreativeTab(tabVS);
		earthSC = new Item().setUnlocalizedName("earthSC").setTextureName(Main.MODID + ":earthSC").setCreativeTab(tabVS);
		iceSC = new Item().setUnlocalizedName("iceSC").setTextureName(Main.MODID + ":iceSC").setCreativeTab(tabVS);
		lightningSC = new Item().setUnlocalizedName("lightningSC").setTextureName(Main.MODID + ":lightningSC").setCreativeTab(tabVS);
		balancedSC = new Item().setUnlocalizedName("balancedSC").setTextureName(Main.MODID + ":balancedSC").setCreativeTab(tabVS);
		
		//Setting ToolParts
		infusedCarbon = new Item().setUnlocalizedName("infusedCarbon").setTextureName(Main.MODID + ":infusedCarbon").setCreativeTab(tabVS);
		toolRod = new Item().setUnlocalizedName("toolRod").setTextureName(Main.MODID + ":toolRod").setCreativeTab(tabVS);
		pickHead = new Item().setUnlocalizedName("pickHead").setTextureName(Main.MODID + ":pickHead").setCreativeTab(tabVS);
		
		//Setting Infused Pickaxes
		firePick = new ModItemPickaxe("firePick", crystalTool);
		waterPick = new ModItemPickaxe("waterPick", crystalTool);
		earthPick = new ModItemPickaxe("earthPick", crystalTool);
		airPick = new ModItemPickaxe("airPick", crystalTool);
		icePick = new ModItemPickaxe("icePick", crystalTool);
		lightningPick = new ModItemPickaxe("lightningPick", crystalTool);
		
		//Setting Armor
		fireHead = new ModItemArmor("fireHead", crystalArmor, "armor", 0, 1);
		fireChest = new ModItemArmor("fireChest", crystalArmor, "armor", 1, 1);
		fireLegs = new ModItemArmor("fireLegs", crystalArmor, "armor", 2, 1);
		fireBoots = new ModItemArmor("fireBoots", crystalArmor, "armor", 3, 1);
		
		waterHead = new ModItemArmor("waterHead", crystalArmor, "armor", 0, 2);
		waterChest = new ModItemArmor("waterChest", crystalArmor, "armor", 1, 2);
		waterLegs = new ModItemArmor("waterLegs", crystalArmor, "armor", 2, 2);
		waterBoots = new ModItemArmor("waterBoots", crystalArmor, "armor", 3, 2);
		
		earthHead = new ModItemArmor("earthHead", crystalArmor, "armor", 0, 3);
		earthChest = new ModItemArmor("earthChest", crystalArmor, "armor", 1, 3);
		earthLegs = new ModItemArmor("earthLegs", crystalArmor, "armor", 2, 3);
		earthBoots = new ModItemArmor("earthBoots", crystalArmor, "armor", 3, 3);
		
		airHead = new ModItemArmor("airHead", crystalArmor, "armor", 0, 4);
		airChest = new ModItemArmor("airChest", crystalArmor, "armor", 1, 4);
		airLegs = new ModItemArmor("airLegs", crystalArmor, "armor", 2, 4);
		airBoots = new ModItemArmor("airBoots", crystalArmor, "armor", 3, 4);
		
		iceHead = new ModItemArmor("iceHead", crystalArmor, "armor", 0, 5);
		iceChest = new ModItemArmor("iceChest", crystalArmor, "armor", 1, 5);
		iceLegs = new ModItemArmor("iceLegs", crystalArmor, "armor", 2, 5);
		iceBoots = new ModItemArmor("iceBoots", crystalArmor, "armor", 3, 5);
		
		lightningHead = new ModItemArmor("lightningHead", crystalArmor, "armor", 0, 6);
		lightningChest = new ModItemArmor("lightningChest", crystalArmor, "armor", 1, 6);
		lightningLegs = new ModItemArmor("lightningLegs", crystalArmor, "armor", 2, 6);
		lightningBoots = new ModItemArmor("lightningBoots", crystalArmor, "armor", 3, 6);
		
		//Setting PLAYERBOOK
		vse = new Item() {
			@Override
			public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
				if(worldIn.isRemote)
					playerIn.openGui(Main.instance, 0, worldIn, (int)playerIn.posX, (int)playerIn.posY, (int)playerIn.posZ);
				return itemStackIn;
			}
			
		}.setUnlocalizedName("vse").setTextureName(Main.MODID + ":vse").setCreativeTab(tabVS);
		
		//Registering Items
		GameRegistry.registerItem(vse, "vse");
		GameRegistry.registerItem(fireShard, "fireShard");
		GameRegistry.registerItem(waterShard, "waterShard");
		GameRegistry.registerItem(airShard, "airShard");
		GameRegistry.registerItem(lightningShard, "lightningShard");
		GameRegistry.registerItem(earthShard, "earthShard");
		GameRegistry.registerItem(iceShard, "iceShard");
		GameRegistry.registerItem(fireCrystal, "fireCrystal");
		GameRegistry.registerItem(waterCrystal, "waterCrystal");
		GameRegistry.registerItem(airCrystal, "airCrystal");
		GameRegistry.registerItem(earthCrystal, "earthCrystal");
		GameRegistry.registerItem(iceCrystal, "iceCrystal");
		GameRegistry.registerItem(lightningCrystal, "lightningCrystal");
		GameRegistry.registerItem(balancedCrystal, "balancedCrystal");
		GameRegistry.registerItem(fireSC, "fireSC");
		GameRegistry.registerItem(waterSC, "waterSC");
		GameRegistry.registerItem(earthSC, "earthSC");
		GameRegistry.registerItem(airSC, "airSC");
		GameRegistry.registerItem(iceSC, "iceSC");
		GameRegistry.registerItem(lightningSC, "lightningSC");
		GameRegistry.registerItem(balancedSC, "balancedSC");
		GameRegistry.registerItem(infusedCarbon, "infusedCarbon");
		GameRegistry.registerItem(toolRod, "toolRod");
		GameRegistry.registerItem(pickHead, "pickHead");
		GameRegistry.registerItem(firePick, "firePick");
		GameRegistry.registerItem(waterPick, "waterPick");
		GameRegistry.registerItem(earthPick, "earthPick");
		GameRegistry.registerItem(airPick, "airPick");
		GameRegistry.registerItem(icePick, "icePick");
		GameRegistry.registerItem(lightningPick, "lightningPick");
		GameRegistry.registerItem(fireHead, "fireHead");
		GameRegistry.registerItem(fireChest, "fireChest");
		GameRegistry.registerItem(fireLegs, "fireLegs");
		GameRegistry.registerItem(fireBoots, "fireBoots");
		GameRegistry.registerItem(waterHead, "waterHead");
		GameRegistry.registerItem(waterChest, "waterChest");
		GameRegistry.registerItem(waterLegs, "waterLegs");
		GameRegistry.registerItem(waterBoots, "waterBoots");
		GameRegistry.registerItem(earthHead, "earthHead");
		GameRegistry.registerItem(earthChest, "earthChest");
		GameRegistry.registerItem(earthLegs, "earthLegs");
		GameRegistry.registerItem(earthBoots, "earthBoots");
		GameRegistry.registerItem(airHead, "airHead");
		GameRegistry.registerItem(airChest, "airChest");
		GameRegistry.registerItem(airLegs, "airLegs");
		GameRegistry.registerItem(airBoots, "airBoots");
		GameRegistry.registerItem(iceHead, "iceHead");
		GameRegistry.registerItem(iceChest, "iceChest");
		GameRegistry.registerItem(iceLegs, "iceLegs");
		GameRegistry.registerItem(iceBoots, "iceBoots");
		GameRegistry.registerItem(lightningHead, "lightningHead");
		GameRegistry.registerItem(lightningChest, "lightningChest");
		GameRegistry.registerItem(lightningLegs, "lightningLegs");
		GameRegistry.registerItem(lightningBoots, "lightningBoots");
	}
}