package com.tigerpax.vestumsescenti.client.gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

@SideOnly(Side.CLIENT)
public class NextPageButton extends GuiButton
    {
        public NextPageButton(int parButtonId, int parPosX, int parPosY)
        {
            super(parButtonId, parPosX, parPosY, 23, 13, "");
        }

        /**
         * Draws this button to the screen.
         */
        @Override
        public void drawButton(Minecraft mc, int parX, int parY)
        {
            if (visible)
            {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(GuiEncyclopedia.bookPageTextures[1]);
                int textureX = 0;
                int textureY = 160;

                // Next is one, Back is two
                if(this.id == 1)
                	drawTexturedModalRect(xPosition, yPosition, textureX, textureY, 23, 13);
                if(this.id == 2)
                	drawTexturedModalRect(xPosition, yPosition, textureX + 22, textureY, 23, 13);
            }
        }
    }
