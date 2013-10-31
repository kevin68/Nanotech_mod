package fr.mcnanotech.kevin_68.nanotech_mod.main.world;

import java.util.Random;

import fr.mcnanotech.kevin_68.nanotech_mod.main.blocks.NanotechBlock;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldModel5 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks()
	{
		return new int[] {Block.stone.blockID, Block.dirt.blockID, NanotechBlock.nanoGrass.blockID, Block.snow.blockID};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int k)
	{
		int distanceToAir = 0;
		int checkID = world.getBlockId(x, y, k);

		while(checkID != 0)
		{
			distanceToAir++;
			checkID = world.getBlockId(x, y + distanceToAir, k);
		}

		if(distanceToAir > 3)
		{
			return false;
		}
		y += distanceToAir - 1;

		int blockID = world.getBlockId(x, y, k);
		int blockIDAbove = world.getBlockId(x, y + 1, k);
		int blockIDBelow = world.getBlockId(x, y - 1, k);
		for(int valideSpawn : GetValidSpawnBlocks())
		{
			if(blockIDAbove != 0)
			{
				return false;
			}
			if(blockID == valideSpawn)
			{
				return true;
			}
			else if(blockID == Block.snow.blockID && blockIDBelow == valideSpawn)
			{
				return true;
			}
		}
		return false;
	}

	public WorldModel5()
	{}

	public boolean generate(World world, Random rand, int x, int y, int k)
	{
		if(!LocationIsValidSpawn(world, x, y, k) || !LocationIsValidSpawn(world, x + 6, y, k) || !LocationIsValidSpawn(world, x + 6, y, k + 6) || !LocationIsValidSpawn(world, x, y, k + 6))
		{
			return false;
		}

		world.setBlock(x, y - 4, k, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x, y - 3, k, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 3, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x, y - 2, k, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 2, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 3, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 4, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x, y - 1, k, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 1, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 2, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 3, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 4, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 5, Block.dirt.blockID);
		world.setBlock(x, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 1, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 2, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 3, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 4, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 5, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x, y  + 1, k, 0);
		world.setBlock(x, y  + 1, k + 1, 0);
		world.setBlock(x, y  + 1, k + 2, 0);
		world.setBlock(x, y  + 1, k + 3, 0);
		world.setBlock(x, y  + 1, k + 4, 0);
		world.setBlock(x, y  + 1, k + 5, 0);
		world.setBlock(x, y  + 1, k + 6, 0);
		world.setBlock(x, y  + 2, k, 0);
		world.setBlock(x, y  + 2, k + 1, 0);
		world.setBlock(x, y  + 2, k + 2, 0);
		world.setBlock(x, y  + 2, k + 3, 0);
		world.setBlock(x, y  + 2, k + 4, 0);
		world.setBlock(x, y  + 2, k + 5, 0);
		world.setBlock(x, y  + 2, k + 6, 0);
		world.setBlock(x, y  + 3, k, 0);
		world.setBlock(x, y  + 3, k + 1, 0);
		world.setBlock(x, y  + 3, k + 2, 0);
		world.setBlock(x, y  + 3, k + 3, 0);
		world.setBlock(x, y  + 3, k + 4, 0);
		world.setBlock(x, y  + 3, k + 5, 0);
		world.setBlock(x, y  + 3, k + 6, 0);
		world.setBlock(x, y  + 4, k, 0);
		world.setBlock(x, y  + 4, k + 1, 0);
		world.setBlock(x, y  + 4, k + 2, 0);
		world.setBlock(x, y  + 4, k + 3, 0);
		world.setBlock(x, y  + 4, k + 4, 0);
		world.setBlock(x, y  + 4, k + 5, 0);
		world.setBlock(x, y  + 4, k + 6, 0);
		world.setBlock(x, y  + 5, k, 0);
		world.setBlock(x, y  + 5, k + 1, 0);
		world.setBlock(x, y  + 5, k + 2, 0);
		world.setBlock(x, y  + 5, k + 3, 0);
		world.setBlock(x, y  + 5, k + 4, 0);
		world.setBlock(x, y  + 5, k + 5, 0);
		world.setBlock(x, y  + 5, k + 6, 0);
		world.setBlock(x, y  + 6, k, 0);
		world.setBlock(x, y  + 6, k + 1, 0);
		world.setBlock(x, y  + 6, k + 2, 0);
		world.setBlock(x, y  + 6, k + 3, 0);
		world.setBlock(x, y  + 6, k + 4, 0);
		world.setBlock(x, y  + 6, k + 5, 0);
		world.setBlock(x, y  + 6, k + 6, 0);
		world.setBlock(x, y  + 7, k, 0);
		world.setBlock(x, y  + 7, k + 1, 0);
		world.setBlock(x, y  + 7, k + 2, 0);
		world.setBlock(x, y  + 7, k + 3, 0);
		world.setBlock(x, y  + 7, k + 4, 0);
		world.setBlock(x, y  + 7, k + 5, 0);
		world.setBlock(x, y  + 7, k + 6, 0);
		world.setBlock(x, y  + 8, k, 0);
		world.setBlock(x, y  + 8, k + 1, 0);
		world.setBlock(x, y  + 8, k + 2, 0);
		world.setBlock(x, y  + 8, k + 3, 0);
		world.setBlock(x, y  + 8, k + 4, 0);
		world.setBlock(x, y  + 8, k + 5, 0);
		world.setBlock(x, y  + 8, k + 6, 0);
		world.setBlock(x + 1, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 1, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 3, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 1, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 1, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 2, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 3, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 4, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 1, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 1, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 1, y - 1, k + 1, Block.dirt.blockID);
		world.setBlock(x + 1, y - 1, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 4, 0);
		world.setBlock(x + 1, y - 1, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 4, 0);
		world.setBlock(x + 1, y - 1, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 4, 0);
		world.setBlock(x + 1, y - 1, k + 5, Block.dirt.blockID);
		world.setBlock(x + 1, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 1, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 1, y , k + 1, NanotechBlock.nukeBuildingBlock.blockID, 8, 0);
		world.setBlock(x + 1, y , k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y , k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y , k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y , k + 5, NanotechBlock.nukeBuildingBlock.blockID, 7, 0);
		world.setBlock(x + 1, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 1, y  + 1, k, 0);
		world.setBlock(x + 1, y  + 1, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 8, 0);
		world.setBlock(x + 1, y  + 1, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 1, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 1, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 1, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 7, 0);
		world.setBlock(x + 1, y  + 1, k + 6, 0);
		world.setBlock(x + 1, y  + 2, k, 0);
		world.setBlock(x + 1, y  + 2, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 8, 0);
		world.setBlock(x + 1, y  + 2, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 2, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 2, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 2, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 7, 0);
		world.setBlock(x + 1, y  + 2, k + 6, 0);
		world.setBlock(x + 1, y  + 3, k, 0);
		world.setBlock(x + 1, y  + 3, k + 1, 0);
		world.setBlock(x + 1, y  + 3, k + 2, NanotechBlock.nukeBuildingStairs.blockID);
		world.setBlock(x + 1, y  + 3, k + 3, NanotechBlock.nukeBuildingStairs.blockID);
		world.setBlock(x + 1, y  + 3, k + 4, NanotechBlock.nukeBuildingStairs.blockID);
		world.setBlock(x + 1, y  + 3, k + 5, 0);
		world.setBlock(x + 1, y  + 3, k + 6, 0);
		world.setBlock(x + 1, y  + 4, k, 0);
		world.setBlock(x + 1, y  + 4, k + 1, 0);
		world.setBlock(x + 1, y  + 4, k + 2, 0);
		world.setBlock(x + 1, y  + 4, k + 3, NanotechBlock.nukeBuildingBlock.blockID, 3, 0);
		world.setBlock(x + 1, y  + 4, k + 4, 0);
		world.setBlock(x + 1, y  + 4, k + 5, 0);
		world.setBlock(x + 1, y  + 4, k + 6, 0);
		world.setBlock(x + 1, y  + 5, k, 0);
		world.setBlock(x + 1, y  + 5, k + 1, 0);
		world.setBlock(x + 1, y  + 5, k + 2, 0);
		world.setBlock(x + 1, y  + 5, k + 3, 0);
		world.setBlock(x + 1, y  + 5, k + 4, 0);
		world.setBlock(x + 1, y  + 5, k + 5, 0);
		world.setBlock(x + 1, y  + 5, k + 6, 0);
		world.setBlock(x + 1, y  + 6, k, 0);
		world.setBlock(x + 1, y  + 6, k + 1, 0);
		world.setBlock(x + 1, y  + 6, k + 2, 0);
		world.setBlock(x + 1, y  + 6, k + 3, 0);
		world.setBlock(x + 1, y  + 6, k + 4, 0);
		world.setBlock(x + 1, y  + 6, k + 5, 0);
		world.setBlock(x + 1, y  + 6, k + 6, 0);
		world.setBlock(x + 1, y  + 7, k, 0);
		world.setBlock(x + 1, y  + 7, k + 1, 0);
		world.setBlock(x + 1, y  + 7, k + 2, 0);
		world.setBlock(x + 1, y  + 7, k + 3, 0);
		world.setBlock(x + 1, y  + 7, k + 4, 0);
		world.setBlock(x + 1, y  + 7, k + 5, 0);
		world.setBlock(x + 1, y  + 7, k + 6, 0);
		world.setBlock(x + 1, y  + 8, k, 0);
		world.setBlock(x + 1, y  + 8, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 8, 0);
		world.setBlock(x + 1, y  + 8, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 8, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 8, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 1, y  + 8, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 7, 0);
		world.setBlock(x + 1, y  + 8, k + 6, 0);
		world.setBlock(x + 2, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 2, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 4, 0);
		world.setBlock(x + 2, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 2, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 2, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 2, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 2, y - 2, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 2, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 2, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 2, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 2, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 2, y - 1, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 6, 0);
		world.setBlock(x + 2, y - 1, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 1, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 1, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y - 1, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 7, 0);
		world.setBlock(x + 2, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 2, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 2, y , k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y , k + 2, Block.tnt.blockID);
		world.setBlock(x + 2, y , k + 3, Block.tnt.blockID);
		world.setBlock(x + 2, y , k + 4, Block.tnt.blockID);
		world.setBlock(x + 2, y , k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 2, y  + 1, k, 0);
		world.setBlock(x + 2, y  + 1, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 1, k + 2, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 1, k + 3, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 1, k + 4, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 1, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 1, k + 6, 0);
		world.setBlock(x + 2, y  + 2, k, 0);
		world.setBlock(x + 2, y  + 2, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 2, k + 2, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 2, k + 3, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 2, k + 4, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 2, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 2, k + 6, 0);
		world.setBlock(x + 2, y  + 3, k, 0);
		world.setBlock(x + 2, y  + 3, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 2, 0);
		world.setBlock(x + 2, y  + 3, k + 2, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 3, k + 3, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 3, k + 4, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 3, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 3, 0);
		world.setBlock(x + 2, y  + 3, k + 6, 0);
		world.setBlock(x + 2, y  + 4, k, 0);
		world.setBlock(x + 2, y  + 4, k + 1, 0);
		world.setBlock(x + 2, y  + 4, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 4, k + 3, Block.tnt.blockID);
		world.setBlock(x + 2, y  + 4, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 4, k + 5, 0);
		world.setBlock(x + 2, y  + 4, k + 6, 0);
		world.setBlock(x + 2, y  + 5, k, 0);
		world.setBlock(x + 2, y  + 5, k + 1, 0);
		world.setBlock(x + 2, y  + 5, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 5, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 5, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 5, k + 5, 0);
		world.setBlock(x + 2, y  + 5, k + 6, 0);
		world.setBlock(x + 2, y  + 6, k, 0);
		world.setBlock(x + 2, y  + 6, k + 1, 0);
		world.setBlock(x + 2, y  + 6, k + 2, 0);
		world.setBlock(x + 2, y  + 6, k + 3, NanotechBlock.nukeBuildingStairs.blockID);
		world.setBlock(x + 2, y  + 6, k + 4, 0);
		world.setBlock(x + 2, y  + 6, k + 5, 0);
		world.setBlock(x + 2, y  + 6, k + 6, 0);
		world.setBlock(x + 2, y  + 7, k, 0);
		world.setBlock(x + 2, y  + 7, k + 1, 0);
		world.setBlock(x + 2, y  + 7, k + 2, 0);
		world.setBlock(x + 2, y  + 7, k + 3, 0);
		world.setBlock(x + 2, y  + 7, k + 4, 0);
		world.setBlock(x + 2, y  + 7, k + 5, 0);
		world.setBlock(x + 2, y  + 7, k + 6, 0);
		world.setBlock(x + 2, y  + 8, k, 0);
		world.setBlock(x + 2, y  + 8, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 8, k + 2, NanotechBlock.nukeBuildingBlock.blockID, 5, 0);
		world.setBlock(x + 2, y  + 8, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 1, 0);
		world.setBlock(x + 2, y  + 8, k + 4, NanotechBlock.nukeBuildingBlock.blockID, 6, 0);
		world.setBlock(x + 2, y  + 8, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 2, y  + 8, k + 6, 0);
		world.setBlock(x + 3, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 3, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 3, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 3, y - 4, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 3, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 3, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 3, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 3, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 3, y - 3, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 6, 0);
		world.setBlock(x + 3, y - 3, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 3, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 7, 0);
		world.setBlock(x + 3, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 3, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 3, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 3, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 3, y - 2, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 2, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 3, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 3, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 3, y - 1, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 6, 0);
		world.setBlock(x + 3, y - 1, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 1, k + 3, Block.oreDiamond.blockID);
		world.setBlock(x + 3, y - 1, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y - 1, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 7, 0);
		world.setBlock(x + 3, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 3, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 3, y , k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y , k + 2, Block.tnt.blockID);
		world.setBlock(x + 3, y , k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y , k + 4, Block.tnt.blockID);
		world.setBlock(x + 3, y , k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 3, y  + 1, k, 0);
		world.setBlock(x + 3, y  + 1, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 1, k + 2, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 1, k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 1, k + 4, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 1, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 1, k + 6, 0);
		world.setBlock(x + 3, y  + 2, k, 0);
		world.setBlock(x + 3, y  + 2, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 2, k + 2, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 2, k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 2, k + 4, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 2, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 2, k + 6, 0);
		world.setBlock(x + 3, y  + 3, k, 0);
		world.setBlock(x + 3, y  + 3, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 2, 0);
		world.setBlock(x + 3, y  + 3, k + 2, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 3, k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 3, k + 4, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 3, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 3, 0);
		world.setBlock(x + 3, y  + 3, k + 6, 0);
		world.setBlock(x + 3, y  + 4, k, 0);
		world.setBlock(x + 3, y  + 4, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 4, 0);
		world.setBlock(x + 3, y  + 4, k + 2, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 4, k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 4, k + 4, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 4, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 2, 0);
		world.setBlock(x + 3, y  + 4, k + 6, 0);
		world.setBlock(x + 3, y  + 5, k, 0);
		world.setBlock(x + 3, y  + 5, k + 1, 0);
		world.setBlock(x + 3, y  + 5, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 5, k + 3, Block.tnt.blockID);
		world.setBlock(x + 3, y  + 5, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 5, k + 5, 0);
		world.setBlock(x + 3, y  + 5, k + 6, 0);
		world.setBlock(x + 3, y  + 6, k, 0);
		world.setBlock(x + 3, y  + 6, k + 1, 0);
		world.setBlock(x + 3, y  + 6, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 2, 0);
		world.setBlock(x + 3, y  + 6, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 6, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 3, 0);
		world.setBlock(x + 3, y  + 6, k + 5, 0);
		world.setBlock(x + 3, y  + 6, k + 6, 0);
		world.setBlock(x + 3, y  + 7, k, 0);
		world.setBlock(x + 3, y  + 7, k + 1, 0);
		world.setBlock(x + 3, y  + 7, k + 2, 0);
		world.setBlock(x + 3, y  + 7, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 7, k + 4, 0);
		world.setBlock(x + 3, y  + 7, k + 5, 0);
		world.setBlock(x + 3, y  + 7, k + 6, 0);
		world.setBlock(x + 3, y  + 8, k, 0);
		world.setBlock(x + 3, y  + 8, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 8, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 3, 0);
		world.setBlock(x + 3, y  + 8, k + 3, 0);
		world.setBlock(x + 3, y  + 8, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 2, 0);
		world.setBlock(x + 3, y  + 8, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 3, y  + 8, k + 6, 0);
		world.setBlock(x + 4, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 4, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 5, 0);
		world.setBlock(x + 4, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 4, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 4, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 4, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 4, y - 2, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 2, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 2, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 4, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 4, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 4, y - 1, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 6, 0);
		world.setBlock(x + 4, y - 1, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 1, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 1, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y - 1, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 7, 0);
		world.setBlock(x + 4, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 4, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 4, y , k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y , k + 2, Block.tnt.blockID);
		world.setBlock(x + 4, y , k + 3, Block.tnt.blockID);
		world.setBlock(x + 4, y , k + 4, Block.tnt.blockID);
		world.setBlock(x + 4, y , k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 4, y  + 1, k, 0);
		world.setBlock(x + 4, y  + 1, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 1, k + 2, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 1, k + 3, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 1, k + 4, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 1, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 1, k + 6, 0);
		world.setBlock(x + 4, y  + 2, k, 0);
		world.setBlock(x + 4, y  + 2, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 2, k + 2, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 2, k + 3, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 2, k + 4, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 2, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 2, k + 6, 0);
		world.setBlock(x + 4, y  + 3, k, 0);
		world.setBlock(x + 4, y  + 3, k + 1, NanotechBlock.nukeBuildingStairs.blockID, 2, 0);
		world.setBlock(x + 4, y  + 3, k + 2, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 3, k + 3, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 3, k + 4, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 3, k + 5, NanotechBlock.nukeBuildingStairs.blockID, 3, 0);
		world.setBlock(x + 4, y  + 3, k + 6, 0);
		world.setBlock(x + 4, y  + 4, k, 0);
		world.setBlock(x + 4, y  + 4, k + 1, 0);
		world.setBlock(x + 4, y  + 4, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 4, k + 3, Block.tnt.blockID);
		world.setBlock(x + 4, y  + 4, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 4, k + 5, 0);
		world.setBlock(x + 4, y  + 4, k + 6, 0);
		world.setBlock(x + 4, y  + 5, k, 0);
		world.setBlock(x + 4, y  + 5, k + 1, 0);
		world.setBlock(x + 4, y  + 5, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 5, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 5, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 5, k + 5, 0);
		world.setBlock(x + 4, y  + 5, k + 6, 0);
		world.setBlock(x + 4, y  + 6, k, 0);
		world.setBlock(x + 4, y  + 6, k + 1, 0);
		world.setBlock(x + 4, y  + 6, k + 2, 0);
		world.setBlock(x + 4, y  + 6, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 1, 0);
		world.setBlock(x + 4, y  + 6, k + 4, 0);
		world.setBlock(x + 4, y  + 6, k + 5, 0);
		world.setBlock(x + 4, y  + 6, k + 6, 0);
		world.setBlock(x + 4, y  + 7, k, 0);
		world.setBlock(x + 4, y  + 7, k + 1, 0);
		world.setBlock(x + 4, y  + 7, k + 2, 0);
		world.setBlock(x + 4, y  + 7, k + 3, 0);
		world.setBlock(x + 4, y  + 7, k + 4, 0);
		world.setBlock(x + 4, y  + 7, k + 5, 0);
		world.setBlock(x + 4, y  + 7, k + 6, 0);
		world.setBlock(x + 4, y  + 8, k, 0);
		world.setBlock(x + 4, y  + 8, k + 1, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 8, k + 2, NanotechBlock.nukeBuildingBlock.blockID, 7, 0);
		world.setBlock(x + 4, y  + 8, k + 3, NanotechBlock.nukeBuildingStairs.blockID);
		world.setBlock(x + 4, y  + 8, k + 4, NanotechBlock.nukeBuildingBlock.blockID, 8, 0);
		world.setBlock(x + 4, y  + 8, k + 5, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 4, y  + 8, k + 6, 0);
		world.setBlock(x + 5, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 5, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 3, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 5, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 5, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 2, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 3, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 4, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 5, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 5, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 5, y - 1, k + 1, Block.dirt.blockID);
		world.setBlock(x + 5, y - 1, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 5, 0);
		world.setBlock(x + 5, y - 1, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 5, 0);
		world.setBlock(x + 5, y - 1, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 5, 0);
		world.setBlock(x + 5, y - 1, k + 5, Block.dirt.blockID);
		world.setBlock(x + 5, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 5, y , k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 5, y , k + 1, NanotechBlock.nukeBuildingBlock.blockID, 6, 0);
		world.setBlock(x + 5, y , k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y , k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y , k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y , k + 5, NanotechBlock.nukeBuildingBlock.blockID, 5, 0);
		world.setBlock(x + 5, y , k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 5, y  + 1, k, 0);
		world.setBlock(x + 5, y  + 1, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 6, 0);
		world.setBlock(x + 5, y  + 1, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 1, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 1, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 1, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 5, 0);
		world.setBlock(x + 5, y  + 1, k + 6, 0);
		world.setBlock(x + 5, y  + 2, k, 0);
		world.setBlock(x + 5, y  + 2, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 6, 0);
		world.setBlock(x + 5, y  + 2, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 2, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 2, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 2, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 5, 0);
		world.setBlock(x + 5, y  + 2, k + 6, 0);
		world.setBlock(x + 5, y  + 3, k, 0);
		world.setBlock(x + 5, y  + 3, k + 1, 0);
		world.setBlock(x + 5, y  + 3, k + 2, NanotechBlock.nukeBuildingStairs.blockID, 1, 0);
		world.setBlock(x + 5, y  + 3, k + 3, NanotechBlock.nukeBuildingStairs.blockID, 1, 0);
		world.setBlock(x + 5, y  + 3, k + 4, NanotechBlock.nukeBuildingStairs.blockID, 1, 0);
		world.setBlock(x + 5, y  + 3, k + 5, 0);
		world.setBlock(x + 5, y  + 3, k + 6, 0);
		world.setBlock(x + 5, y  + 4, k, 0);
		world.setBlock(x + 5, y  + 4, k + 1, 0);
		world.setBlock(x + 5, y  + 4, k + 2, 0);
		world.setBlock(x + 5, y  + 4, k + 3, NanotechBlock.nukeBuildingBlock.blockID, 1, 0);
		world.setBlock(x + 5, y  + 4, k + 4, 0);
		world.setBlock(x + 5, y  + 4, k + 5, 0);
		world.setBlock(x + 5, y  + 4, k + 6, 0);
		world.setBlock(x + 5, y  + 5, k, 0);
		world.setBlock(x + 5, y  + 5, k + 1, 0);
		world.setBlock(x + 5, y  + 5, k + 2, 0);
		world.setBlock(x + 5, y  + 5, k + 3, 0);
		world.setBlock(x + 5, y  + 5, k + 4, 0);
		world.setBlock(x + 5, y  + 5, k + 5, 0);
		world.setBlock(x + 5, y  + 5, k + 6, 0);
		world.setBlock(x + 5, y  + 6, k, 0);
		world.setBlock(x + 5, y  + 6, k + 1, 0);
		world.setBlock(x + 5, y  + 6, k + 2, 0);
		world.setBlock(x + 5, y  + 6, k + 3, 0);
		world.setBlock(x + 5, y  + 6, k + 4, 0);
		world.setBlock(x + 5, y  + 6, k + 5, 0);
		world.setBlock(x + 5, y  + 6, k + 6, 0);
		world.setBlock(x + 5, y  + 7, k, 0);
		world.setBlock(x + 5, y  + 7, k + 1, 0);
		world.setBlock(x + 5, y  + 7, k + 2, 0);
		world.setBlock(x + 5, y  + 7, k + 3, 0);
		world.setBlock(x + 5, y  + 7, k + 4, 0);
		world.setBlock(x + 5, y  + 7, k + 5, 0);
		world.setBlock(x + 5, y  + 7, k + 6, 0);
		world.setBlock(x + 5, y  + 8, k, 0);
		world.setBlock(x + 5, y  + 8, k + 1, NanotechBlock.nukeBuildingBlock.blockID, 6, 0);
		world.setBlock(x + 5, y  + 8, k + 2, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 8, k + 3, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 8, k + 4, NanotechBlock.nukeBuildingBlock.blockID);
		world.setBlock(x + 5, y  + 8, k + 5, NanotechBlock.nukeBuildingBlock.blockID, 5, 0);
		world.setBlock(x + 5, y  + 8, k + 6, 0);
		world.setBlock(x + 6, y - 4, k, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 1, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 2, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 3, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 4, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 5, Block.stone.blockID);
		world.setBlock(x + 6, y - 4, k + 6, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 1, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 2, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 3, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 4, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 5, Block.stone.blockID);
		world.setBlock(x + 6, y - 3, k + 6, Block.stone.blockID);
		world.setBlock(x + 6, y - 2, k, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 1, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 2, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 3, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 4, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 5, Block.dirt.blockID);
		world.setBlock(x + 6, y - 2, k + 6, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 1, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 2, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 3, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 4, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 5, Block.dirt.blockID);
		world.setBlock(x + 6, y - 1, k + 6, Block.dirt.blockID);
		world.setBlock(x + 6, y, k, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 1, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 2, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 3, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 4, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 5, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y, k + 6, NanotechBlock.nanoGrass.blockID);
		world.setBlock(x + 6, y  + 1, k, 0);
		world.setBlock(x + 6, y  + 1, k + 1, 0);
		world.setBlock(x + 6, y  + 1, k + 2, 0);
		world.setBlock(x + 6, y  + 1, k + 3, 0);
		world.setBlock(x + 6, y  + 1, k + 4, 0);
		world.setBlock(x + 6, y  + 1, k + 5, 0);
		world.setBlock(x + 6, y  + 1, k + 6, 0);
		world.setBlock(x + 6, y  + 2, k, 0);
		world.setBlock(x + 6, y  + 2, k + 1, 0);
		world.setBlock(x + 6, y  + 2, k + 2, 0);
		world.setBlock(x + 6, y  + 2, k + 3, 0);
		world.setBlock(x + 6, y  + 2, k + 4, 0);
		world.setBlock(x + 6, y  + 2, k + 5, 0);
		world.setBlock(x + 6, y  + 2, k + 6, 0);
		world.setBlock(x + 6, y  + 3, k, 0);
		world.setBlock(x + 6, y  + 3, k + 1, 0);
		world.setBlock(x + 6, y  + 3, k + 2, 0);
		world.setBlock(x + 6, y  + 3, k + 3, 0);
		world.setBlock(x + 6, y  + 3, k + 4, 0);
		world.setBlock(x + 6, y  + 3, k + 5, 0);
		world.setBlock(x + 6, y  + 3, k + 6, 0);
		world.setBlock(x + 6, y  + 4, k, 0);
		world.setBlock(x + 6, y  + 4, k + 1, 0);
		world.setBlock(x + 6, y  + 4, k + 2, 0);
		world.setBlock(x + 6, y  + 4, k + 3, 0);
		world.setBlock(x + 6, y  + 4, k + 4, 0);
		world.setBlock(x + 6, y  + 4, k + 5, 0);
		world.setBlock(x + 6, y  + 4, k + 6, 0);
		world.setBlock(x + 6, y  + 5, k, 0);
		world.setBlock(x + 6, y  + 5, k + 1, 0);
		world.setBlock(x + 6, y  + 5, k + 2, 0);
		world.setBlock(x + 6, y  + 5, k + 3, 0);
		world.setBlock(x + 6, y  + 5, k + 4, 0);
		world.setBlock(x + 6, y  + 5, k + 5, 0);
		world.setBlock(x + 6, y  + 5, k + 6, 0);
		world.setBlock(x + 6, y  + 6, k, 0);
		world.setBlock(x + 6, y  + 6, k + 1, 0);
		world.setBlock(x + 6, y  + 6, k + 2, 0);
		world.setBlock(x + 6, y  + 6, k + 3, 0);
		world.setBlock(x + 6, y  + 6, k + 4, 0);
		world.setBlock(x + 6, y  + 6, k + 5, 0);
		world.setBlock(x + 6, y  + 6, k + 6, 0);
		world.setBlock(x + 6, y  + 7, k, 0);
		world.setBlock(x + 6, y  + 7, k + 1, 0);
		world.setBlock(x + 6, y  + 7, k + 2, 0);
		world.setBlock(x + 6, y  + 7, k + 3, 0);
		world.setBlock(x + 6, y  + 7, k + 4, 0);
		world.setBlock(x + 6, y  + 7, k + 5, 0);
		world.setBlock(x + 6, y  + 7, k + 6, 0);
		world.setBlock(x + 6, y  + 8, k, 0);
		world.setBlock(x + 6, y  + 8, k + 1, 0);
		world.setBlock(x + 6, y  + 8, k + 2, 0);
		world.setBlock(x + 6, y  + 8, k + 3, 0);
		world.setBlock(x + 6, y  + 8, k + 4, 0);
		world.setBlock(x + 6, y  + 8, k + 5, 0);
		world.setBlock(x + 6, y  + 8, k + 6, 0);
		world.setBlock(x + 3, y - 2, k + 3, NanotechBlock.nuke.blockID);
		return true;
	}
}