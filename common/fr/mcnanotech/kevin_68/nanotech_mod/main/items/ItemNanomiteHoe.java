package fr.mcnanotech.kevin_68.nanotech_mod.main.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemNanomiteHoe extends ItemHoe
{
	public ItemNanomiteHoe(int id, EnumToolMaterial toolMaterial)
	{
		super(id, toolMaterial);
	}

	public void registerIcons(IconRegister iconregister)
	{
		itemIcon = iconregister.registerIcon("Nanotech_mod:nanomiteHoe");
	}

	public boolean getIsRepairable(ItemStack stack, ItemStack stack2)
	{
		return true;
	}
}