package fr.mcnanotech.kevin_68.nanotech_mod.main.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui.GuiFountain;
import fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui.GuiJumper;
import fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui.GuiMultiplier;
import fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui.GuiSmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.main.client.gui.GuiSpotLight;
import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerFountain;
import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerJumper;
import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerMultiplier;
import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerSmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.main.container.ContainerSpotLight;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntityFountain;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntityJumper;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntityMultiplier;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntitySmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntitySpotLight;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getBlockTileEntity(x, y, z);
		if(tileentity instanceof TileEntityJumper)
		{
			return new ContainerJumper((TileEntityJumper)tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntitySmoker)
		{
			return new ContainerSmoker((TileEntitySmoker)tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntityMultiplier)
		{
			return new ContainerMultiplier((TileEntityMultiplier)tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntitySpotLight)
		{
			return new ContainerSpotLight((TileEntitySpotLight)tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntityFountain)
		{
			return new ContainerFountain((TileEntityFountain)tileentity, player.inventory, world);
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getBlockTileEntity(x, y, z);

		if(tileentity instanceof TileEntityJumper)
		{
			return new GuiJumper(player.inventory, (TileEntityJumper)tileentity, world);
		}
		if(tileentity instanceof TileEntitySmoker)
		{
			return new GuiSmoker(player.inventory, (TileEntitySmoker)tileentity, world);
		}
		if(tileentity instanceof TileEntityMultiplier)
		{
			return new GuiMultiplier(player.inventory, (TileEntityMultiplier)tileentity, world);
		}
		if(tileentity instanceof TileEntitySpotLight)
		{
			return new GuiSpotLight(player.inventory, (TileEntitySpotLight)tileentity, world);
		}
		if(tileentity instanceof TileEntityFountain)
		{
			return new GuiFountain(player.inventory, (TileEntityFountain)tileentity, world);
		}

		return null;
	}
}