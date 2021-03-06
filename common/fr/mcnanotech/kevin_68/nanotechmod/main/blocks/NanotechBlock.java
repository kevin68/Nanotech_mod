/**
 * This work is made available under the terms of the Creative Commons Attribution License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en
 * 
 * Cette œuvre est mise à disposition selon les termes de la Licence Creative Commons Attribution:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/deed.fr
 */
package fr.mcnanotech.kevin_68.nanotechmod.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mcnanotech.kevin_68.nanotechmod.main.core.NanotechMod;

public class NanotechBlock
{
    public static Block nanoPortal, portalFrame, nanoGrass, fakeOre, speed, jump, multiplier, smoker, barbedWire, nanoWood, nanoLeaves, nanoSaplings, nanoPlank, ore, confusion, falling, notFalling, sodium, mossyStone, theDeathHead, listerJukeBox, nanoFence, nanoStairs, nanoStepSingle, nanoStepDouble, satelite, nukeBuilding, nukeBuildingStairs, present, machine, cereal, clearglass;

    public static void initBlock()
    {
        nanoPortal = new BlockNanoPortal().setBlockUnbreakable().setBlockName("portal").setBlockTextureName(NanotechMod.MODID + ":nanoportal");
        portalFrame = new BlockBase(Material.rock).setHardness(2.0F).setResistance(10.0F).setBlockName("portalframe").setBlockTextureName(NanotechMod.MODID + ":portalframe").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        nanoGrass = new BlockGrass().setHardness(0.6F).setResistance(1.0F).setBlockName("nanograss").setBlockTextureName(NanotechMod.MODID + ":grass").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeGrass);
        fakeOre = new BlockFakeOre().setHardness(3.0F).setResistance(10.0F).setBlockName("fakeore").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        speed = new BlockSpeed().setHardness(1.5F).setResistance(10.0F).setBlockName("speed").setBlockTextureName(NanotechMod.MODID + ":").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        jump = new BlockJumper().setHardness(1.5F).setResistance(10.0F).setBlockName("jumper").setBlockTextureName(NanotechMod.MODID + ":jump").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        multiplier = new BlockMultiplier().setHardness(0.0F).setResistance(0.0F).setBlockName("multiplier").setBlockTextureName(NanotechMod.MODID + ":multiplier").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeMetal);
        smoker = new BlockSmoker().setHardness(1.5F).setResistance(10.0F).setBlockName("smoker").setBlockTextureName(NanotechMod.MODID + ":smoker").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        barbedWire = new BlockBarbedWire().setHardness(3.0F).setResistance(15.0F).setBlockName("barbedwire").setBlockTextureName(NanotechMod.MODID + ":barbedwire").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeMetal);
        nanoWood = new BlockNanoWood().setHardness(1.0F).setResistance(10.0F).setBlockName("nanowood").setBlockTextureName(NanotechMod.MODID + ":log").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        nanoLeaves = new BlockNanoLeaves().setHardness(0.2F).setResistance(10.0F).setBlockName("nanoleaves").setBlockTextureName(NanotechMod.MODID + ":nanoleaves").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeGrass);
        nanoSaplings = new BlockNanoSaplings().setHardness(0.0F).setResistance(0.0F).setBlockName("nanosaplings").setBlockTextureName(NanotechMod.MODID + ":sapling").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeGrass);
        nanoPlank = new BlockBase(Material.wood).setHardness(2.0F).setResistance(10.0F).setBlockName("nanoplanks").setBlockTextureName(NanotechMod.MODID + ":nanoplank").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        ore = new BlockNanotechOre().setHardness(2.0F).setResistance(10.0F).setBlockName("ore").setBlockTextureName(NanotechMod.MODID + ":").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        confusion = new BlockConfusion().setHardness(5.0F).setResistance(15.0F).setBlockName("confusion").setBlockTextureName(NanotechMod.MODID + ":confusion").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        falling = new BlockNanoFalling().setHardness(1.5F).setResistance(10.0F).setBlockName("falling").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        notFalling = new BlockNotFalling().setHardness(0.5F).setResistance(5.0F).setBlockName("notfalling").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeGravel);
        sodium = new BlockSodium().setHardness(2.0F).setResistance(10.0F).setBlockName("sodium").setBlockTextureName(NanotechMod.MODID + ":sodium").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        mossyStone = new BlockBase(Material.rock).setHardness(1.0F).setResistance(10.0F).setBlockName("mossystone").setBlockTextureName(NanotechMod.MODID + ":mossystone").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        theDeathHead = new BlockTheDeathHead().setHardness(5.0F).setResistance(25.0F).setBlockName("theDeathHead").setBlockTextureName(NanotechMod.MODID + ":theDeathHead").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeStone);
        listerJukeBox = new BlockListerJukebox().setHardness(2.0F).setResistance(10.0F).setBlockName("listerJukebox").setBlockTextureName(NanotechMod.MODID + ":listerjukebox").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        nanoFence = new BlockFence(NanotechMod.MODID + ":nanoplank", Material.wood).setHardness(2.0F).setResistance(5.0F).setBlockName("nanoFence").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        nanoStairs = new BlockNanoStairs(nanoPlank, 0).setBlockName("nanoStairs").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        nanoStepSingle = new BlockNanoSteps(false).setHardness(2.0F).setResistance(5.0F).setBlockName("nanoSlabSingle").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeWood);
        nanoStepDouble = new BlockNanoSteps(true).setHardness(2.0F).setResistance(5.0F).setBlockName("nanoSlabDouble").setStepSound(Block.soundTypeWood);
        satelite = new BlockSat().setHardness(3.0F).setResistance(2.0F).setBlockName("satelite").setBlockTextureName(NanotechMod.MODID + ":").setStepSound(Block.soundTypeMetal);
        nukeBuilding = new BlockBuildingNuke().setHardness(2.0F).setResistance(15.0F).setBlockName("nukeBuildingBlock").setBlockTextureName(NanotechMod.MODID + ":nukebuilding").setStepSound(Block.soundTypeMetal);
        nukeBuildingStairs = new BlockNanoStairs(nukeBuilding, 0).setBlockName("nukeBuildingStairs").setStepSound(Block.soundTypeMetal);
        present = new BlockPresent().setHardness(1.0F).setResistance(5.0F).setBlockName("present").setBlockTextureName(NanotechMod.MODID + ":present").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeCloth);
        machine = new BlockNanotechMachine(Material.wood).setHardness(1.0F).setResistance(15.0F).setBlockName("machine").setCreativeTab(NanotechMod.CreaB);
        cereal = new BlockCereal().setHardness(0.5F).setResistance(3.0F).setBlockName("cereal").setCreativeTab(NanotechMod.CreaB).setStepSound(Block.soundTypeGrass);
        clearglass = new BlockClearGlass().setBlockName("clearglass").setHardness(0.6F).setCreativeTab(NanotechMod.CreaB);

        GameRegistry.registerBlock(nanoPortal, ItemBlock.class, "BlockPortal");
        GameRegistry.registerBlock(portalFrame, ItemBlock.class, "BlockPortalframe");
        GameRegistry.registerBlock(nanoGrass, ItemBlock.class, "BlockGrass");
        GameRegistry.registerBlock(fakeOre, ItemBlockFakeOre.class, "BlockFakeOre");
        GameRegistry.registerBlock(speed, ItemBlockSpeed.class, "BlockSpeed");
        GameRegistry.registerBlock(jump, ItemBlockJumper.class, "BlockJumper");
        GameRegistry.registerBlock(multiplier, ItemBlock.class, "BlockMultiplier");
        GameRegistry.registerBlock(smoker, ItemBlock.class, "BlockSmoker");
        GameRegistry.registerBlock(barbedWire, ItemBlock.class, "BlockBarbedwire");
        GameRegistry.registerBlock(nanoWood, ItemBlock.class, "BlockNanowood");
        GameRegistry.registerBlock(nanoLeaves, ItemBlock.class, "BlockNanoleaves");
        GameRegistry.registerBlock(nanoSaplings, ItemBlock.class, "BlockNanosaplings");
        GameRegistry.registerBlock(nanoPlank, ItemBlock.class, "BlockNanoplanks");
        GameRegistry.registerBlock(ore, ItemBlockNanotechOre.class, "BlockNanoOre");
        GameRegistry.registerBlock(confusion, ItemBlock.class, "BlockConfusion");
        GameRegistry.registerBlock(falling, ItemBlockFalling.class, "BlockFalling");
        GameRegistry.registerBlock(notFalling, ItemBlockNotFalling.class, "Blocknotfalling");
        GameRegistry.registerBlock(sodium, ItemBlock.class, "BlockSodium");
        GameRegistry.registerBlock(mossyStone, ItemBlock.class, "BlockMossyStone");
        GameRegistry.registerBlock(theDeathHead, ItemBlock.class, "BlockTheDeathHead");
        GameRegistry.registerBlock(listerJukeBox, ItemBlock.class, "ListerJukebox");
        GameRegistry.registerBlock(nanoFence, ItemBlock.class, "nanoFence");
        GameRegistry.registerBlock(nanoStairs, ItemBlock.class, "nanoStairs");
        GameRegistry.registerBlock(nanoStepSingle, ItemBlockNanoSteps.class, "BlockNanoSlabSingle");
        GameRegistry.registerBlock(nanoStepDouble, ItemBlockNanoSteps.class, "BlockNanoSlabDouble");
        GameRegistry.registerBlock(satelite, ItemBlockSatelite.class, "satelite");
        GameRegistry.registerBlock(nukeBuilding, ItemBlockNukeBuildingBlock.class, "nukeBuildingBlock");
        GameRegistry.registerBlock(nukeBuildingStairs, ItemBlock.class, "nukeBuildingStairs");
        GameRegistry.registerBlock(present, ItemBlock.class, "present");
        GameRegistry.registerBlock(machine, ItemBlockMachine.class, "machine");
        GameRegistry.registerBlock(cereal, ItemBlockCereal.class, "cereal");
        GameRegistry.registerBlock(clearglass, ItemBlock.class, "ntm_clearglass");

        nukeBuildingStairs.setCreativeTab(null);

        NanotechMod.nanoLogger.info("Blocks initialized");
    }
}