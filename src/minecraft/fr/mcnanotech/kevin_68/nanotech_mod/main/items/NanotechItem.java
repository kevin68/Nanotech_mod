package fr.mcnanotech.kevin_68.nanotech_mod.main.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import fr.mcnanotech.kevin_68.nanotech_mod.main.core.Nanotech_mod;
import fr.mcnanotech.kevin_68.nanotech_mod.main.utils.UtilDiskInfo;

public class NanotechItem
{
	// Items statement
	public static Item ItemBase, Superbottleofxp, Diamondbow, Emeraldbow,
			Nanomitebow, Nanomiteaxe, Nanomitepickaxe, Nanomiteshovel,
			Nanomitehoe, Nanomitesword, Nanomitehelmet, Nanomitechestplate,
			Nanomiteleggings, Nanomiteboots, Mysterioushelmet,
			Mysteriouschestplate, Mysteriousleggings, Mysteriousboots,
			Nanodisc, Yourmusicdisc, Yourmusicdisc2, Yourmusicdisc3,
			Yourmusicdisc4, Yourmusicdisc5, Yourmusicdisc6, Yourmusicdisc7,
			Yourmusicdisc8, Yourmusicdisc9, Yourmusicdisc10, Yourmusicdisc11,
			Yourmusicdisc12, Yourmusicdisc13, Yourmusicdisc14, Yourmusicdisc15,
			Yourmusicdisc16, Edibleflesh, Rottenchunk, Trail, scythe;

	// Enum tools and armor material
	public static EnumArmorMaterial EnumArmorMaterialMysterious = EnumHelper.addArmorMaterial("Mysterious", 50, new int[] {6, 6, 6, 6}, 15);
	public static EnumArmorMaterial EnumArmorMaterialNanomite = EnumHelper.addArmorMaterial("Nanomite", 50, new int[] {6, 6, 6, 6}, 15);
	public static EnumToolMaterial EnumToolMaterialNanomite = EnumHelper.addToolMaterial("Nanomite", 4, 2000, 13F, 4, 14);
	public static EnumToolMaterial EnumToolMaterialScythe = EnumHelper.addToolMaterial("Scythe", 4, 2500, 13F, 6, 2);

	// Items Initialization
	public static void initItem()
	{
		ItemBase = new ItemBaseMetadata(Nanotech_mod.ItemNanotechID).setUnlocalizedName("nanotechbase").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Superbottleofxp = new ItemSuperbottleofxp(Nanotech_mod.ItemSuperBottleOfXpID).setUnlocalizedName("superbottleofxp").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Diamondbow = new ItemDiamondBow(Nanotech_mod.ItemDiamondBowID).setUnlocalizedName("diamondbow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		Emeraldbow = new ItemEmeraldBow(Nanotech_mod.ItemEmeraldBowID).setUnlocalizedName("emeraldbow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		Nanomitebow = new ItemNanomiteBow(Nanotech_mod.ItemNanomiteBowID).setUnlocalizedName("nanomitebow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		Nanomitehelmet = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteHelmetID, EnumArmorMaterialNanomite, 1, 0).setUnlocalizedName("nanomiteHelmet").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomitechestplate = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteChestPlateID, EnumArmorMaterialNanomite, 1, 1).setUnlocalizedName("nanomiteChestPlate").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomiteleggings = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteLegginsID, EnumArmorMaterialNanomite, 1, 2).setUnlocalizedName("nanomiteLegs").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomiteboots = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteBootsID, EnumArmorMaterialNanomite, 1, 3).setUnlocalizedName("nanomiteBoots").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomitesword = new ItemNanomiteSword(Nanotech_mod.ItemNanomiteSwordID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteSword").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomiteshovel = new ItemNanomiteShovel(Nanotech_mod.ItemNanomiteShovelID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteShovel").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomitepickaxe = new ItemNanomitePickaxe(Nanotech_mod.ItemNanomitePickaxeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomitePickaxe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomiteaxe = new ItemNanomiteAxe(Nanotech_mod.ItemNanomiteAxeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteAxe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanomitehoe = new ItemNanomiteHoe(Nanotech_mod.ItemNanomiteHoeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteHoe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Mysterioushelmet = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousHelmetID, EnumArmorMaterialMysterious, 1, 0).setUnlocalizedName("mysteriousHelmet").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Mysteriouschestplate = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousChestPlateID, EnumArmorMaterialMysterious, 1, 1).setUnlocalizedName("mysteriousChestPlate").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Mysteriousleggings = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousLegginsID, EnumArmorMaterialMysterious, 1, 2).setUnlocalizedName("mysteriousLeggings").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Mysteriousboots = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousBootsID, EnumArmorMaterialMysterious, 1, 3).setUnlocalizedName("mysteriousBoots").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Nanodisc = new ItemDisk(Nanotech_mod.ItemNanoDiscID, "nanodisk", "JedBorg - Surprise", "nanodisk").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 1, "YourSound1", UtilDiskInfo.cdInfo[0], "disk1").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc2 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 2, "YourSound2", UtilDiskInfo.cdInfo[1], "disk2").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc3 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 3, "YourSound3", UtilDiskInfo.cdInfo[2], "disk3").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc4 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 4, "YourSound4", UtilDiskInfo.cdInfo[3], "disk4").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc5 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 5, "YourSound5", UtilDiskInfo.cdInfo[4], "disk5").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc6 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 6, "YourSound6", UtilDiskInfo.cdInfo[5], "disk6").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc7 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 7, "YourSound7", UtilDiskInfo.cdInfo[6], "disk7").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc8 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 8, "YourSound8", UtilDiskInfo.cdInfo[7], "disk8").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc9 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 9, "YourSound9", UtilDiskInfo.cdInfo[8], "disk9").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc10 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 10, "YourSound10", UtilDiskInfo.cdInfo[9], "disk10").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc11 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 11, "YourSound11", UtilDiskInfo.cdInfo[10], "disk11").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc12 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 12, "YourSound12", UtilDiskInfo.cdInfo[11], "disk12").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc13 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 13, "YourSound13", UtilDiskInfo.cdInfo[12], "disk13").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc14 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 14, "YourSound14", UtilDiskInfo.cdInfo[13], "disk12").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc15 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 15, "YourSound15", UtilDiskInfo.cdInfo[14], "disk15").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Yourmusicdisc16 = new ItemDisk(Nanotech_mod.ItemNanoDiscID + 16, "YourSound16", UtilDiskInfo.cdInfo[15], "disk16").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Edibleflesh = new ItemEdibleflesh(Nanotech_mod.ItemEdibleFleshID, 3, 0.6F, true).setUnlocalizedName("edibleFlesh").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Rottenchunk = new ItemEdibleflesh(Nanotech_mod.ItemRottenChunkID, 1, 0.6F, true).setUnlocalizedName("rottenChunk").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		Trail = new ItemTrail(Nanotech_mod.ItemTrailID).setUnlocalizedName("itemTrail").setCreativeTab(Nanotech_mod.CREATIVE_TAB_B);
		scythe = new ItemScythe(Nanotech_mod.ItemScytheID, EnumToolMaterialScythe).setUnlocalizedName("scythe").setFull3D().setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
	}

}
