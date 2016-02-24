package com.tigerpax.vestumsescenti.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties{
	
	public final static String EXT_PROP_NAME = "ExtendedPlayer";

	private int[] skills = new int[3];
	private String[] skillsPar = {"pickaxeInfusion","pickaxeCrafting",""};
	
	@SuppressWarnings("unused")
	private final EntityPlayer player;
	
	public ExtendedPlayer(EntityPlayer player){
		this.player = player;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}
	
	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	
	public void updateSkillTree(int index){
		
	}
	
	public String getUnlockedSkills(){
		String output = "";
		for(int i = 0; i < this.skills.length; i++){
			if(this.skills[i] == 1) output += skillsPar[i] + " ";
		}
		
		return output;
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setIntArray("SkillTree", skills);
		
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.skills = properties.getIntArray("SkillTree");
		
		for(int x: skills){
			System.out.print(x + " ");
		}
	}
 
	@Override
	public void init(Entity entity, World world) {}
	
	public void updateTree(String skillName){
		int index = -1;
		for(int i = 0; i < skillsPar.length;i++){
			if(skillsPar[i].equals(skillName)){
				index = i;
			}				
		}
		if(skills[index] == 0) skills[index] = 1;
	}
	public Boolean intToBool(int i){
		if(i == 1) return true;
		else return false;
	}
}
