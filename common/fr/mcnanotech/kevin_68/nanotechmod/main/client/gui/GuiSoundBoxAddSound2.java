package fr.mcnanotech.kevin_68.nanotechmod.main.client.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import fr.mcnanotech.kevin_68.nanotechmod.main.container.ContainerListerJukebox;
import fr.mcnanotech.kevin_68.nanotechmod.main.tileentity.TileEntitySoundBox;
import fr.minecraftforgefrance.ffmtlibs.FFMTColor;
import fr.minecraftforgefrance.ffmtlibs.client.gui.FFMTGuiHelper;
import fr.minecraftforgefrance.ffmtlibs.client.gui.FFMTGuiSliderForContainer;

public class GuiSoundBoxAddSound2 extends GuiContainer
{
	private TileEntitySoundBox tile;
	private InventoryPlayer inv;
	private World wrld;
	public GuiTextField dirField;
	private String name, dir;
	private int[] color;
	
	private GuiButton nextButton;
	
	public GuiSoundBoxAddSound2(InventoryPlayer inventoryPlayer, TileEntitySoundBox tileEntity, World world, String name, int[] color)
	{
		super(new ContainerListerJukebox(tileEntity, inventoryPlayer, world));
		this.tile = tileEntity;
		this.inv = inventoryPlayer;
		this.wrld = world;
		this.name = name;
		this.color = color;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		dir = "";
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		Keyboard.enableRepeatEvents(true);
		this.dirField = new GuiTextField(this.fontRendererObj, x + 6, y + 20, 160, 12);
		this.dirField.setTextColor(FFMTColor.WHITE);
		this.dirField.setDisabledTextColour(-1);
		this.dirField.setEnableBackgroundDrawing(true);
		this.dirField.setMaxStringLength(40);
		this.dirField.setEnabled(true);
		this.dirField.setText(dir);
		
		this.buttonList.add(new GuiButton(1, x + 6, y + 74, 160, 20, "stop"));
		this.buttonList.add(new GuiButton(2, x + 6, y + 50, 160, 20, "test"));
		this.buttonList.add(new GuiButton(3, x + 6, y + 112, 78, 20, "Cancel"));
		this.buttonList.add(nextButton = new GuiButton(4, x + 88, y + 112, 78, 20, "Next"));
		nextButton.enabled = false;
	}

	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		switch(guibutton.id)
		{
		case 1:
		{
			this.mc.getSoundHandler().stopSounds();
			break;
		}
		case 2:
		{
			this.tile.playSound(dir);
			break;
		}
		case 3:
		{
			this.mc.displayGuiScreen(new GuiSoundBox(inv, tile, wrld));
			break;
		}
		case 4:
		{
			this.mc.displayGuiScreen(new GuiSoundBoxAddSound3(inv, tile, wrld, name, color, dir));
			break;
		}
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		fontRendererObj.drawString("Sound box" + " - " + "Add sound step 2", 6, 6, 4210752);
	}

	@Override
	public void drawScreen(int par1, int par2, float par3)
	{
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		super.drawScreen(par1, par2, par3);
		GL11.glDisable(GL11.GL_LIGHTING);
		this.dirField.drawTextBox();
		if(dir == "" && !this.dirField.isFocused() )
		{
			this.drawCenteredString(this.fontRendererObj, I18n.format("container.listerJukebox.fieldDir"), x + 83, y + 22, 16777215);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		FFMTGuiHelper.bindTexture("nanotechmod", "textures/gui/soundbox.png");
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;

		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
	
	public void onGuiClosed()
	{
		super.onGuiClosed();
		Keyboard.enableRepeatEvents(false);
	}
	
	@Override
	public void updateScreen()
	{
		if(dir.length() > 1)
		{
			nextButton.enabled = true;
		}
		else
		{
			nextButton.enabled = false;
		}
	}

	protected void keyTyped(char par1, int par2)
	{
		if(this.dirField.textboxKeyTyped(par1, par2))
		{
			dir = this.dirField.getText();
		}
		else
		{
			super.keyTyped(par1, par2);
		}
	}

	protected void mouseClicked(int par1, int par2, int par3)
	{
		super.mouseClicked(par1, par2, par3);
		this.dirField.mouseClicked(par1, par2, par3);
	}
}