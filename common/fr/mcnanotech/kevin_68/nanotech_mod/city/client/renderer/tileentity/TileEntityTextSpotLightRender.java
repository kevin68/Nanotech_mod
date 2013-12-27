package fr.mcnanotech.kevin_68.nanotech_mod.city.client.renderer.tileentity;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelSign;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntityTextSpotLight;

@SideOnly(Side.CLIENT)
public class TileEntityTextSpotLightRender extends TileEntitySpecialRenderer
{
	private static final ResourceLocation field_110638_a = new ResourceLocation("textures/entity/sign.png");
	private final ModelSign modelSign = new ModelSign();

	public void renderTileEntitySignAt(TileEntityTextSpotLight tileentity, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		float f1 = 0.6666667F;
		float f2 = 0.0F;
		
		float d2 = (float)tileentity.getWorldObj().getTotalWorldTime() + par8;
		byte b1 = 1;
		double d3 = (double)d2 * 0.025D * (1.0D - (double)(b1 & 1) * 2.5D);
		int i1 = (tileentity.getReverseRotation() ? -1 : 1);
		
		GL11.glTranslatef((float)par2 + 0.5F, (float)par4 + 0.75F * f1, (float)par6 + 0.5F);
		GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(0.0F, -0.4F, 0.0F);
		GL11.glScaled(0.9D, 0.9D, 0.9D);
		if(!tileentity.getRotate())
		{
			GL11.glRotated(d3 * 5 * tileentity.getRotationSpeed() * i1, 0.0F, 1.0F, 0.0F);
		}
		else
		{
			GL11.glRotatef(tileentity.getAngle(), 0.0F, 1.0F, 0.0F);
		}
		this.modelSign.signStick.showModel = false;

		this.bindTexture(field_110638_a);
		GL11.glPushMatrix();
		GL11.glScalef(f1, -f1, -f1);
		this.modelSign.renderSign();
		GL11.glPopMatrix();
		FontRenderer fontrenderer = this.getFontRenderer();
		f2 = 0.016666668F * f1;
		GL11.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
		GL11.glScalef(f2 * 5, -f2 * 5, f2 * 5);
		GL11.glNormal3f(0.0F, 0.0F, -1.0F * f2);
		GL11.glDepthMask(false);

		GL11.glScaled(0.1 + 1.0 * (tileentity.getScale()/10), 0.1 + 1.0 * (tileentity.getScale()/10), 0.1 + 1.0 * (tileentity.getScale()/10));
		GL11.glTranslated(0.0F, -tileentity.getHeight(), 0.0F);
		
		String s = tileentity.signText;
		fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, -20, (tileentity.getRedValue() * 65536) + (tileentity.getGreenValue() * 256) + tileentity.getBlueValue());
		GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);
		fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, -20, (tileentity.getRedValue() * 65536) + (tileentity.getGreenValue() * 256) + tileentity.getBlueValue());

		GL11.glDepthMask(true);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glPopMatrix();
	}

	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		this.renderTileEntitySignAt((TileEntityTextSpotLight)par1TileEntity, par2, par4, par6, par8);
	}
}
