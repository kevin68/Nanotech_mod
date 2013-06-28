package fr.mcnanotech.kevin_68.nanotech_mod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMysteriousArmor extends ItemArmor implements IArmorTextureProvider
{
	public ItemMysteriousArmor(int id, EnumArmorMaterial enumArmorMaterial, int par3, int par4)
	{
		super(id, enumArmorMaterial, par3, par4);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.epic;
	}

	public String getTextureFile()
	{
		return "/fr/mcnanotech/kevin_68/nanotech_mod/client/textures/items.png";
	}

	public String getArmorTextureFile(ItemStack stack)
	{
		if (stack.itemID == NanotechItem.Mysteriousleggings.itemID)
		{
			return "/fr/mcnanotech/kevin_68/nanotech_mod/client/textures/armor/Mysteriousarmor2.png";
		}
		else
		{
			return "/fr/mcnanotech/kevin_68/nanotech_mod/client/textures/armor/Mysteriousarmor.png";
		}
	}

	@ForgeSubscribe
	public void livingFall(LivingFallEvent event)
	{

		if ((event.entity instanceof EntityPlayer))
		{
			EntityPlayer player = (EntityPlayer) event.entity;
			ItemStack armorb = player.inventory.armorInventory[0];

			if ((armorb != null) && (armorb.getItem() == NanotechItem.Mysteriousboots))
			{
				if (!(event.entityLiving instanceof EntityPlayer))
					return;
				EntityPlayer eventPlayer = (EntityPlayer) event.entityLiving;
				event.distance = 0F;
			}
		}
	}

	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return true;
	}
}