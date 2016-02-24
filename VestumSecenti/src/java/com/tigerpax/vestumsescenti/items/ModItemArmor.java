package com.tigerpax.vestumsescenti.items;

import com.tigerpax.vestumsescenti.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemArmor extends ItemArmor{
	public String textureName;
	private int infusionType;
	private static ModItemArmor[][] armorArr = {{ModItems.fireHead, ModItems.fireChest, ModItems.fireLegs, ModItems.fireBoots}, 
				{ModItems.waterHead, ModItems.waterChest, ModItems.waterLegs, ModItems.waterBoots},
				{ModItems.earthHead, ModItems.earthChest, ModItems.earthLegs, ModItems.earthBoots},
				{ModItems.airHead, ModItems.airChest, ModItems.airLegs, ModItems.airBoots},
				{ModItems.iceHead, ModItems.iceChest, ModItems.iceLegs, ModItems.iceBoots},
				{ModItems.lightningHead, ModItems.lightningChest, ModItems.lightningLegs, ModItems.lightningBoots}};
	
	public ModItemArmor(String uncln, ArmorMaterial mat, String textureName, int type, int infusionType){
		super(mat, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(uncln);
	    this.setTextureName(Main.MODID + ":" + uncln);
	    this.setCreativeTab(ModItems.tabVS);
	}
	
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item){
		Boolean temp = isDiverse(item, player);
		if(temp)
			setInfusion(item, player);
	}
	
	
	
	public int getInfusionType(){
		return infusionType;
	}
	
	
	
	
	public Boolean isDiverse(ItemStack item, EntityLivingBase player){
		int tempType = 0;
		int numTypes = 0;
		
		for(int i = 4; i > 0; i--){
		 if(player.getEquipmentInSlot(i) != null){
			 for(ModItemArmor[] x: armorArr){
				 for(ModItemArmor y: x){
					 if(player.getEquipmentInSlot(i).getItem().equals(y)){
						 if(numTypes > 2) return false;
						 else{
							if(tempType != y.getInfusionType()){
								tempType = y.getInfusionType();
								numTypes++;
							}
						 }
					 }
				 }
			 }
		 }
	  }
		return true;
	}
	
	public void setInfusion(ItemStack item, EntityLivingBase player){
		switch(infusionType){
			case 0:
				this.fireInfusion(player);
				break;
			case 1:
				this.waterInfusion(player);
				break;
			case 2:
				this.earthInfusion(player);
				break;
			case 3:
				this.airInfusion(player);
				break;
			case 4:
				this.iceInfusion(player);
				break;
			case 5:
				this.lightningInfusion(player);
				break;
		}
	}
	
	public void fireInfusion(EntityLivingBase player){
		
	}
	
	public void waterInfusion(EntityLivingBase player){
		
	}
	
	public void earthInfusion(EntityLivingBase player){
		
	}
	
	public void airInfusion(EntityLivingBase player){
		
	}
	
	public void iceInfusion(EntityLivingBase player){
		
	}
	
	public void lightningInfusion(EntityLivingBase player){
		
	}
	
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Main.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
