package fr.mcnanotech.kevin_68.nanotech_mod.utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import fr.mcnanotech.kevin_68.nanotech_mod.client.gui.GuiJumper;
import fr.mcnanotech.kevin_68.nanotech_mod.client.gui.GuiMultiplier;
import fr.mcnanotech.kevin_68.nanotech_mod.client.gui.GuiSmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.container.ContainerSmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.container.Container_block_jumper;
import fr.mcnanotech.kevin_68.nanotech_mod.container.Container_block_multiplier;
import fr.mcnanotech.kevin_68.nanotech_mod.tileentity.TileEntitySmoker;
import fr.mcnanotech.kevin_68.nanotech_mod.tileentity.TileEntity_block_jumper;
import fr.mcnanotech.kevin_68.nanotech_mod.tileentity.TileEntity_block_multiplier;

public class UtilGuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getBlockTileEntity(x, y, z);
		if(tileentity instanceof TileEntity_block_jumper)
		{
			return new Container_block_jumper((TileEntity_block_jumper) tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntitySmoker)
		{
			return new ContainerSmoker((TileEntitySmoker) tileentity, player.inventory, world);
		}
		if(tileentity instanceof TileEntity_block_multiplier)
		{
			return new Container_block_multiplier((TileEntity_block_multiplier) tileentity, player.inventory, world);
		}
                   
		return null;
		}
           
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileentity = world.getBlockTileEntity(x, y, z);
                   
		if(tileentity instanceof TileEntity_block_jumper)
		{
			return new GuiJumper(player.inventory, (TileEntity_block_jumper) tileentity, world);
		}
		if(tileentity instanceof TileEntitySmoker)
		{
			return new GuiSmoker(player.inventory, (TileEntitySmoker) tileentity, world);
		}
		if(tileentity instanceof TileEntity_block_multiplier)
		{
			return new GuiMultiplier(player.inventory, (TileEntity_block_multiplier) tileentity, world);
		}
           
		return null;
	}
}