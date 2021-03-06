/**
 * This work is made available under the terms of the Creative Commons Attribution License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en
 * 
 * Cette œuvre est mise à disposition selon les termes de la Licence Creative Commons Attribution:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.fr
 */
package fr.mcnanotech.kevin_68.nanotechmod.main.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcnanotech.kevin_68.nanotechmod.main.client.model.items.ItemCrazyGlassesModel;

public class ItemCrazyGlasses extends ItemArmor
{

    public ItemCrazyGlasses(ArmorMaterial material, int renderIndex, int armorType)
    {
        super(material, renderIndex, armorType);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem().equals(NanotechItem.crazyGlasses))
        {
            return "nanotechmod:textures/armor/crazyGlasses.png";
        }
        return "nanotechmod:textures/block/empty.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityliving, ItemStack stack, int armor)
    {
        return new ItemCrazyGlassesModel();
    }

    private int tick = 40;

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 100, 50, true));
            if(tick > 56)
            {
                float randPitch = -5.0F + world.rand.nextFloat() * 10;
                world.playSoundAtEntity(player, "nanotechmod:mob.crazyguy.idle", 30.0F, randPitch);
                tick = 0 + (int)(randPitch * 13.0F);
            }
            else
            {
                tick++;
            }
        }
    }
}