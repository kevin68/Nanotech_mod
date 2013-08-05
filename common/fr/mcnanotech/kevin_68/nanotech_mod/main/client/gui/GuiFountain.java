package fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerFountain;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntityFountain;

public class GuiFountain extends GuiContainer
{
	private TileEntityFountain tileFoutain;

	public GuiFountain(InventoryPlayer playerinventory, TileEntityFountain tileentity, World world)
	{
		super(new ContainerFountain(tileentity, playerinventory, world));
		tileFoutain = tileentity;
	}

	@Override
	public void initGui()
	{
		super.initGui();
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		buttonList.add(new GuiButton(1, width / 2 - 58, y + 17, 20, 20, "+"));
		buttonList.add(new GuiButton(2, width / 2 + 38, y + 17, 20, 20, "-"));
		buttonList.add(new GuiButton(3, width / 2 - 58, y + 39, 20, 20, "+"));
		buttonList.add(new GuiButton(4, width / 2 + 38, y + 39, 20, 20, "-"));
		buttonList.add(new GuiButton(5, width / 2 - 73, y + 61, 50, 20, "Rotate"));
		buttonList.add(new GuiButton(6, width / 2 + 23, y + 61, 50, 20, "Stop"));
		buttonList.add(new GuiButton(7, width / 2 - 73, y + 83, 50, 20, "Animate"));
		buttonList.add(new GuiButton(8, width / 2 + 23, y + 83, 50, 20, "Stop"));
	}

	protected void actionPerformed(GuiButton guibutton)
	{
		if(guibutton.id == 1)
		{
			if(tileFoutain.getHeight() < 6.0F)
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight() + 0.5F);
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}

		else if(guibutton.id == 2)
		{
			if(tileFoutain.getHeight() > 0.5F)
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight() - 0.5F);
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
		else if(guibutton.id == 3)
		{
			if(tileFoutain.getWidth() < 0.5D)
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth() + 0.05D);
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}

		else if(guibutton.id == 4)
		{
			if(tileFoutain.getWidth() > 0.05F)
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth() - 0.05F);
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
		else if(guibutton.id == 5)
		{
			if(!tileFoutain.getRotate())
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(true);
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}

		else if(guibutton.id == 6)
		{
			if(tileFoutain.getRotate())
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(false);
					dataoutputstream.writeBoolean(tileFoutain.getAnimated());
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
		
		else if(guibutton.id == 7)
		{
			if(!tileFoutain.getAnimated())
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(true);
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}

		else if(guibutton.id == 8)
		{
			if(tileFoutain.getAnimated())
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
				DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

				try
				{
					dataoutputstream.writeFloat(tileFoutain.getHeight());
					dataoutputstream.writeDouble(tileFoutain.getWidth());
					dataoutputstream.writeBoolean(tileFoutain.getRotate());
					dataoutputstream.writeBoolean(false);
					this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("NTM|fount", bytearrayoutputstream.toByteArray()));
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		int rotatePos;
		int animPos;
		if (tileFoutain.rotate){rotatePos = 8;}else{rotatePos = 10;}
		if (tileFoutain.animated){animPos = 8;}else{animPos = 10;}

		fontRenderer.drawString("Fountain", 6, 6, 4210752);
		fontRenderer.drawString(String.valueOf(tileFoutain.height),  xSize / 2 - 5, ySize + -143, 4210752);
		fontRenderer.drawString(String.valueOf(tileFoutain.width),  xSize / 2 - 5, ySize + -121, 4210752);
		fontRenderer.drawString(String.valueOf(tileFoutain.rotate),  xSize / 2 - rotatePos, ySize + -99, 4210752);
		fontRenderer.drawString(String.valueOf(tileFoutain.animated),  xSize / 2 - animPos, ySize + -77, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.renderEngine.bindTexture("/mods/Nanotech_mod/textures/gui/BlockFountain.png");
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;

		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}