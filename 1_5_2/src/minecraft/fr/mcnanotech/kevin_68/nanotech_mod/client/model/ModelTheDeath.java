package fr.mcnanotech.kevin_68.nanotech_mod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTheDeath extends ModelBase
{
	ModelRenderer head;
	ModelRenderer colonne1;
	ModelRenderer colonne2;
	ModelRenderer colonne3;
	ModelRenderer colonne4;
	ModelRenderer colonne5;
	ModelRenderer colonne6;
	ModelRenderer colonne7;
	ModelRenderer colonne8;
	ModelRenderer colonne9;
	ModelRenderer colonne10;
	ModelRenderer LeftArm1;
	ModelRenderer LeftArm2;
	ModelRenderer LeftArm3;
	ModelRenderer LeftArm4;
	ModelRenderer RightArm1;
	ModelRenderer RightArm2;
	ModelRenderer RightArm3;
	ModelRenderer RightArm4;
	ModelRenderer CoteGauche1;
	ModelRenderer CoteGauche2;
	ModelRenderer CoteGauche3;
	ModelRenderer CoteGauche4;
	ModelRenderer CoteDroite1;
	ModelRenderer CoteDroite2;
	ModelRenderer CoteDroite3;
	ModelRenderer CoteDroite4;
	ModelRenderer CoteGauche12;
	ModelRenderer CoteGauche22;
	ModelRenderer CoteGauche32;
	ModelRenderer CoteGauche42;
	ModelRenderer CoteDroite12;
	ModelRenderer CoteDroite22;
	ModelRenderer CoteDroite32;
	ModelRenderer CoteDroite42;
	ModelRenderer CoteGauche13;
	ModelRenderer CoteGauche23;
	ModelRenderer CoteGauche33;
	ModelRenderer CoteDroite13;
	ModelRenderer CoteDroite23;
	ModelRenderer CoteDroite33;
	ModelRenderer LeftHand;
	ModelRenderer LeftFinger1;
	ModelRenderer LeftFinger12;
	ModelRenderer LeftFinger2;
	ModelRenderer LeftFinger22;
	ModelRenderer LeftFinger3;
	ModelRenderer LeftFinger32;
	ModelRenderer LeftFinger4;
	ModelRenderer LeftFinger42;
	ModelRenderer RightHand;
	ModelRenderer Cape1;
	ModelRenderer Cape2;
	ModelRenderer Cape3;
	ModelRenderer Cape4;
	ModelRenderer Cape5;
	ModelRenderer Cape6;
	ModelRenderer Cape7;
	ModelRenderer Cape8;
	ModelRenderer Cape9;
	ModelRenderer Heart1;
	ModelRenderer Heart2;

	public ModelTheDeath()
	{
		textureWidth = 512;
		textureHeight = 256;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, -15F, 0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		colonne1 = new ModelRenderer(this, 32, 0);
		colonne1.addBox(-1F, 0F, 0F, 2, 3, 1);
		colonne1.setRotationPoint(0F, -15F, 1.5F);
		colonne1.setTextureSize(64, 32);
		colonne1.mirror = true;
		setRotation(colonne1, 0F, 0F, 0F);
		colonne2 = new ModelRenderer(this, 32, 4);
		colonne2.addBox(-1F, 3F, -0.4F, 2, 3, 1);
		colonne2.setRotationPoint(0F, -15F, 1.5F);
		colonne2.setTextureSize(64, 32);
		colonne2.mirror = true;
		setRotation(colonne2, 0.1396263F, 0F, 0F);
		colonne3 = new ModelRenderer(this, 32, 8);
		colonne3.addBox(-1F, 6F, -0.55F, 2, 3, 1);
		colonne3.setRotationPoint(0F, -15F, 1.5F);
		colonne3.setTextureSize(64, 32);
		colonne3.mirror = true;
		setRotation(colonne3, 0.1745329F, 0F, 0F);
		colonne4 = new ModelRenderer(this, 32, 12);
		colonne4.addBox(-1F, 8.9F, -1.1F, 2, 3, 1);
		colonne4.setRotationPoint(0F, -15F, 1.5F);
		colonne4.setTextureSize(64, 32);
		colonne4.mirror = true;
		setRotation(colonne4, 0.2443461F, 0F, 0F);
		colonne5 = new ModelRenderer(this, 32, 16);
		colonne5.addBox(-1F, 11.8F, -1.9F, 2, 3, 1);
		colonne5.setRotationPoint(0F, -15F, 1.5F);
		colonne5.setTextureSize(64, 32);
		colonne5.mirror = true;
		setRotation(colonne5, 0.3141593F, 0F, 0F);
		colonne6 = new ModelRenderer(this, 32, 20);
		colonne6.addBox(-1F, 14.7F, -2.7F, 2, 3, 1);
		colonne6.setRotationPoint(0F, -15F, 1.5F);
		colonne6.setTextureSize(64, 32);
		colonne6.mirror = true;
		setRotation(colonne6, 0.3665191F, 0F, 0F);
		colonne7 = new ModelRenderer(this, 32, 24);
		colonne7.addBox(-1F, 17.4F, -3.9F, 2, 3, 1);
		colonne7.setRotationPoint(0F, -15F, 1.48F);
		colonne7.setTextureSize(64, 32);
		colonne7.mirror = true;
		setRotation(colonne7, 0.4363323F, 0F, 0F);
		colonne8 = new ModelRenderer(this, 32, 28);
		colonne8.addBox(-1F, 20F, -5F, 2, 3, 1);
		colonne8.setRotationPoint(0F, -15F, 1.5F);
		colonne8.setTextureSize(64, 32);
		colonne8.mirror = true;
		setRotation(colonne8, 0.4886922F, 0F, 0F);
		colonne9 = new ModelRenderer(this, 32, 32);
		colonne9.addBox(-1F, 22.6F, -6.6F, 2, 3, 1);
		colonne9.setRotationPoint(0F, -15F, 1.5F);
		colonne9.setTextureSize(64, 32);
		colonne9.mirror = true;
		setRotation(colonne9, 0.5585054F, 0F, 0F);
		colonne10 = new ModelRenderer(this, 32, 36);
		colonne10.addBox(-1F, 25.2F, -7.9F, 2, 3, 1);
		colonne10.setRotationPoint(0F, -15F, 1.5F);
		colonne10.setTextureSize(64, 32);
		colonne10.mirror = true;
		setRotation(colonne10, 0.6108652F, 0F, 0F);
		LeftArm1 = new ModelRenderer(this, 38, 0);
		LeftArm1.addBox(1F, 2.5F, 0F, 4, 2, 1);
		LeftArm1.setRotationPoint(0F, -15F, 1.5F);
		LeftArm1.setTextureSize(64, 32);
		LeftArm1.mirror = true;
		setRotation(LeftArm1, 0F, 0F, 0F);
		LeftArm2 = new ModelRenderer(this, 38, 3);
		LeftArm2.addBox(4.9F, 2.5F, 0.3F, 4, 2, 1);
		LeftArm2.setRotationPoint(0F, -15F, 1.5F);
		LeftArm2.setTextureSize(64, 32);
		LeftArm2.mirror = true;
		setRotation(LeftArm2, 0F, 0.0698132F, 0F);
		LeftArm3 = new ModelRenderer(this, 38, 6);
		LeftArm3.addBox(8.8F, 2.5F, 0.9F, 4, 2, 1);
		LeftArm3.setRotationPoint(0F, -15F, 1.5F);
		LeftArm3.setTextureSize(64, 32);
		LeftArm3.mirror = true;
		setRotation(LeftArm3, 0F, 0.1396263F, 0F);
		LeftArm4 = new ModelRenderer(this, 38, 9);
		LeftArm4.addBox(12.7F, 2.5F, 1.3F, 4, 2, 1);
		LeftArm4.setRotationPoint(0F, -15F, 1.5F);
		LeftArm4.setTextureSize(64, 32);
		LeftArm4.mirror = true;
		setRotation(LeftArm4, 0F, 0.1745329F, 0F);
		RightArm1 = new ModelRenderer(this, 48, 0);
		RightArm1.addBox(-5F, 2.5F, 0F, 4, 2, 1);
		RightArm1.setRotationPoint(0F, -15F, 1.5F);
		RightArm1.setTextureSize(64, 32);
		RightArm1.mirror = true;
		setRotation(RightArm1, 0F, 0F, 0F);
		RightArm2 = new ModelRenderer(this, 48, 3);
		RightArm2.addBox(-8.9F, 2.5F, 0.3F, 4, 2, 1);
		RightArm2.setRotationPoint(0F, -15F, 1.5F);
		RightArm2.setTextureSize(64, 32);
		RightArm2.mirror = true;
		setRotation(RightArm2, 0F, -0.0698132F, 0F);
		RightArm3 = new ModelRenderer(this, 48, 6);
		RightArm3.addBox(-12.8F, 2.5F, 0.9F, 4, 2, 1);
		RightArm3.setRotationPoint(0F, -15F, 1.5F);
		RightArm3.setTextureSize(64, 32);
		RightArm3.mirror = true;
		setRotation(RightArm3, 0F, -0.1396263F, 0F);
		RightArm4 = new ModelRenderer(this, 48, 9);
		RightArm4.addBox(-16.7F, 2.5F, 1.3F, 4, 2, 1);
		RightArm4.setRotationPoint(0F, -15F, 1.5F);
		RightArm4.setTextureSize(64, 32);
		RightArm4.mirror = true;
		setRotation(RightArm4, 0F, -0.1745329F, 0F);
		CoteGauche1 = new ModelRenderer(this, 0, 64);
		CoteGauche1.addBox(0.7F, 4F, -3F, 0, 1, 3);
		CoteGauche1.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche1.setTextureSize(64, 32);
		CoteGauche1.mirror = true;
		setRotation(CoteGauche1, 0F, -0.9599311F, 0F);
		CoteGauche2 = new ModelRenderer(this, 0, 66);
		CoteGauche2.addBox(1.9F, 4F, -4.5F, 0, 1, 2);
		CoteGauche2.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche2.setTextureSize(64, 32);
		CoteGauche2.mirror = true;
		setRotation(CoteGauche2, 0.0174533F, -0.5235988F, 0F);
		CoteGauche3 = new ModelRenderer(this, 0, 67);
		CoteGauche3.addBox(4.1F, 4F, -4.5F, 0, 1, 2);
		CoteGauche3.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche3.setTextureSize(64, 32);
		CoteGauche3.mirror = true;
		setRotation(CoteGauche3, 0F, 0.1047198F, 0F);
		CoteGauche4 = new ModelRenderer(this, 0, 68);
		CoteGauche4.addBox(6F, 4F, -2.9F, 0, 1, 2);
		CoteGauche4.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche4.setTextureSize(64, 32);
		CoteGauche4.mirror = true;
		setRotation(CoteGauche4, 0F, 0.7853982F, 0F);
		CoteDroite1 = new ModelRenderer(this, 6, 64);
		CoteDroite1.addBox(-0.7F, 4F, -3F, 0, 1, 3);
		CoteDroite1.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite1.setTextureSize(64, 32);
		CoteDroite1.mirror = true;
		setRotation(CoteDroite1, 0F, 0.9599311F, 0F);
		CoteDroite2 = new ModelRenderer(this, 6, 66);
		CoteDroite2.addBox(-1.9F, 4F, -4.4F, 0, 1, 2);
		CoteDroite2.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite2.setTextureSize(64, 32);
		CoteDroite2.mirror = true;
		setRotation(CoteDroite2, 0F, 0.5235988F, 0F);
		CoteDroite3 = new ModelRenderer(this, 0, 67);
		CoteDroite3.addBox(-4.1F, 4F, -4.5F, 0, 1, 2);
		CoteDroite3.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite3.setTextureSize(64, 32);
		CoteDroite3.mirror = true;
		setRotation(CoteDroite3, 0F, -0.1047198F, 0F);
		CoteDroite4 = new ModelRenderer(this, 6, 68);
		CoteDroite4.addBox(-6F, 4F, -3F, 0, 1, 2);
		CoteDroite4.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite4.setTextureSize(64, 32);
		CoteDroite4.mirror = true;
		setRotation(CoteDroite4, 0F, -0.7853982F, 0F);
		CoteGauche12 = new ModelRenderer(this, 0, 70);
		CoteGauche12.addBox(0.7F, 6F, -3F, 0, 1, 3);
		CoteGauche12.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche12.setTextureSize(64, 32);
		CoteGauche12.mirror = true;
		setRotation(CoteGauche12, 0F, -0.9599311F, 0F);
		CoteGauche22 = new ModelRenderer(this, 0, 72);
		CoteGauche22.addBox(1.9F, 6F, -4.5F, 0, 1, 2);
		CoteGauche22.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche22.setTextureSize(64, 32);
		CoteGauche22.mirror = true;
		setRotation(CoteGauche22, 0.0174533F, -0.5235988F, 0F);
		CoteGauche32 = new ModelRenderer(this, 0, 73);
		CoteGauche32.addBox(4.1F, 6F, -4.5F, 0, 1, 2);
		CoteGauche32.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche32.setTextureSize(64, 32);
		CoteGauche32.mirror = true;
		setRotation(CoteGauche32, 0F, 0.1047198F, 0F);
		CoteGauche42 = new ModelRenderer(this, 0, 74);
		CoteGauche42.addBox(6F, 6F, -2.9F, 0, 1, 2);
		CoteGauche42.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche42.setTextureSize(64, 32);
		CoteGauche42.mirror = true;
		setRotation(CoteGauche42, 0F, 0.7853982F, 0F);
		CoteDroite12 = new ModelRenderer(this, 6, 70);
		CoteDroite12.addBox(-0.7F, 6F, -3F, 0, 1, 3);
		CoteDroite12.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite12.setTextureSize(64, 32);
		CoteDroite12.mirror = true;
		setRotation(CoteDroite12, 0F, 0.9599311F, 0F);
		CoteDroite22 = new ModelRenderer(this, 6, 72);
		CoteDroite22.addBox(-1.9F, 6F, -4.4F, 0, 1, 2);
		CoteDroite22.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite22.setTextureSize(64, 32);
		CoteDroite22.mirror = true;
		setRotation(CoteDroite22, 0F, 0.5235988F, 0F);
		CoteDroite32 = new ModelRenderer(this, 0, 73);
		CoteDroite32.addBox(-4.1F, 6F, -4.5F, 0, 1, 2);
		CoteDroite32.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite32.setTextureSize(64, 32);
		CoteDroite32.mirror = true;
		setRotation(CoteDroite32, 0F, -0.1047198F, 0F);
		CoteDroite42 = new ModelRenderer(this, 6, 68);
		CoteDroite42.addBox(-6F, 6F, -3F, 0, 1, 2);
		CoteDroite42.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite42.setTextureSize(64, 32);
		CoteDroite42.mirror = true;
		setRotation(CoteDroite42, 0F, -0.7853982F, 0F);
		CoteGauche13 = new ModelRenderer(this, 0, 76);
		CoteGauche13.addBox(1.2F, 8F, -3F, 0, 1, 3);
		CoteGauche13.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche13.setTextureSize(64, 32);
		CoteGauche13.mirror = true;
		setRotation(CoteGauche13, 0F, -0.9599311F, 0F);
		CoteGauche23 = new ModelRenderer(this, 0, 78);
		CoteGauche23.addBox(2.4F, 8F, -4.1F, 0, 1, 2);
		CoteGauche23.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche23.setTextureSize(64, 32);
		CoteGauche23.mirror = true;
		setRotation(CoteGauche23, 0.0174533F, -0.4363323F, 0F);
		CoteGauche33 = new ModelRenderer(this, 0, 79);
		CoteGauche33.addBox(4.1F, 8F, -4.2F, 0, 1, 2);
		CoteGauche33.setRotationPoint(0F, -15F, 1.5F);
		CoteGauche33.setTextureSize(64, 32);
		CoteGauche33.mirror = true;
		setRotation(CoteGauche33, 0F, 0.1047198F, 0F);
		CoteDroite13 = new ModelRenderer(this, 6, 76);
		CoteDroite13.addBox(-1.2F, 8F, -3F, 0, 1, 3);
		CoteDroite13.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite13.setTextureSize(64, 32);
		CoteDroite13.mirror = true;
		setRotation(CoteDroite13, 0F, 0.9599311F, 0F);
		CoteDroite23 = new ModelRenderer(this, 6, 78);
		CoteDroite23.addBox(-2.4F, 8F, -4.1F, 0, 1, 2);
		CoteDroite23.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite23.setTextureSize(64, 32);
		CoteDroite23.mirror = true;
		setRotation(CoteDroite23, 0.0174533F, 0.4363323F, 0F);
		CoteDroite33 = new ModelRenderer(this, 6, 79);
		CoteDroite33.addBox(-4.1F, 8F, -4.2F, 0, 1, 2);
		CoteDroite33.setRotationPoint(0F, -15F, 1.5F);
		CoteDroite33.setTextureSize(64, 32);
		CoteDroite33.mirror = true;
		setRotation(CoteDroite33, 0F, -0.1047198F, 0F);
		LeftHand = new ModelRenderer(this, 64, 32);
		LeftHand.addBox(16.6F, 2.5F, 1.9F, 2, 2, 1);
		LeftHand.setRotationPoint(0F, -15F, 1.5F);
		LeftHand.setTextureSize(64, 32);
		LeftHand.mirror = true;
		setRotation(LeftHand, 0F, 0.2094395F, 0F);
		LeftFinger1 = new ModelRenderer(this, 64, 35);
		LeftFinger1.addBox(16.6F, 1F, 2F, 1, 2, 1);
		LeftFinger1.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger1.setTextureSize(64, 32);
		LeftFinger1.mirror = true;
		setRotation(LeftFinger1, 0F, 0.2094395F, 0F);
		LeftFinger12 = new ModelRenderer(this, 64, 38);
		LeftFinger12.addBox(16.6F, 0F, 1.8F, 1, 2, 1);
		LeftFinger12.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger12.setTextureSize(64, 32);
		LeftFinger12.mirror = true;
		setRotation(LeftFinger12, 0.1919862F, 0.2094395F, 0F);
		LeftFinger2 = new ModelRenderer(this, 64, 41);
		LeftFinger2.addBox(11F, -15.7F, 2F, 1, 2, 1);
		LeftFinger2.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger2.setTextureSize(64, 32);
		LeftFinger2.mirror = true;
		setRotation(LeftFinger2, 0F, 0.2094395F, 1.047198F);
		LeftFinger22 = new ModelRenderer(this, 64, 44);
		LeftFinger22.addBox(10.3F, -16F, 7.2F, 1, 2, 1);
		LeftFinger22.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger22.setTextureSize(64, 32);
		LeftFinger22.mirror = true;
		setRotation(LeftFinger22, 0F, 0.4886922F, 1.047198F);
		LeftFinger3 = new ModelRenderer(this, 64, 47);
		LeftFinger3.addBox(3F, -20F, 2F, 1, 2, 1);
		LeftFinger3.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger3.setTextureSize(64, 32);
		LeftFinger3.mirror = true;
		setRotation(LeftFinger3, 0F, 0.2094395F, 1.570796F);
		LeftFinger32 = new ModelRenderer(this, 64, 50);
		LeftFinger32.addBox(3F, -20.88F, 5F, 1, 2, 1);
		LeftFinger32.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger32.setTextureSize(64, 32);
		LeftFinger32.mirror = true;
		setRotation(LeftFinger32, 0F, 0.3665191F, 1.570796F);
		LeftFinger4 = new ModelRenderer(this, 64, 53);
		LeftFinger4.addBox(-4F, -20F, 2F, 1, 2, 1);
		LeftFinger4.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger4.setTextureSize(64, 32);
		LeftFinger4.mirror = true;
		setRotation(LeftFinger4, 0F, 0.2094395F, 2.007129F);
		LeftFinger42 = new ModelRenderer(this, 64, 56);
		LeftFinger42.addBox(-3.4F, -20F, 7.4F, 1, 2, 1);
		LeftFinger42.setRotationPoint(0F, -15F, 1.5F);
		LeftFinger42.setTextureSize(64, 32);
		LeftFinger42.mirror = true;
		setRotation(LeftFinger42, 0F, 0.5061455F, 2.007129F);
		RightHand = new ModelRenderer(this, 70, 32);
		RightHand.addBox(-18.6F, 2.5F, 1.9F, 2, 2, 1);
		RightHand.setRotationPoint(0F, -15F, 1.5F);
		RightHand.setTextureSize(64, 32);
		RightHand.mirror = true;
		setRotation(RightHand, 0F, -0.2094395F, 0F);
		Cape1 = new ModelRenderer(this, 100, 0);
		Cape1.addBox(-17F, 2F, 1.1F, 34, 3, 0);
		Cape1.setRotationPoint(0F, -15F, 1.5F);
		Cape1.setTextureSize(64, 32);
		Cape1.mirror = true;
		setRotation(Cape1, 0.0523599F, 0F, 0F);
		Cape2 = new ModelRenderer(this, 100, 3);
		Cape2.addBox(-17F, 5F, 0.5F, 34, 3, 0);
		Cape2.setRotationPoint(0F, -15F, 1.5F);
		Cape2.setTextureSize(64, 32);
		Cape2.mirror = true;
		setRotation(Cape2, 0.1745329F, 0F, 0F);
		Cape3 = new ModelRenderer(this, 100, 6);
		Cape3.addBox(-17F, 7.9F, -0.8F, 34, 3, 0);
		Cape3.setRotationPoint(0F, -15F, 1.5F);
		Cape3.setTextureSize(64, 32);
		Cape3.mirror = true;
		setRotation(Cape3, 0.3490659F, 0F, 0F);
		Cape4 = new ModelRenderer(this, 100, 9);
		Cape4.addBox(-17F, 10.8F, -1F, 34, 3, 0);
		Cape4.setRotationPoint(0F, -15F, 1.5F);
		Cape4.setTextureSize(64, 32);
		Cape4.mirror = true;
		setRotation(Cape4, 0.3665191F, 0F, 0F);
		Cape5 = new ModelRenderer(this, 100, 12);
		Cape5.addBox(-17F, 13.8F, -1F, 34, 3, 0);
		Cape5.setRotationPoint(0F, -15F, 1.5F);
		Cape5.setTextureSize(64, 32);
		Cape5.mirror = true;
		setRotation(Cape5, 0.3665191F, 0F, 0F);
		Cape6 = new ModelRenderer(this, 100, 15);
		Cape6.addBox(-17F, 16.7F, -1F, 34, 3, 0);
		Cape6.setRotationPoint(0F, -15F, 1.5F);
		Cape6.setTextureSize(64, 32);
		Cape6.mirror = true;
		setRotation(Cape6, 0.3665191F, 0F, 0F);
		Cape7 = new ModelRenderer(this, 100, 18);
		Cape7.addBox(-17F, 19.6F, -1F, 34, 3, 0);
		Cape7.setRotationPoint(0F, -15F, 1.5F);
		Cape7.setTextureSize(64, 32);
		Cape7.mirror = true;
		setRotation(Cape7, 0.3665191F, 0F, 0F);
		Cape8 = new ModelRenderer(this, 100, 21);
		Cape8.addBox(-17F, 22F, -4F, 34, 3, 0);
		Cape8.setRotationPoint(0F, -15F, 1.5F);
		Cape8.setTextureSize(64, 32);
		Cape8.mirror = true;
		setRotation(Cape8, 0.5061455F, 0F, 0F);
		Cape9 = new ModelRenderer(this, 100, 24);
		Cape9.addBox(-17F, 25F, -4F, 34, 3, 0);
		Cape9.setRotationPoint(0F, -15F, 1.5F);
		Cape9.setTextureSize(64, 32);
		Cape9.mirror = true;
		setRotation(Cape9, 0.5061455F, 0F, 0F);
		Heart1 = new ModelRenderer(this, 48, 54);
		Heart1.addBox(-1F, 5.5F, -1F, 2, 2, 2);
		Heart1.setRotationPoint(0F, -15F, -1F);
		Heart1.setTextureSize(64, 32);
		Heart1.mirror = true;
		setRotation(Heart1, 0.0174533F, 0.7853982F, 0F);
		Heart2 = new ModelRenderer(this, 48, 48);
		Heart2.addBox(-1F, 5F, -1F, 2, 3, 2);
		Heart2.setRotationPoint(0F, -15F, -1F);
		Heart2.setTextureSize(64, 32);
		Heart2.mirror = true;
		setRotation(Heart2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		colonne1.render(f5);
		colonne2.render(f5);
		colonne3.render(f5);
		colonne4.render(f5);
		colonne5.render(f5);
		colonne6.render(f5);
		colonne7.render(f5);
		colonne8.render(f5);
		colonne9.render(f5);
		colonne10.render(f5);
		LeftArm1.render(f5);
		LeftArm2.render(f5);
		LeftArm3.render(f5);
		LeftArm4.render(f5);
		RightArm1.render(f5);
		RightArm2.render(f5);
		RightArm3.render(f5);
		RightArm4.render(f5);
		CoteGauche1.render(f5);
		CoteGauche2.render(f5);
		CoteGauche3.render(f5);
		CoteGauche4.render(f5);
		CoteDroite1.render(f5);
		CoteDroite2.render(f5);
		CoteDroite3.render(f5);
		CoteDroite4.render(f5);
		CoteGauche12.render(f5);
		CoteGauche22.render(f5);
		CoteGauche32.render(f5);
		CoteGauche42.render(f5);
		CoteDroite12.render(f5);
		CoteDroite22.render(f5);
		CoteDroite32.render(f5);
		CoteDroite42.render(f5);
		CoteGauche13.render(f5);
		CoteGauche23.render(f5);
		CoteGauche33.render(f5);
		CoteDroite13.render(f5);
		CoteDroite23.render(f5);
		CoteDroite33.render(f5);
		LeftHand.render(f5);
		LeftFinger1.render(f5);
		LeftFinger12.render(f5);
		LeftFinger2.render(f5);
		LeftFinger22.render(f5);
		LeftFinger3.render(f5);
		LeftFinger32.render(f5);
		LeftFinger4.render(f5);
		LeftFinger42.render(f5);
		RightHand.render(f5);
		Cape1.render(f5);
		Cape2.render(f5);
		Cape3.render(f5);
		Cape4.render(f5);
		Cape5.render(f5);
		Cape6.render(f5);
		Cape7.render(f5);
		Cape8.render(f5);
		Cape9.render(f5);
		Heart1.render(f5);
		Heart2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		float f6 = MathHelper.cos(f2 * 0.1F);

		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}