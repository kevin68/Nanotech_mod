/**
 * This work is made available under the terms of the Creative Commons Attribution License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en
 * 
 * Cette œuvre est mise à disposition selon les termes de la Licence Creative Commons Attribution:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.fr
 */
package fr.mcnanotech.kevin_68.nanotechmod.city.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcnanotech.kevin_68.nanotechmod.city.tileentity.TileEntitySunShade;

public class BlockSunShade extends Block
{
    public IIcon stick;

    public BlockSunShade()
    {
        super(Material.wood);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote)
        {
            int metadata = world.getBlockMetadata(x, y, z);
            if(metadata == 0)
            {
                TileEntity te = world.getTileEntity(x, y, z);

                if(te != null && te instanceof TileEntitySunShade)
                {
                    TileEntitySunShade tesunshade = (TileEntitySunShade)te;
                    tesunshade.switchSunShade();
                    world.markBlockForUpdate(x, y, z);
                    return true;
                }
            }
            else if(metadata == 1)
            {
                TileEntity te = world.getTileEntity(x, y - 1, z);

                if(te != null && te instanceof TileEntitySunShade)
                {
                    TileEntitySunShade tesunshade = (TileEntitySunShade)te;
                    tesunshade.switchSunShade();
                    world.markBlockForUpdate(x, y, z);
                    return true;
                }
                else
                {
                    te = world.getTileEntity(x, y - 2, z);
                    if(te != null && te instanceof TileEntitySunShade)
                    {
                        TileEntitySunShade tesunshade = (TileEntitySunShade)te;
                        tesunshade.switchSunShade();
                        world.markBlockForUpdate(x, y, z);
                        return true;
                    }
                }
            }

            else if(metadata == 3)
            {
                TileEntity te = world.getTileEntity(x, y - 2, z);
                if(te != null && te instanceof TileEntitySunShade)
                {
                    TileEntitySunShade tesunshade = (TileEntitySunShade)te;
                    tesunshade.switchSunShade();
                    world.markBlockForUpdate(x, y, z);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        if(metadata == 0)
        {
            return new TileEntitySunShade();
        }
        else
        {
            return null;
        }
    }

    public boolean hasTileEntity(int metadata)
    {
        if(metadata == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return -1;
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata)
    {
        this.removeBlock(world, x, y, z, metadata);
    }

    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion)
    {
        this.removeBlock(world, x, y, z, world.getBlockMetadata(x, y, z));
    }

    public void removeBlock(World world, int x, int y, int z, int metadata)
    {
        if(metadata == 0)
        {
            world.setBlockToAir(x, y, z);
            world.setBlockToAir(x, y + 1, z);
            if(world.getBlockMetadata(x, y + 2, z) == 1)
            {
                world.setBlockToAir(x, y + 2, z);
            }
            else if(world.getBlockMetadata(x, y + 2, z) == 3)
            {
                for(int j = -1; j < 2; ++j)
                {
                    for(int k = -1; k < 2; ++k)
                    {
                        if(world.getBlock(x + j, y + 2, z + k).equals(this))
                        {
                            world.setBlockToAir(x + j, y + 2, z + k);
                        }
                    }
                }
            }
        }
        else if(metadata == 1 && world.getBlockMetadata(x, y - 1, z) == 0 && world.getBlock(x, y - 1, z).equals(this))
        {
            world.setBlockToAir(x, y, z);
            world.setBlockToAir(x, y - 1, z);
            if(world.getBlockMetadata(x, y + 1, z) == 1)
            {
                world.setBlockToAir(x, y + 1, z);
            }
            else if(world.getBlockMetadata(x, y + 1, z) == 3)
            {
                for(int j = -1; j < 2; ++j)
                {
                    for(int k = -1; k < 2; ++k)
                    {
                        if(world.getBlock(x + j, y + 1, z + k).equals(this))
                        {
                            world.setBlockToAir(x + j, y + 1, z + k);
                        }
                    }
                }
            }
        }
        else if(world.getBlockMetadata(x, y - 2, z) == 0 && world.getBlock(x, y - 2, z).equals(this))
        {
            world.setBlockToAir(x, y - 1, z);
            world.setBlockToAir(x, y - 2, z);
            if(metadata == 1)
            {
                world.setBlockToAir(x, y, z);
            }
            else if(metadata == 3)
            {
                for(int j = -1; j < 2; ++j)
                {
                    for(int k = -1; k < 2; ++k)
                    {
                        if(world.getBlock(x + j, y, z + k).equals(this))
                        {
                            world.setBlockToAir(x + j, y, z + k);
                        }
                    }
                }
            }
        }
        else if(metadata == 2)
        {
            world.setBlock(x, y, z, this, 2, 1);
        }
    }

    public void registerBlockIcons(IIconRegister iconregister)
    {}

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if(metadata == 2)
        {
            return Blocks.wool.getIcon(0, 0);
        }
        else
        {
            return Blocks.log.getIcon(3, 0);
        }
    }

    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
    {
        if(blockAccess.getBlockMetadata(x, y, z) == 0 || blockAccess.getBlockMetadata(x, y, z) == 1)
        {
            float f = 0.375F;
            float f1 = 0.625F;
            float f2 = 0.375F;
            float f3 = 0.625F;
            this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
        }
        else if(blockAccess.getBlockMetadata(x, y, z) == 2)
        {
            this.setBlockBounds(0.0F, 0.85F, 0.0F, 1.0F, 0.95F, 1.0F);
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}