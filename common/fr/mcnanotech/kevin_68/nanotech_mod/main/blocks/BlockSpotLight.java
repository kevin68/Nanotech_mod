package fr.mcnanotech.kevin_68.nanotech_mod.main.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcnanotech.kevin_68.nanotech_mod.main.core.Nanotech_mod;
import fr.mcnanotech.kevin_68.nanotech_mod.main.tileentity.TileEntitySpotLight;

public class BlockSpotLight extends BlockContainer
{
	private Icon top;
	private Icon side;

	public BlockSpotLight(int id)
	{
		super(id, Material.iron);
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntitySpotLight();
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if(tile_entity == null || player.isSneaking())
		{
			return false;
		}

		player.openGui(Nanotech_mod.modInstance, 3, world, x, y, z);

		return true;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 0;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister)
	{
		this.side = iconregister.registerIcon("Nanotech_mod:SpotLightSides");
		this.top = iconregister.registerIcon("Nanotech_mod:SpotLightTopAndBottom");
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata)
	{
		if(side == 1 || side == 0)
		{
			return this.top;
		}
		else
		{
			return this.side;
		}
	}

}