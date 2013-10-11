package fr.mcnanotech.kevin_68.nanotech_mod.main.client.renderer.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import fr.mcnanotech.kevin_68.nanotech_mod.main.client.model.items.ItemAltersModel;

public class ItemAletersRender implements IItemRenderer
{

	protected ItemAltersModel model;
	protected static final ResourceLocation texture = new ResourceLocation("nanotech_mod", "textures/items/alters.png");

	public ItemAletersRender()
	{
		model = new ItemAltersModel();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		case ENTITY:
			return true;
		default:
			return false;
		}

	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type)
		{
		case EQUIPPED:
		{
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glRotatef(-80, 1.0F, 0.0F, 0.0F);
			GL11.glTranslatef(0.4F, -0.08F, 0.0F);
			GL11.glScalef(2.0F, 2.0F, 2.0F);
			model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		case EQUIPPED_FIRST_PERSON:
		{
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glRotatef(-80, 1.0F, 0.0F, 0.0F);
			GL11.glTranslatef(0.4F, -0.08F, 0.0F);
			GL11.glScalef(2.0F, 2.0F, 2.0F);
			model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		case ENTITY:
		{
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glRotatef(-80, 1.0F, 0.0F, 0.0F);
			GL11.glTranslatef(0.4F, -0.08F, 0.0F);
			GL11.glScalef(2.0F, 2.0F, 2.0F);
			model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		default:
			break;
		}
	}

}
