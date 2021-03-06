/**
 * This work is made available under the terms of the Creative Commons Attribution License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en
 * 
 * Cette œuvre est mise à disposition selon les termes de la Licence Creative Commons Attribution:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.fr
 */
package fr.mcnanotech.kevin_68.nanotechmod.main.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import fr.mcnanotech.kevin_68.nanotechmod.main.tileentity.TileEntityJumper;

public class ContainerJumper extends Container
{
    protected TileEntityJumper tileJumper;
    private World worldObj;

    public ContainerJumper(TileEntityJumper tileEntity, InventoryPlayer playerinventory, World world)
    {
        this.worldObj = world;
        tileJumper = tileEntity;
        bindPlayerInventory(playerinventory);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return tileJumper.isUseableByPlayer(player);
    }

    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    public TileEntityJumper getJumper()
    {
        return tileJumper;
    }
}