package fr.mcnanotech.kevin_68.nanotech_mod.main.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import fr.mcnanotech.kevin_68.nanotech_mod.main.blocks.NanotechBlock;

public class WorldModel4 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks()
	{
		return new int[] {Block.stone.blockID, Block.dirt.blockID, NanotechBlock.BlockGrass.blockID};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z)
	{
		int distanceToAir = 0;
		int checkID = world.getBlockId(x, y, z);

		while(checkID != 0)
		{
			distanceToAir++;
			checkID = world.getBlockId(x, y + distanceToAir, z);
		}

		if(distanceToAir > 3)
		{
			return false;
		}
		y += distanceToAir - 1;

		int blockID = world.getBlockId(x, y, z);
		int blockIDAbove = world.getBlockId(x, y + 1, z);
		int blockIDBelow = world.getBlockId(x, y - 1, z);
		for(int valideId : GetValidSpawnBlocks())
		{
			if(blockIDAbove != 0)
			{
				return false;
			}
			if(blockID == valideId)
			{
				return true;
			}
			else if(blockID == Block.snow.blockID && blockIDBelow == valideId)
			{
				return true;
			}
		}
		return false;
	}

	public WorldModel4()
	{}

	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		// checz that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 8, y, z) || !LocationIsValidSpawn(world, x + 8, y, z + 11) || !LocationIsValidSpawn(world, x, y, z + 11))
		{
			return false;
		}

		world.setBlockToAir(x + 0, y + 0, z + 0);
		world.setBlockToAir(x + 0, y + 0, z + 1);
		world.setBlock(x + 0, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 0, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 0, y + 0, z + 4, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 0, y + 0, z + 5);
		world.setBlockToAir(x + 0, y + 0, z + 6);
		world.setBlockToAir(x + 0, y + 1, z + 0);
		world.setBlockToAir(x + 0, y + 1, z + 1);
		world.setBlock(x + 0, y + 1, z + 2, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 0, y + 1, z + 3, Block.cobblestone.blockID);
		world.setBlockToAir(x + 0, y + 1, z + 4);
		world.setBlockToAir(x + 0, y + 1, z + 5);
		world.setBlockToAir(x + 0, y + 1, z + 6);
		world.setBlockToAir(x + 0, y + 2, z + 0);
		world.setBlockToAir(x + 0, y + 2, z + 1);
		world.setBlockToAir(x + 0, y + 2, z + 2);
		world.setBlock(x + 0, y + 2, z + 3, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 0, y + 2, z + 4);
		world.setBlockToAir(x + 0, y + 2, z + 5);
		world.setBlockToAir(x + 0, y + 2, z + 6);
		world.setBlockToAir(x + 0, y + 3, z + 0);
		world.setBlockToAir(x + 0, y + 3, z + 1);
		world.setBlockToAir(x + 0, y + 3, z + 2);
		world.setBlockToAir(x + 0, y + 3, z + 3);
		world.setBlockToAir(x + 0, y + 3, z + 4);
		world.setBlockToAir(x + 0, y + 3, z + 5);
		world.setBlockToAir(x + 0, y + 3, z + 6);
		world.setBlockToAir(x + 0, y + 4, z + 0);
		world.setBlockToAir(x + 0, y + 4, z + 1);
		world.setBlockToAir(x + 0, y + 4, z + 2);
		world.setBlockToAir(x + 0, y + 4, z + 3);
		world.setBlockToAir(x + 0, y + 4, z + 4);
		world.setBlockToAir(x + 0, y + 4, z + 5);
		world.setBlockToAir(x + 0, y + 4, z + 6);
		world.setBlockToAir(x + 0, y + 5, z + 0);
		world.setBlockToAir(x + 0, y + 5, z + 1);
		world.setBlockToAir(x + 0, y + 5, z + 2);
		world.setBlockToAir(x + 0, y + 5, z + 3);
		world.setBlockToAir(x + 0, y + 5, z + 4);
		world.setBlockToAir(x + 0, y + 5, z + 5);
		world.setBlockToAir(x + 0, y + 5, z + 6);
		world.setBlockToAir(x + 0, y + 6, z + 0);
		world.setBlockToAir(x + 0, y + 6, z + 1);
		world.setBlockToAir(x + 0, y + 6, z + 2);
		world.setBlockToAir(x + 0, y + 6, z + 3);
		world.setBlockToAir(x + 0, y + 6, z + 4);
		world.setBlockToAir(x + 0, y + 6, z + 5);
		world.setBlock(x + 1, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 1, z + 0, Block.wood.blockID);
		world.setBlock(x + 1, y + 1, z + 1, Block.planks.blockID);
		world.setBlock(x + 1, y + 1, z + 2, Block.planks.blockID);
		world.setBlock(x + 1, y + 1, z + 4, Block.planks.blockID);
		world.setBlock(x + 1, y + 1, z + 5, Block.planks.blockID);
		world.setBlock(x + 1, y + 1, z + 6, Block.wood.blockID);
		world.setBlock(x + 1, y + 2, z + 0, Block.wood.blockID);
		world.setBlock(x + 1, y + 2, z + 1, Block.planks.blockID);
		world.setBlock(x + 1, y + 2, z + 2, Block.fence.blockID);
		world.setBlock(x + 1, y + 2, z + 3, Block.planks.blockID);
		world.setBlock(x + 1, y + 2, z + 4, Block.fence.blockID);
		world.setBlock(x + 1, y + 2, z + 5, Block.planks.blockID);
		world.setBlock(x + 1, y + 2, z + 6, Block.wood.blockID);
		world.setBlock(x + 1, y + 3, z + 0, Block.wood.blockID);
		world.setBlock(x + 1, y + 3, z + 1, Block.planks.blockID);
		world.setBlock(x + 1, y + 3, z + 2, Block.planks.blockID);
		world.setBlock(x + 1, y + 3, z + 3, Block.planks.blockID);
		world.setBlock(x + 1, y + 3, z + 4, Block.planks.blockID);
		world.setBlock(x + 1, y + 3, z + 5, Block.planks.blockID);
		world.setBlock(x + 1, y + 3, z + 6, Block.wood.blockID);
		world.setBlock(x + 1, y + 4, z + 0, Block.wood.blockID);
		world.setBlock(x + 1, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlockToAir(x + 1, y + 4, z + 2);
		world.setBlockToAir(x + 1, y + 4, z + 3);
		world.setBlockToAir(x + 1, y + 4, z + 4);
		world.setBlock(x + 1, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 1, y + 4, z + 6, Block.wood.blockID);
		world.setBlock(x + 1, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 1, y + 5, z + 1, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 1, y + 5, z + 2);
		world.setBlockToAir(x + 1, y + 5, z + 3);
		world.setBlockToAir(x + 1, y + 5, z + 4);
		world.setBlock(x + 1, y + 5, z + 5, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 1, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 1, y + 6, z + 0);
		world.setBlockToAir(x + 1, y + 6, z + 1);
		world.setBlockToAir(x + 1, y + 6, z + 2);
		world.setBlockToAir(x + 1, y + 6, z + 3);
		world.setBlockToAir(x + 1, y + 6, z + 4);
		world.setBlockToAir(x + 1, y + 6, z + 5);
		world.setBlockToAir(x + 1, y + 6, z + 6);
		world.setBlock(x + 2, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 1, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 2, y + 1, z + 1);
		world.setBlockToAir(x + 2, y + 1, z + 2);
		world.setBlock(x + 2, y + 1, z + 3, Block.tripWire.blockID, 4, 3);
		world.setBlockToAir(x + 2, y + 1, z + 4);
		world.setBlockToAir(x + 2, y + 1, z + 5);
		world.setBlock(x + 2, y + 1, z + 6, Block.planks.blockID);
		world.setBlock(x + 2, y + 2, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 2, y + 2, z + 1);
		world.setBlockToAir(x + 2, y + 2, z + 2);
		world.setBlockToAir(x + 2, y + 2, z + 3);
		world.setBlockToAir(x + 2, y + 2, z + 4);
		world.setBlockToAir(x + 2, y + 2, z + 5);
		world.setBlock(x + 2, y + 2, z + 6, Block.planks.blockID);
		world.setBlock(x + 2, y + 3, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 2, y + 3, z + 1);
		world.setBlockToAir(x + 2, y + 3, z + 2);
		world.setBlockToAir(x + 2, y + 3, z + 3);
		world.setBlockToAir(x + 2, y + 3, z + 4);
		world.setBlockToAir(x + 2, y + 3, z + 5);
		world.setBlock(x + 2, y + 3, z + 6, Block.planks.blockID);
		world.setBlock(x + 2, y + 4, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 2, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 2, y + 5, z + 1);
		world.setBlockToAir(x + 2, y + 5, z + 2);
		world.setBlockToAir(x + 2, y + 5, z + 3);
		world.setBlockToAir(x + 2, y + 5, z + 4);
		world.setBlockToAir(x + 2, y + 5, z + 5);
		world.setBlock(x + 2, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 2, y + 6, z + 0);
		world.setBlockToAir(x + 2, y + 6, z + 1);
		world.setBlockToAir(x + 2, y + 6, z + 2);
		world.setBlockToAir(x + 2, y + 6, z + 3);
		world.setBlockToAir(x + 2, y + 6, z + 4);
		world.setBlockToAir(x + 2, y + 6, z + 5);
		world.setBlockToAir(x + 2, y + 6, z + 6);
		world.setBlock(x + 3, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 1, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 3, y + 1, z + 1);
		world.setBlockToAir(x + 3, y + 1, z + 2);
		world.setBlock(x + 3, y + 1, z + 3, Block.tripWire.blockID, 4, 3);
		world.setBlockToAir(x + 3, y + 1, z + 4);
		world.setBlockToAir(x + 3, y + 1, z + 5);
		world.setBlock(x + 3, y + 1, z + 6, Block.planks.blockID);
		world.setBlock(x + 3, y + 2, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 3, y + 2, z + 1);
		world.setBlockToAir(x + 3, y + 2, z + 2);
		world.setBlockToAir(x + 3, y + 2, z + 3);
		world.setBlockToAir(x + 3, y + 2, z + 4);
		world.setBlockToAir(x + 3, y + 2, z + 5);
		world.setBlock(x + 3, y + 2, z + 6, Block.fence.blockID);
		world.setBlock(x + 3, y + 3, z + 0, Block.planks.blockID);
		world.setBlockToAir(x + 3, y + 3, z + 1);
		world.setBlockToAir(x + 3, y + 3, z + 2);
		world.setBlockToAir(x + 3, y + 3, z + 3);
		world.setBlockToAir(x + 3, y + 3, z + 4);
		world.setBlockToAir(x + 3, y + 3, z + 5);
		world.setBlock(x + 3, y + 3, z + 6, Block.planks.blockID);
		world.setBlock(x + 3, y + 4, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 3, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 3, y + 5, z + 1);
		world.setBlockToAir(x + 3, y + 5, z + 2);
		world.setBlockToAir(x + 3, y + 5, z + 3);
		world.setBlockToAir(x + 3, y + 5, z + 4);
		world.setBlockToAir(x + 3, y + 5, z + 5);
		world.setBlock(x + 3, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 3, y + 6, z + 0);
		world.setBlockToAir(x + 3, y + 6, z + 1);
		world.setBlockToAir(x + 3, y + 6, z + 2);
		world.setBlockToAir(x + 3, y + 6, z + 3);
		world.setBlockToAir(x + 3, y + 6, z + 4);
		world.setBlockToAir(x + 3, y + 6, z + 5);
		world.setBlockToAir(x + 3, y + 6, z + 6);
		world.setBlock(x + 4, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 0, z + 4, NanotechBlock.BlockSodium.blockID);
		world.setBlock(x + 4, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 1, z + 0, Block.wood.blockID);
		world.setBlockToAir(x + 4, y + 1, z + 1);
		world.setBlock(x + 4, y + 1, z + 2, Block.planks.blockID);
		world.setBlock(x + 4, y + 1, z + 4, Block.cobblestone.blockID);
		world.setBlockToAir(x + 4, y + 1, z + 5);
		world.setBlock(x + 4, y + 1, z + 6, Block.planks.blockID);
		world.setBlock(x + 4, y + 2, z + 0, Block.wood.blockID);
		world.setBlockToAir(x + 4, y + 2, z + 1);
		world.setBlock(x + 4, y + 2, z + 2, Block.planks.blockID);
		world.setBlockToAir(x + 4, y + 2, z + 3);
		world.setBlockToAir(x + 4, y + 2, z + 4);
		world.setBlockToAir(x + 4, y + 2, z + 5);
		world.setBlock(x + 4, y + 2, z + 6, Block.planks.blockID);
		world.setBlock(x + 4, y + 3, z + 0, Block.wood.blockID);
		world.setBlock(x + 4, y + 3, z + 1, Block.planks.blockID);
		world.setBlock(x + 4, y + 3, z + 2, Block.planks.blockID);
		world.setBlockToAir(x + 4, y + 3, z + 3);
		world.setBlockToAir(x + 4, y + 3, z + 4);
		world.setBlockToAir(x + 4, y + 3, z + 5);
		world.setBlock(x + 4, y + 3, z + 6, Block.planks.blockID);
		world.setBlock(x + 4, y + 4, z + 0, Block.wood.blockID);
		world.setBlock(x + 4, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlockToAir(x + 4, y + 4, z + 4);
		world.setBlock(x + 4, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 4, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 4, y + 5, z + 1);
		world.setBlockToAir(x + 4, y + 5, z + 2);
		world.setBlockToAir(x + 4, y + 5, z + 3);
		world.setBlockToAir(x + 4, y + 5, z + 4);
		world.setBlockToAir(x + 4, y + 5, z + 5);
		world.setBlock(x + 4, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 4, y + 6, z + 0);
		world.setBlockToAir(x + 4, y + 6, z + 1);
		world.setBlockToAir(x + 4, y + 6, z + 2);
		world.setBlockToAir(x + 4, y + 6, z + 3);
		world.setBlockToAir(x + 4, y + 6, z + 4);
		world.setBlockToAir(x + 4, y + 6, z + 5);
		world.setBlockToAir(x + 4, y + 6, z + 6);
		world.setBlock(x + 5, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 0, z + 3, Block.pistonBase.blockID, 3, 3);
		world.setBlock(x + 5, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlockToAir(x + 5, y + 0, z + 6);
		world.setBlockToAir(x + 5, y + 1, z + 0);
		world.setBlockToAir(x + 5, y + 1, z + 1);
		world.setBlockToAir(x + 5, y + 1, z + 2);
		world.setBlock(x + 5, y + 1, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 5, y + 1, z + 4);
		world.setBlockToAir(x + 5, y + 1, z + 5);
		world.setBlock(x + 5, y + 1, z + 6, Block.planks.blockID);
		world.setBlockToAir(x + 5, y + 2, z + 0);
		world.setBlockToAir(x + 5, y + 2, z + 1);
		world.setBlockToAir(x + 5, y + 2, z + 2);
		world.setBlock(x + 5, y + 2, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 5, y + 2, z + 4);
		world.setBlockToAir(x + 5, y + 2, z + 5);
		world.setBlock(x + 5, y + 2, z + 6, Block.fence.blockID);
		world.setBlockToAir(x + 5, y + 3, z + 0);
		world.setBlockToAir(x + 5, y + 3, z + 1);
		world.setBlockToAir(x + 5, y + 3, z + 2);
		world.setBlock(x + 5, y + 3, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 5, y + 3, z + 4);
		world.setBlockToAir(x + 5, y + 3, z + 5);
		world.setBlock(x + 5, y + 3, z + 6, Block.planks.blockID);
		world.setBlock(x + 5, y + 4, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 5, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 5, y + 5, z + 1);
		world.setBlockToAir(x + 5, y + 5, z + 2);
		world.setBlockToAir(x + 5, y + 5, z + 3);
		world.setBlockToAir(x + 5, y + 5, z + 4);
		world.setBlockToAir(x + 5, y + 5, z + 5);
		world.setBlock(x + 5, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 5, y + 6, z + 0);
		world.setBlockToAir(x + 5, y + 6, z + 1);
		world.setBlockToAir(x + 5, y + 6, z + 2);
		world.setBlockToAir(x + 5, y + 6, z + 3);
		world.setBlockToAir(x + 5, y + 6, z + 4);
		world.setBlockToAir(x + 5, y + 6, z + 5);
		world.setBlockToAir(x + 5, y + 6, z + 6);
		world.setBlock(x + 6, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 1, z + 0, Block.fence.blockID);
		world.setBlockToAir(x + 6, y + 1, z + 1);
		world.setBlockToAir(x + 6, y + 1, z + 2);
		world.setBlock(x + 6, y + 1, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 6, y + 1, z + 4);
		world.setBlock(x + 6, y + 1, z + 5, Block.chest.blockID, 4, 3);
		world.setBlock(x + 6, y + 1, z + 6, Block.planks.blockID);
		world.setBlock(x + 6, y + 2, z + 0, Block.fence.blockID);
		world.setBlockToAir(x + 6, y + 2, z + 1);
		world.setBlockToAir(x + 6, y + 2, z + 2);
		world.setBlock(x + 6, y + 2, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 6, y + 2, z + 4);
		world.setBlockToAir(x + 6, y + 2, z + 5);
		world.setBlock(x + 6, y + 2, z + 6, Block.planks.blockID);
		world.setBlock(x + 6, y + 3, z + 0, Block.fence.blockID);
		world.setBlockToAir(x + 6, y + 3, z + 1);
		world.setBlockToAir(x + 6, y + 3, z + 2);
		world.setBlock(x + 6, y + 3, z + 3, Block.planks.blockID);
		world.setBlockToAir(x + 6, y + 3, z + 4);
		world.setBlockToAir(x + 6, y + 3, z + 5);
		world.setBlock(x + 6, y + 3, z + 6, Block.planks.blockID);
		world.setBlock(x + 6, y + 4, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 6, y + 5, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 6, y + 5, z + 1);
		world.setBlockToAir(x + 6, y + 5, z + 2);
		world.setBlockToAir(x + 6, y + 5, z + 3);
		world.setBlockToAir(x + 6, y + 5, z + 4);
		world.setBlockToAir(x + 6, y + 5, z + 5);
		world.setBlock(x + 6, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 6, y + 6, z + 0);
		world.setBlockToAir(x + 6, y + 6, z + 1);
		world.setBlockToAir(x + 6, y + 6, z + 2);
		world.setBlockToAir(x + 6, y + 6, z + 3);
		world.setBlockToAir(x + 6, y + 6, z + 4);
		world.setBlockToAir(x + 6, y + 6, z + 5);
		world.setBlockToAir(x + 6, y + 6, z + 6);
		world.setBlock(x + 7, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 1, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 7, y + 1, z + 1);
		world.setBlockToAir(x + 7, y + 1, z + 2);
		world.setBlock(x + 7, y + 1, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 1, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 1, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 1, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 7, y + 2, z + 0);
		world.setBlockToAir(x + 7, y + 2, z + 1);
		world.setBlockToAir(x + 7, y + 2, z + 2);
		world.setBlock(x + 7, y + 2, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 2, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 2, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 2, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 7, y + 3, z + 0);
		world.setBlockToAir(x + 7, y + 3, z + 1);
		world.setBlockToAir(x + 7, y + 3, z + 2);
		world.setBlock(x + 7, y + 3, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 3, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 3, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 3, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 7, y + 4, z + 0);
		world.setBlock(x + 7, y + 4, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 7, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 7, y + 5, z + 0);
		world.setBlockToAir(x + 7, y + 5, z + 1);
		world.setBlockToAir(x + 7, y + 5, z + 2);
		world.setBlockToAir(x + 7, y + 5, z + 3);
		world.setBlockToAir(x + 7, y + 5, z + 4);
		world.setBlockToAir(x + 7, y + 5, z + 5);
		world.setBlock(x + 7, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 7, y + 6, z + 0);
		world.setBlockToAir(x + 7, y + 6, z + 1);
		world.setBlockToAir(x + 7, y + 6, z + 2);
		world.setBlockToAir(x + 7, y + 6, z + 3);
		world.setBlockToAir(x + 7, y + 6, z + 4);
		world.setBlockToAir(x + 7, y + 6, z + 5);
		world.setBlockToAir(x + 7, y + 6, z + 6);
		world.setBlock(x + 8, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 1, z + 0, Block.stoneSingleSlab.blockID, 3, 3);
		world.setBlock(x + 8, y + 1, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 1, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 8, y + 2, z + 0);
		world.setBlockToAir(x + 8, y + 2, z + 1);
		world.setBlockToAir(x + 8, y + 2, z + 2);
		world.setBlockToAir(x + 8, y + 2, z + 3);
		world.setBlockToAir(x + 8, y + 2, z + 4);
		world.setBlockToAir(x + 8, y + 2, z + 5);
		world.setBlock(x + 8, y + 2, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 8, y + 3, z + 0);
		world.setBlockToAir(x + 8, y + 3, z + 1);
		world.setBlockToAir(x + 8, y + 3, z + 2);
		world.setBlockToAir(x + 8, y + 3, z + 3);
		world.setBlock(x + 8, y + 3, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 3, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 3, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 8, y + 4, z + 0);
		world.setBlockToAir(x + 8, y + 4, z + 1);
		world.setBlock(x + 8, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 8, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 8, y + 5, z + 0);
		world.setBlockToAir(x + 8, y + 5, z + 1);
		world.setBlockToAir(x + 8, y + 5, z + 2);
		world.setBlockToAir(x + 8, y + 5, z + 3);
		world.setBlockToAir(x + 8, y + 5, z + 4);
		world.setBlockToAir(x + 8, y + 5, z + 5);
		world.setBlock(x + 8, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 8, y + 6, z + 0);
		world.setBlockToAir(x + 8, y + 6, z + 1);
		world.setBlockToAir(x + 8, y + 6, z + 2);
		world.setBlockToAir(x + 8, y + 6, z + 3);
		world.setBlockToAir(x + 8, y + 6, z + 4);
		world.setBlockToAir(x + 8, y + 6, z + 5);
		world.setBlockToAir(x + 8, y + 6, z + 6);
		world.setBlock(x + 9, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 1, z + 0, Block.stoneSingleSlab.blockID, 3, 3);
		world.setBlock(x + 9, y + 1, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 1, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 9, y + 2, z + 0);
		world.setBlockToAir(x + 9, y + 2, z + 1);
		world.setBlockToAir(x + 9, y + 2, z + 2);
		world.setBlockToAir(x + 9, y + 2, z + 3);
		world.setBlockToAir(x + 9, y + 2, z + 4);
		world.setBlockToAir(x + 9, y + 2, z + 5);
		world.setBlock(x + 9, y + 2, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 9, y + 3, z + 0);
		world.setBlockToAir(x + 9, y + 3, z + 1);
		world.setBlockToAir(x + 9, y + 3, z + 2);
		world.setBlockToAir(x + 9, y + 3, z + 3);
		world.setBlock(x + 9, y + 3, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 3, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 3, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 9, y + 4, z + 0);
		world.setBlockToAir(x + 9, y + 4, z + 1);
		world.setBlock(x + 9, y + 4, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 4, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 9, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 9, y + 5, z + 0);
		world.setBlockToAir(x + 9, y + 5, z + 1);
		world.setBlockToAir(x + 9, y + 5, z + 2);
		world.setBlockToAir(x + 9, y + 5, z + 3);
		world.setBlockToAir(x + 9, y + 5, z + 4);
		world.setBlockToAir(x + 9, y + 5, z + 5);
		world.setBlock(x + 9, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 9, y + 6, z + 0);
		world.setBlockToAir(x + 9, y + 6, z + 1);
		world.setBlockToAir(x + 9, y + 6, z + 2);
		world.setBlockToAir(x + 9, y + 6, z + 3);
		world.setBlockToAir(x + 9, y + 6, z + 4);
		world.setBlockToAir(x + 9, y + 6, z + 5);
		world.setBlockToAir(x + 9, y + 6, z + 6);
		world.setBlock(x + 10, y + 0, z + 0, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 1, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 0, z + 6, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 1, z + 0, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 10, y + 1, z + 1, Block.stoneSingleSlab.blockID, 3, 3);
		world.setBlock(x + 10, y + 1, z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 1, z + 3, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 1, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 1, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 1, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 10, y + 2, z + 0);
		world.setBlockToAir(x + 10, y + 2, z + 1);
		world.setBlockToAir(x + 10, y + 2, z + 2);
		world.setBlock(x + 10, y + 2, z + 3, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 10, y + 2, z + 4, Block.fenceIron.blockID);
		world.setBlock(x + 10, y + 2, z + 5, Block.fenceIron.blockID);
		world.setBlock(x + 10, y + 2, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 10, y + 3, z + 0);
		world.setBlockToAir(x + 10, y + 3, z + 1);
		world.setBlockToAir(x + 10, y + 3, z + 2);
		world.setBlockToAir(x + 10, y + 3, z + 3);
		world.setBlock(x + 10, y + 3, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 3, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 3, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 10, y + 4, z + 0);
		world.setBlockToAir(x + 10, y + 4, z + 1);
		world.setBlockToAir(x + 10, y + 4, z + 2);
		world.setBlockToAir(x + 10, y + 4, z + 3);
		world.setBlock(x + 10, y + 4, z + 4, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 4, z + 5, Block.cobblestone.blockID);
		world.setBlock(x + 10, y + 4, z + 6, Block.cobblestone.blockID);
		world.setBlockToAir(x + 10, y + 5, z + 0);
		world.setBlockToAir(x + 10, y + 5, z + 1);
		world.setBlockToAir(x + 10, y + 5, z + 2);
		world.setBlockToAir(x + 10, y + 5, z + 3);
		world.setBlock(x + 10, y + 5, z + 4, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 10, y + 5, z + 5, Block.stoneSingleSlab.blockID);
		world.setBlock(x + 10, y + 5, z + 6, Block.stoneSingleSlab.blockID);
		world.setBlockToAir(x + 10, y + 6, z + 0);
		world.setBlockToAir(x + 10, y + 6, z + 1);
		world.setBlockToAir(x + 10, y + 6, z + 2);
		world.setBlockToAir(x + 10, y + 6, z + 3);
		world.setBlockToAir(x + 10, y + 6, z + 4);
		world.setBlockToAir(x + 10, y + 6, z + 5);
		world.setBlockToAir(x + 10, y + 6, z + 6);
		world.setBlockToAir(x + 11, y + 0, z + 1);
		world.setBlockToAir(x + 11, y + 0, z + 2);
		world.setBlockToAir(x + 11, y + 0, z + 3);
		world.setBlockToAir(x + 11, y + 0, z + 4);
		world.setBlockToAir(x + 11, y + 0, z + 5);
		world.setBlockToAir(x + 11, y + 0, z + 6);
		world.setBlockToAir(x + 11, y + 1, z + 0);
		world.setBlockToAir(x + 11, y + 1, z + 1);
		world.setBlockToAir(x + 11, y + 1, z + 2);
		world.setBlockToAir(x + 11, y + 1, z + 3);
		world.setBlockToAir(x + 11, y + 1, z + 4);
		world.setBlockToAir(x + 11, y + 1, z + 5);
		world.setBlockToAir(x + 11, y + 1, z + 6);
		world.setBlockToAir(x + 11, y + 2, z + 0);
		world.setBlockToAir(x + 11, y + 2, z + 1);
		world.setBlockToAir(x + 11, y + 2, z + 2);
		world.setBlockToAir(x + 11, y + 2, z + 3);
		world.setBlockToAir(x + 11, y + 2, z + 4);
		world.setBlockToAir(x + 11, y + 2, z + 5);
		world.setBlockToAir(x + 11, y + 2, z + 6);
		world.setBlockToAir(x + 11, y + 3, z + 0);
		world.setBlockToAir(x + 11, y + 3, z + 1);
		world.setBlockToAir(x + 11, y + 3, z + 2);
		world.setBlockToAir(x + 11, y + 3, z + 3);
		world.setBlockToAir(x + 11, y + 3, z + 4);
		world.setBlockToAir(x + 11, y + 3, z + 5);
		world.setBlockToAir(x + 11, y + 3, z + 6);
		world.setBlockToAir(x + 11, y + 4, z + 0);
		world.setBlockToAir(x + 11, y + 4, z + 1);
		world.setBlockToAir(x + 11, y + 4, z + 2);
		world.setBlockToAir(x + 11, y + 4, z + 3);
		world.setBlockToAir(x + 11, y + 4, z + 4);
		world.setBlockToAir(x + 11, y + 4, z + 5);
		world.setBlockToAir(x + 11, y + 4, z + 6);
		world.setBlockToAir(x + 11, y + 5, z + 0);
		world.setBlockToAir(x + 11, y + 5, z + 1);
		world.setBlockToAir(x + 11, y + 5, z + 2);
		world.setBlockToAir(x + 11, y + 5, z + 3);
		world.setBlockToAir(x + 11, y + 5, z + 4);
		world.setBlockToAir(x + 11, y + 5, z + 5);
		world.setBlockToAir(x + 11, y + 5, z + 6);
		world.setBlockToAir(x + 11, y + 6, z + 0);
		world.setBlockToAir(x + 11, y + 6, z + 1);
		world.setBlockToAir(x + 11, y + 6, z + 2);
		world.setBlockToAir(x + 11, y + 6, z + 3);
		world.setBlockToAir(x + 11, y + 6, z + 4);
		world.setBlockToAir(x + 11, y + 6, z + 5);
		world.setBlockToAir(x + 11, y + 6, z + 6);
		world.setBlock(x + 6, y + 0, z + 4, Block.waterStill.blockID);
		world.setBlock(x + 8, y + 0, z + 2, Block.lavaStill.blockID, 14, 3);
		world.setBlock(x + 8, y + 1, z + 2, Block.lavaStill.blockID, 6, 3);
		world.setBlock(x + 8, y + 1, z + 3, Block.lavaStill.blockID, 4, 3);
		world.setBlock(x + 8, y + 1, z + 4, Block.lavaStill.blockID, 2, 3);
		world.setBlock(x + 8, y + 1, z + 5, Block.lavaStill.blockID);
		world.setBlock(x + 9, y + 1, z + 2, Block.lavaStill.blockID, 6, 3);
		world.setBlock(x + 9, y + 1, z + 3, Block.lavaStill.blockID, 4, 3);
		world.setBlock(x + 9, y + 1, z + 4, Block.lavaStill.blockID, 2, 3);
		world.setBlock(x + 9, y + 1, z + 5, Block.lavaStill.blockID);
		world.setBlock(x + 4, y + 1, z + 3, Block.tripWireSource.blockID, 5, 3);
		world.setBlock(x + 1, y + 1, z + 3, Block.tripWireSource.blockID, 7, 3);

		return true;
	}
}