package fr.mcnanotech.kevin_68.nanotech_mod.city.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mcnanotech.kevin_68.nanotech_mod.city.blocks.NanotechCityBlock;
import fr.mcnanotech.kevin_68.nanotech_mod.city.creativetab.CreativetabCity;
import fr.mcnanotech.kevin_68.nanotech_mod.city.items.NanotechCityItem;
import fr.mcnanotech.kevin_68.nanotech_mod.city.network.GuiHandler;
import fr.mcnanotech.kevin_68.nanotech_mod.city.network.PacketHandler;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntityFountain;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntityLamp;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntityLampLight;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntitySpotLight;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntitySunShade;
import fr.mcnanotech.kevin_68.nanotech_mod.city.tileentity.TileEntityTrail;
import fr.mcnanotech.kevin_68.nanotech_mod.main.core.Nanotech_mod;

@Mod(modid = "Nanotech_mod_City", name = "Nanotech mod City", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = {"NTMC|light", "NTMC|fount"}, packetHandler = PacketHandler.class)
public class Nanotech_mod_City 
{
	// Instance
	@Instance("Nanotech_mod_City")
	public static Nanotech_mod_City modInstance;
	// Proxy
	@SidedProxy(clientSide = "fr.mcnanotech.kevin_68.nanotech_mod.city.core.ClientProxy", serverSide = "fr.mcnanotech.kevin_68.nanotech_mod.city.core.CommonProxy")
	public static CommonProxy proxy;

	// Block IDs
	public static int BlockTrashcanID, BlockSpotLightID, BlockTrailID, BlockFountainID, BlockLampID, BlockLampLightID, BlockSunShadeID;

	// Item IDs
	public static int ItemLampID, ItemSunShadeID;

	// Configuration Category
	public static final String CATEGORY_Other = "Other configs";
	
	public static CreativetabCity CREATIVE_TAB_C = new CreativetabCity("NanotechModCity");

	@EventHandler
	public void PreInitNanotech_mod(FMLPreInitializationEvent event)
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			cfg.load();
			BlockTrashcanID = cfg.getBlock("Trash can", 1100).getInt();
			BlockSpotLightID = cfg.getBlock("SpotLight", 1101).getInt();
			BlockTrailID = cfg.getBlock("Trail", 1021).getInt();
			BlockFountainID = cfg.getBlock("Fountain", 1023).getInt();
			BlockLampID = cfg.getBlock("Lamp", 1024).getInt();
			BlockLampLightID = cfg.getBlock("LampLight", 1025).getInt();
			BlockSunShadeID = cfg.getBlock("SunShade", 1026).getInt();

			ItemLampID = cfg.getItem("Lamp", 5150).getInt();
			ItemSunShadeID = cfg.getItem("SunShade", 5151).getInt();

		}
		catch(Exception ex)
		{
			Nanotech_mod.NanoLog.severe("Failed to load configuration");
		}
		finally
		{
			if(cfg.hasChanged())
			{
				cfg.save();
			}
		}
		
		NanotechCityBlock.initBlock();
		NanotechCityBlock.blockRegistry();
		NanotechCityItem.initItem();
	}
	
	@EventHandler
	public void InitNanotech_mod(FMLInitializationEvent event)
	{
		this.guiAndTileEntity();
		proxy.registerModRenders();
	}
	
	@EventHandler
	public void PostInitNanotech_mod(FMLPostInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(NanotechCityItem.lamp, 1), new Object[]
		{"IDI", "GSG", "III", 'I', Item.ingotIron, 'D', Block.daylightSensor, 'G', Block.thinGlass, 'S', Block.glowStone});
		GameRegistry.addRecipe(new ItemStack(NanotechCityItem.sunShade, 1), new Object[]
		{"WWW", " S ", " S ", 'W', Block.cloth, 'S', Item.stick});
	}

	// Gui and TileEntity
	public void guiAndTileEntity()
	{
		NetworkRegistry.instance().registerGuiHandler(this.modInstance, new GuiHandler());
		NetworkRegistry.instance().registerChannel(new PacketHandler(), "nanotechmodcity");

		GameRegistry.registerTileEntity(TileEntitySpotLight.class, "TileEntitySpotLight");
		GameRegistry.registerTileEntity(TileEntityTrail.class, "TileEntityTrail");
		GameRegistry.registerTileEntity(TileEntityFountain.class, "TileEntityFountain");
		GameRegistry.registerTileEntity(TileEntityLamp.class, "TileEntityLamp");
		GameRegistry.registerTileEntity(TileEntityLampLight.class, "TileEntityLampLight");
		GameRegistry.registerTileEntity(TileEntitySunShade.class, "TileEntitySunShade");
	}

	
}