package com.tigerpax.vestumsescenti.client.gui;

import org.lwjgl.opengl.GL11;

import com.tigerpax.vestumsescenti.Main;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiEncyclopedia extends GuiScreen{
	
	private NextPageButton nextPage;
	private NextPageButton backPage;
	
	String test = "I like to eat pie";
	private int currPage = 0;
	public final int guiWidth = 140;
	public final int guiHeight = 160;
	//private final int arrowWidth = 22;
	//private final int arrowHeight = 11;
    private static final int bookTotalPages = 2;
    private static final int bookTotalTextures = 2;
    public static ResourceLocation[] bookPageTextures = new ResourceLocation[bookTotalTextures];
	private static String[] stringPageText = new String[bookTotalPages];
    public GuiEncyclopedia(){
    	bookPageTextures[0] = new ResourceLocation(
                Main.MODID + ":textures/gui/testGui2.png");
          bookPageTextures[1] = new ResourceLocation(
                Main.MODID + ":textures/gui/testGui.png");
          
          
          stringPageText[0]= "Welcome, with this book you may unlock the knowledge of our arcane potential";
          stringPageText[1]= "With this book you will be able to learn everything you need to learn to be a powerful arch-mage and an even more powerful ally in combat.";
    }
    
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);
		drawDefaultBackground();
		if(currPage == 0)
			mc.getTextureManager().bindTexture(bookPageTextures[currPage]);
		else
			mc.getTextureManager().bindTexture(bookPageTextures[1]);
		
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
	    fontRendererObj.drawSplitString(stringPageText[currPage], guiX + 6, guiY + 10, 116, 0);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
    public void onGuiClosed() {}
	@Override
	public boolean doesGuiPauseGame(){return true;}
	
	@SuppressWarnings("unchecked")
	@Override
	public void initGui(){	
		buttonList.add(nextPage = new NextPageButton(1, ((width - guiWidth) /2)+ 27, ((height - guiHeight) /2) + 140));
	    buttonList.add(backPage = new NextPageButton(2, ((width - guiWidth) /2)+ 5, ((height - guiHeight) /2) + 140));
		super.initGui();
	}
	
	@Override
    public void updateScreen() {}
 
	@Override
	protected void actionPerformed(GuiButton button){
		 	if (button == nextPage)
	        {
	            if (currPage < bookTotalPages - 1) ++currPage;
	        }
	        else if (button == backPage)
	        {
	            if (currPage > 0) --currPage;
	        }
	}
}
