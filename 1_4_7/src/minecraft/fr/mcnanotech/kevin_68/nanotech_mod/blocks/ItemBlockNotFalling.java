package fr.mcnanotech.kevin_68.nanotech_mod.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockNotFalling extends ItemBlock
{

	public ItemBlockNotFalling(int par1)
	{
		super(par1);
		setHasSubtypes(true);
	}

	public int getMetadata(int metadata)
	{
		return metadata;
	}

	public String getItemNameIS(ItemStack stack)
	{
		if (stack.getItemDamage() < BlockNotFalling.type.length)
		{
			return getItemName() + BlockNotFalling.type[stack.getItemDamage()];
		}
		else
		{
			return getItemName();
		}
	}
}