package fr.mcnanotech.kevin_68.nanotech_mod.main.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import fr.mcnanotech.kevin_68.nanotech_mod.main.blocks.NanotechBlock;
import fr.mcnanotech.kevin_68.nanotech_mod.main.core.Nanotech_mod;

public class NanotechItem
{
	// Items statement
	public static Item itemBase, superBottleOfXp, diamondBow, emeraldBow, nanomiteBow, nanomiteAxe, nanomitePickaxe, nanomiteShovel, nanomiteHoe, nanomiteSword, nanomiteHelmet, nanomiteChestPlate, nanomiteLeggings, nanomiteBoots, mysteriousHelmet, mysteriousChestPlate, mysteriousLeggings, mysteriousBoots, nanoDisc, edibleFlesh, rottenChunk, scythe, crazyGlasses, debug, alters, nitrogenBucket;

	// Enum tools and armor material
	public static EnumArmorMaterial EnumArmorMaterialMysterious = EnumHelper.addArmorMaterial("Mysterious", 50, new int[] {6, 6, 6, 6}, 15);
	public static EnumArmorMaterial EnumArmorMaterialNanomite = EnumHelper.addArmorMaterial("Nanomite", 50, new int[] {6, 6, 6, 6}, 15);
	public static EnumArmorMaterial EnumArmorMaterialCrazyGlasses = EnumHelper.addArmorMaterial("CrazyGlasses", 0, new int[] {0, 0, 0, 0}, 0);
	public static EnumToolMaterial EnumToolMaterialNanomite = EnumHelper.addToolMaterial("Nanomite", 4, 2000, 13F, 4, 14);
	public static EnumToolMaterial EnumToolMaterialScythe = EnumHelper.addToolMaterial("Scythe", 4, 2500, 13F, 16, 2);

	// Items Initialization
	public static void initItem()
	{
		itemBase = new ItemBaseMetadata(Nanotech_mod.ItemNanotechID).setUnlocalizedName("nanotechbase").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		superBottleOfXp = new ItemSuperbottleofxp(Nanotech_mod.ItemSuperBottleOfXpID).setUnlocalizedName("superbottleofxp").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		diamondBow = new ItemDiamondBow(Nanotech_mod.ItemDiamondBowID).setUnlocalizedName("diamondbow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		emeraldBow = new ItemEmeraldBow(Nanotech_mod.ItemEmeraldBowID).setUnlocalizedName("emeraldbow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		nanomiteBow = new ItemNanomiteBow(Nanotech_mod.ItemNanomiteBowID).setUnlocalizedName("nanomitebow").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I).setFull3D();
		nanomiteHelmet = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteHelmetID, EnumArmorMaterialNanomite, 1, 0).setUnlocalizedName("nanomiteHelmet").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteChestPlate = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteChestPlateID, EnumArmorMaterialNanomite, 1, 1).setUnlocalizedName("nanomiteChestPlate").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteLeggings = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteLegginsID, EnumArmorMaterialNanomite, 1, 2).setUnlocalizedName("nanomiteLegs").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteBoots = new ItemNanomiteArmor(Nanotech_mod.ItemNanomiteBootsID, EnumArmorMaterialNanomite, 1, 3).setUnlocalizedName("nanomiteBoots").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteSword = new ItemNanomiteSword(Nanotech_mod.ItemNanomiteSwordID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteSword").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteShovel = new ItemNanomiteShovel(Nanotech_mod.ItemNanomiteShovelID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteShovel").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomitePickaxe = new ItemNanomitePickaxe(Nanotech_mod.ItemNanomitePickaxeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomitePickaxe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteAxe = new ItemNanomiteAxe(Nanotech_mod.ItemNanomiteAxeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteAxe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanomiteHoe = new ItemNanomiteHoe(Nanotech_mod.ItemNanomiteHoeID, EnumToolMaterialNanomite).setUnlocalizedName("nanomiteHoe").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		mysteriousHelmet = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousHelmetID, EnumArmorMaterialMysterious, 1, 0).setUnlocalizedName("mysteriousHelmet").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		mysteriousChestPlate = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousChestPlateID, EnumArmorMaterialMysterious, 1, 1).setUnlocalizedName("mysteriousChestPlate").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		mysteriousLeggings = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousLegginsID, EnumArmorMaterialMysterious, 1, 2).setUnlocalizedName("mysteriousLeggings").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		mysteriousBoots = new ItemMysteriousArmor(Nanotech_mod.ItemMysteriousBootsID, EnumArmorMaterialMysterious, 1, 3).setUnlocalizedName("mysteriousBoots").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nanoDisc = new ItemDisk(Nanotech_mod.ItemNanoDiscID, "nanotech_mod:nanodisk", "JedBorg - Surprise", "nanodisk").setUnlocalizedName("record").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		edibleFlesh = new ItemNanoFood(Nanotech_mod.ItemEdibleFleshID, 3, 0.6F, true).setUnlocalizedName("edibleFlesh").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		rottenChunk = new ItemNanoFood(Nanotech_mod.ItemRottenChunkID, 1, 0.6F, true, Potion.hunger.id, 120, 0, 1.0F).setUnlocalizedName("rottenChunk").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		scythe = new ItemScythe(Nanotech_mod.ItemScytheID, EnumToolMaterialScythe).setUnlocalizedName("scythe").setFull3D().setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		crazyGlasses = new ItemCrazyGlasses(Nanotech_mod.ItemCrazyGlassesID, EnumArmorMaterialCrazyGlasses, 1, 0).setUnlocalizedName("crazyGlasses").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		debug = new ItemDebug(Nanotech_mod.DebugID).setUnlocalizedName("debug").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		alters = new ItemAlters(Nanotech_mod.AltersID).setUnlocalizedName("alters").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
		nitrogenBucket = new ItemNitrogenBucket(Nanotech_mod.NitrogenBucketID, NanotechBlock.liquidNitrogen.blockID).setUnlocalizedName("nitrogenBucket").setTextureName("nanotech_mod:nitrogenbucket").setCreativeTab(Nanotech_mod.CREATIVE_TAB_I);
	}
}