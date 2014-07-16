package fr.mcnanotech.kevin_68.nanotechmod.core.tileentity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcnanotech.kevin_68.nanotechmod.core.NanotechMod;
import fr.mcnanotech.kevin_68.nanotechmod.core.utils.SpotLightEntry;

public class TileEntitySpotLight extends TileEntity
{

	@SideOnly(Side.CLIENT)
	private long worldTimeClient;
	@SideOnly(Side.CLIENT)
	private float activeBooleanFloat;
	public boolean isActive;

	public byte red, green, blue, secRed, secGreen, secBlue, angle2, rotationSpeed, displayAxe, mainLaserSize, secLaserSize, createKeyTime, lastKeySelected;
	public String textureName, secTextureName;
	public boolean autoRotate, reverseRotation, secondaryLaser, sideLaser, timeLineEnabled, smoothMode;
	public int time, lastTimeUse, angle1;

	public byte[] redKey = new byte[1200];
	public byte[] greenKey = new byte[1200];
	public byte[] blueKey = new byte[1200];
	public byte[] secRedKey = new byte[1200];
	public byte[] secGreenKey = new byte[1200];
	public byte[] secBlueKey = new byte[1200];
	public int[] angle1Key = new int[1200];
	public byte[] angle2Key = new byte[1200];
	public byte[] mainSizeKey = new byte[1200];
	public byte[] secSizeKey = new byte[1200];

	private SpotLightEntry[] keyList = new SpotLightEntry[120];

	public void updateEntity()
	{
		if(this.worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord))
		{
			this.isActive = true;

			if(isTimeLineEnabled())
			{
				ArrayList<Integer> keys = new ArrayList();

				for(int i = 0; i < keyList.length; i++)
				{
					SpotLightEntry entry = keyList[i];
					if(entry != null && entry.isActive())
					{
						keys.add(i * 10);
					}
				}
				
				if(keys.isEmpty())
				{
					setBoolean((byte)22, false);
				}

				if(getTime() == 1199)
				{
					set(23, 0);
				}
				else
				{
					set(23, getTime() + 1);
				}

				if(!this.worldObj.isRemote)
				{
					if(this.isSmoothMode())
					{
						this.setByte((byte)0, (redKey[getTime()]));
						this.setByte((byte)1, (greenKey[getTime()]));
						this.setByte((byte)2, (blueKey[getTime()]));
						this.setByte((byte)3, (secRedKey[getTime()]));
						this.setByte((byte)4, (secGreenKey[getTime()]));
						this.setByte((byte)5, (secBlueKey[getTime()]));
						this.set(8, (angle1Key[getTime()] & 0xFF));
						this.setByte((byte)9, (angle2Key[getTime()]));
						this.setByte((byte)16, (mainSizeKey[getTime()]));
						this.setByte((byte)17, (secSizeKey[getTime()]));

						int curTime = this.getTime() / 10;
						if(this.getKey(curTime) != null && lastTimeUse != time)
						{
							lastTimeUse = time;
							this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
							this.setBoolean((byte)10, this.getKey(curTime).isKeyAutRot());
							this.setBoolean((byte)11, this.getKey(curTime).isKeyRevRot());
							this.setByte((byte)12, this.getKey(curTime).getKeyRotSpe());
							this.setBoolean((byte)13, this.getKey(curTime).isKeySecLas());
							this.setByte((byte)14, this.getKey(curTime).getKeyDisplayAxe());
							this.setBoolean((byte)15, this.getKey(curTime).isSideLaser());
						}
					}
					else
					{
						int curTime = this.getTime() / 10;
						if(this.getKey(curTime) != null && lastTimeUse != time)
						{
							lastTimeUse = time;
							this.setByte((byte)0, this.getKey(curTime).getKeyRed());
							this.setByte((byte)1, this.getKey(curTime).getKeyGreen());
							this.setByte((byte)2, this.getKey(curTime).getKeyBlue());
							this.setByte((byte)3, this.getKey(curTime).getKeySecRed());
							this.setByte((byte)4, this.getKey(curTime).getKeySecGreen());
							this.setByte((byte)5, this.getKey(curTime).getKeySecBlue());
							this.set(8, this.getKey(curTime).getKeyAngle1());
							this.setByte((byte)9, this.getKey(curTime).getKeyAngle2());
							this.setBoolean((byte)10, this.getKey(curTime).isKeyAutRot());
							this.setBoolean((byte)11, this.getKey(curTime).isKeyRevRot());
							this.setByte((byte)12, this.getKey(curTime).getKeyRotSpe());
							this.setBoolean((byte)13, this.getKey(curTime).isKeySecLas());
							this.setByte((byte)14, this.getKey(curTime).getKeyDisplayAxe());
							this.setBoolean((byte)15, this.getKey(curTime).isSideLaser());
							this.setByte((byte)16, this.getKey(curTime).getKeyMainLaserSize());
							this.setByte((byte)17, this.getKey(curTime).getKeySecLaserSize());
							this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
						}
					}
				}
			}
		}
		else
		{
			this.isActive = false;
		}
	}

	public void keysProcess()
	{
		ArrayList<Integer> keys = new ArrayList();
		ArrayList<Integer> timeBetwinKeys = new ArrayList();

		for(int i = 0; i < keyList.length; i++)
		{
			SpotLightEntry entry = keyList[i];
			if(entry != null && entry.isActive())
			{
				keys.add(i * 10);
			}
		}

		if(!keys.isEmpty() && keys.size() > 1)
		{
			for(int j = 0; j < keys.size() - 1; j++)
			{
				timeBetwinKeys.add(keys.get(j + 1) - keys.get(j));
			}
			timeBetwinKeys.add((1200 - keys.get(keys.size() - 1) + keys.get(0)));

			for(int k = 0; k < (keys.size() - 1); k++)
			{
				int startRed = keyList[keys.get(k) / 10].getKeyRed() & 0xFF;
				int endRed = keyList[keys.get(k + 1) / 10].getKeyRed() & 0xFF;
				int deltaRed = endRed - startRed;
				float tickRed = (float)deltaRed / (float)timeBetwinKeys.get(k);

				int startGreen = keyList[keys.get(k) / 10].getKeyGreen() & 0xFF;
				int endGreen = keyList[keys.get(k + 1) / 10].getKeyGreen() & 0xFF;
				int deltaGreen = endGreen - startGreen;
				float tickGreen = (float)deltaGreen / (float)timeBetwinKeys.get(k);

				int startBlue = keyList[keys.get(k) / 10].getKeyBlue() & 0xFF;
				int endBlue = keyList[keys.get(k + 1) / 10].getKeyBlue() & 0xFF;
				int deltaBlue = endBlue - startBlue;
				float tickBlue = (float)deltaBlue / (float)timeBetwinKeys.get(k);

				int startSecRed = keyList[keys.get(k) / 10].getKeySecRed() & 0xFF;
				int endSecRed = keyList[keys.get(k + 1) / 10].getKeySecRed() & 0xFF;
				int deltaSecRed = endSecRed - startSecRed;
				float tickSecRed = (float)deltaSecRed / (float)timeBetwinKeys.get(k);

				int startSecGreen = keyList[keys.get(k) / 10].getKeySecGreen() & 0xFF;
				int endSecGreen = keyList[keys.get(k + 1) / 10].getKeySecGreen() & 0xFF;
				int deltaSecGreen = endSecGreen - startSecGreen;
				float tickSecGreen = (float)deltaSecGreen / (float)timeBetwinKeys.get(k);

				int startSecBlue = keyList[keys.get(k) / 10].getKeySecBlue() & 0xFF;
				int endSecBlue = keyList[keys.get(k + 1) / 10].getKeySecBlue() & 0xFF;
				int deltaSecBlue = endSecBlue - startSecBlue;
				float tickSecBlue = (float)deltaSecBlue / (float)timeBetwinKeys.get(k);

				int startAngle1 = keyList[keys.get(k) / 10].getKeyAngle1();
				int endAngle1 = keyList[keys.get(k + 1) / 10].getKeyAngle1();
				int deltaAngle1 = endAngle1 - startAngle1;
				float tickAngle1 = (float)deltaAngle1 / (float)timeBetwinKeys.get(k);

				int startAngle2 = keyList[keys.get(k) / 10].getKeyAngle2()& 0xFF;
				int endAngle2 = keyList[keys.get(k + 1) / 10].getKeyAngle2()& 0xFF;
				int deltaAngle2 = endAngle2 - startAngle2;
				float tickAngle2 = (float)deltaAngle2 / (float)timeBetwinKeys.get(k);

				int startMainSize = keyList[keys.get(k) / 10].getKeyMainLaserSize()& 0xFF;
				int endMainSize = keyList[keys.get(k + 1) / 10].getKeyMainLaserSize()& 0xFF;
				int deltaMainSize = endMainSize - startMainSize;
				float tickMainSize = (float)deltaMainSize / (float)timeBetwinKeys.get(k);

				int startSecSize = keyList[keys.get(k) / 10].getKeySecLaserSize()& 0xFF;
				int endSecSize = keyList[keys.get(k + 1) / 10].getKeySecLaserSize()& 0xFF;
				int deltaSecSize = endSecSize - startSecSize;
				float tickSecSize = (float)deltaSecSize / (float)timeBetwinKeys.get(k);

				for(int l = keys.get(k); l < keys.get(k + 1); l++)
				{
					redKey[l] = (byte)(startRed + (tickRed * (l - keys.get(k))));
					greenKey[l] = (byte)(startGreen + (tickGreen * (l - keys.get(k))));
					blueKey[l] = (byte)(startBlue + (tickBlue * (l - keys.get(k))));
					secRedKey[l] = (byte)(startSecRed + (tickSecRed * (l - keys.get(k))));
					secGreenKey[l] = (byte)(startSecGreen + (tickSecGreen * (l - keys.get(k))));
					secBlueKey[l] = (byte)(startSecBlue + (tickSecBlue * (l - keys.get(k))));
					angle1Key[l] = (int)(startAngle1 + (tickAngle1 * (l - keys.get(k))));
					angle2Key[l] = (byte)(startAngle2 + (tickAngle2 * (l - keys.get(k))));
					mainSizeKey[l] = (byte)(startMainSize + (tickMainSize * (l - keys.get(k))));
					secSizeKey[l] = (byte)(startSecSize + (tickSecSize * (l - keys.get(k))));
				}
			}

			int startRed = keyList[keys.get(keys.size() - 1) / 10].getKeyRed() & 0xFF;
			int endRed = keyList[keys.get(0) / 10].getKeyRed() & 0xFF;
			int deltaRed = endRed - startRed;
			float tickRed = (float)deltaRed / (float)timeBetwinKeys.get(keys.size() - 1);

			int startGreen = keyList[keys.get(keys.size() - 1) / 10].getKeyGreen() & 0xFF;
			int endGreen = keyList[keys.get(0) / 10].getKeyGreen() & 0xFF;
			int deltaGreen = endGreen - startGreen;
			float tickGreen = (float)deltaGreen / (float)timeBetwinKeys.get(keys.size() - 1);

			int startBlue = keyList[keys.get(keys.size() - 1) / 10].getKeyBlue() & 0xFF;
			int endBlue = keyList[keys.get(0) / 10].getKeyBlue() & 0xFF;
			int deltaBlue = endBlue - startBlue;
			float tickBlue = (float)deltaBlue / (float)timeBetwinKeys.get(keys.size() - 1);

			int startSecRed = keyList[keys.get(keys.size() - 1) / 10].getKeySecRed() & 0xFF;
			int endSecRed = keyList[keys.get(0) / 10].getKeySecRed() & 0xFF;
			int deltaSecRed = endSecRed - startSecRed;
			float tickSecRed = (float)deltaSecRed / (float)timeBetwinKeys.get(keys.size() - 1);

			int startSecGreen = keyList[keys.get(keys.size() - 1) / 10].getKeySecGreen() & 0xFF;
			int endSecGreen = keyList[keys.get(0) / 10].getKeySecGreen() & 0xFF;
			int deltaSecGreen = endSecGreen - startSecGreen;
			float tickSecGreen = (float)deltaSecGreen / (float)timeBetwinKeys.get(keys.size() - 1);

			int startSecBlue = keyList[keys.get(keys.size() - 1) / 10].getKeySecBlue() & 0xFF;
			int endSecBlue = keyList[keys.get(0) / 10].getKeySecBlue() & 0xFF;
			int deltaSecBlue = endSecBlue - startSecBlue;
			float tickSecBlue = (float)deltaSecBlue / (float)timeBetwinKeys.get(keys.size() - 1);

			int startAngle1 = keyList[keys.get(keys.size() - 1) / 10].getKeyAngle1();
			int endAngle1 = keyList[keys.get(0) / 10].getKeyAngle1();
			int deltaAngle1 = endAngle1 - startAngle1;
			float tickAngle1 = (float)deltaAngle1 / (float)timeBetwinKeys.get(keys.size() - 1);

			int startAngle2 = keyList[keys.get(keys.size() - 1) / 10].getKeyAngle2()& 0xFF;
			int endAngle2 = keyList[keys.get(0) / 10].getKeyAngle2()& 0xFF;
			int deltaAngle2 = endAngle2 - startAngle2;
			float tickAngle2 = (float)deltaAngle2 / (float)timeBetwinKeys.get(keys.size() - 1);

			int startMainSize = keyList[keys.get(keys.size() - 1) / 10].getKeyMainLaserSize()& 0xFF;
			int endMainSize = keyList[keys.get(0) / 10].getKeyMainLaserSize()& 0xFF;
			int deltaMainSize = endMainSize - startMainSize;
			float tickMainSize = (float)deltaMainSize / (float)timeBetwinKeys.get(keys.size() - 1);

			int startSecSize = keyList[keys.get(keys.size() - 1) / 10].getKeySecLaserSize()& 0xFF;
			int endSecSize = keyList[keys.get(0) / 10].getKeySecLaserSize()& 0xFF;
			int deltaSecSize = endSecSize - startSecSize;
			float tickSecSize = (float)deltaSecSize / (float)timeBetwinKeys.get(keys.size() - 1);

			for(int m = keys.get(keys.size() - 1); m < 1200; m++)
			{
				redKey[m] = (byte)(startRed + (tickRed * (m - keys.get(keys.size() - 1))));
				greenKey[m] = (byte)(startGreen + (tickGreen * (m - keys.get(keys.size() - 1))));
				blueKey[m] = (byte)(startBlue + (tickBlue * (m - keys.get(keys.size() - 1))));
				secRedKey[m] = (byte)(startSecRed + (tickSecRed * (m - keys.get(keys.size() - 1))));
				secGreenKey[m] = (byte)(startSecGreen + (tickSecGreen * (m - keys.get(keys.size() - 1))));
				secBlueKey[m] = (byte)(startSecBlue + (tickSecBlue * (m - keys.get(keys.size() - 1))));
				angle1Key[m] = (int)(startAngle1 + (tickAngle1 * (m - keys.get(keys.size() - 1))));
				angle2Key[m] = (byte)(startAngle2 + (tickAngle2 * (m - keys.get(keys.size() - 1))));
				mainSizeKey[m] = (byte)(startMainSize + (tickMainSize * (m - keys.get(keys.size() - 1))));
				secSizeKey[m] = (byte)(startSecSize + (tickSecSize * (m - keys.get(keys.size() - 1))));

			}
			for(int n = 0; n < keys.get(0); n++)
			{
				redKey[n] = (byte)(redKey[1199] + (tickRed * n));
				greenKey[n] = (byte)(greenKey[1199] + (tickGreen * n));
				blueKey[n] = (byte)(blueKey[1199] + (tickBlue * n));
				secRedKey[n] = (byte)(secRedKey[1199] + (tickSecRed * n));
				secGreenKey[n] = (byte)(secGreenKey[1199] + (tickSecGreen * n));
				secBlueKey[n] = (byte)(secBlueKey[1199] + (tickSecBlue * n));
				angle1Key[n] = (int)(angle1Key[1199] + (tickAngle1 * n));
				angle2Key[n] = (byte)(angle2Key[1199] + (tickAngle2 * n));
				mainSizeKey[n] = (byte)(mainSizeKey[1199] + (tickMainSize * n));
				secSizeKey[n] = (byte)(secSizeKey[1199] + (tickSecSize * n));

			}
		}
		else if(keys.size() == 1)
		{
			for(int i = 0; i < 1200; i++)
			{
				redKey[i] = keyList[keys.get(0)/10].getKeyRed();
				greenKey[i] = keyList[keys.get(0)/10].getKeyGreen();
				blueKey[i] = keyList[keys.get(0)/10].getKeyBlue();
				secRedKey[i] = keyList[keys.get(0)/10].getKeySecRed();
				secGreenKey[i] = keyList[keys.get(0)/10].getKeySecGreen();
				secBlueKey[i] = keyList[keys.get(0)/10].getKeySecBlue();
				angle1Key[i] = keyList[keys.get(0)/10].getKeyAngle1();
				angle2Key[i] = keyList[keys.get(0)/10].getKeyAngle2();
				mainSizeKey[i] = keyList[keys.get(0)/10].getKeyMainLaserSize();
				secSizeKey[i] = keyList[keys.get(0)/10].getKeySecLaserSize();
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public float isActive()
	{
		if(!this.isActive)
		{
			return 0.0F;
		}
		else
		{
			int i = (int)(this.worldObj.getTotalWorldTime() - this.worldTimeClient);
			this.worldTimeClient = this.worldObj.getTotalWorldTime();

			if(i > 1)
			{
				this.activeBooleanFloat -= (float)i / 40.0F;

				if(this.activeBooleanFloat < 0.0F)
				{
					this.activeBooleanFloat = 0.0F;
				}
			}

			this.activeBooleanFloat += 0.025F;

			if(this.activeBooleanFloat > 1.0F)
			{
				this.activeBooleanFloat = 1.0F;
			}

			return this.activeBooleanFloat;
		}
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared()
	{
		return 65536.0D;
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound)
	{
		super.writeToNBT(nbtTagCompound);
		nbtTagCompound.setByte("Red", red);
		nbtTagCompound.setByte("Green", green);
		nbtTagCompound.setByte("Blue", blue);
		nbtTagCompound.setByte("SecRed", secRed);
		nbtTagCompound.setByte("SecGreen", secGreen);
		nbtTagCompound.setByte("SecBlue", secBlue);
		if(textureName != null && !textureName.isEmpty())
		{
			nbtTagCompound.setString("TextureName", textureName);
		}
		if(secTextureName != null && !secTextureName.isEmpty())
		{
			nbtTagCompound.setString("SecTextureName", secTextureName);
		}
		nbtTagCompound.setInteger("Angle1", angle1);
		nbtTagCompound.setByte("Angle2", angle2);
		nbtTagCompound.setBoolean("AutoRotate", autoRotate);
		nbtTagCompound.setBoolean("ReverseRotation", reverseRotation);
		nbtTagCompound.setByte("RotationSpeed", rotationSpeed);
		nbtTagCompound.setBoolean("SecondaryLaser", secondaryLaser);
		nbtTagCompound.setByte("LastKeySelected", lastKeySelected);
		nbtTagCompound.setBoolean("TimeLineEnabled", timeLineEnabled);
		nbtTagCompound.setInteger("Time", time);
		nbtTagCompound.setBoolean("SmoothMode", smoothMode);
		nbtTagCompound.setByte("CreateKeyTime", createKeyTime);
		nbtTagCompound.setByte("DisplayAxe", displayAxe);
		nbtTagCompound.setBoolean("SideLaser", sideLaser);
		nbtTagCompound.setByte("MainLaserSize", mainLaserSize);
		nbtTagCompound.setByte("SecLaserSize", secLaserSize);

		nbtTagCompound.setByteArray("RedKey", redKey);
		nbtTagCompound.setByteArray("GreenKey", greenKey);
		nbtTagCompound.setByteArray("BlueKey", blueKey);
		nbtTagCompound.setByteArray("SecRedKey", secRedKey);
		nbtTagCompound.setByteArray("SecGreenKey", secGreenKey);
		nbtTagCompound.setByteArray("SecBlueKey", secBlueKey);
		nbtTagCompound.setIntArray("Angle1Key", angle1Key);
		nbtTagCompound.setByteArray("Angle2Key", angle2Key);

		NBTTagList nbttaglist = new NBTTagList();
		for(int i = 0; i < this.keyList.length; ++i)
		{
			if(this.keyList[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Key", (byte)i);
				this.keyList[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbtTagCompound.setTag("SpotLightKeys", nbttaglist);

	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound)
	{
		super.readFromNBT(nbtTagCompound);
		red = nbtTagCompound.getByte("Red");
		green = nbtTagCompound.getByte("Green");
		blue = nbtTagCompound.getByte("Blue");
		secRed = nbtTagCompound.getByte("SecRed");
		secGreen = nbtTagCompound.getByte("SecGreen");
		secBlue = nbtTagCompound.getByte("SecBlue");
		textureName = nbtTagCompound.getString("TextureName");
		secTextureName = nbtTagCompound.getString("SecTextureName");
		angle1 = nbtTagCompound.getInteger("Angle1");
		angle2 = nbtTagCompound.getByte("Angle2");
		autoRotate = nbtTagCompound.getBoolean("AutoRotate");
		reverseRotation = nbtTagCompound.getBoolean("ReverseRotation");
		rotationSpeed = nbtTagCompound.getByte("RotationSpeed");
		secondaryLaser = nbtTagCompound.getBoolean("SecondaryLaser");
		lastKeySelected = nbtTagCompound.getByte("LastKeySelected");
		timeLineEnabled = nbtTagCompound.getBoolean("TimeLineEnabled");
		time = nbtTagCompound.getInteger("Time");
		smoothMode = nbtTagCompound.getBoolean("SmoothMode");
		createKeyTime = nbtTagCompound.getByte("CreateKeyTime");
		displayAxe = nbtTagCompound.getByte("DisplayAxe");
		sideLaser = nbtTagCompound.getBoolean("SideLaser");
		mainLaserSize = nbtTagCompound.getByte("MainLaserSize");
		secLaserSize = nbtTagCompound.getByte("SecLaserSize");

		redKey = nbtTagCompound.getByteArray("RedKey");
		greenKey = nbtTagCompound.getByteArray("GreenKey");
		blueKey = nbtTagCompound.getByteArray("BlueKey");
		secRedKey = nbtTagCompound.getByteArray("SecRedKey");
		secGreenKey = nbtTagCompound.getByteArray("SecGreenKey");
		secBlueKey = nbtTagCompound.getByteArray("SecBlueKey");
		angle1Key = nbtTagCompound.getIntArray("Angle1Key");
		angle2Key = nbtTagCompound.getByteArray("Angle2Key");

		NBTTagList nbttaglist = nbtTagCompound.getTagList("SpotLightKeys", Constants.NBT.TAG_COMPOUND);
		for(int i = 0; i < nbttaglist.tagCount(); ++i)
		{
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Key") & 255;

			if(j >= 0 && j < this.keyList.length)
			{
				this.keyList[j] = SpotLightEntry.loadSpotLightEntryFromNBT(nbttagcompound1);
			}
		}

	}

	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox()
	{
		return INFINITE_EXTENT_AABB;
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
	{
		readFromNBT(pkt.func_148857_g());
	}

	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 3, nbt);
	}

	public void setByte(byte index, byte value)
	{
		// System.out.println(index);
		switch(index)
		{
		case 0:
		{
			this.red = value;
			break;
		}
		case 1:
		{
			this.green = value;
			break;
		}
		case 2:
		{
			this.blue = value;
			break;
		}
		case 3:
		{
			this.secRed = value;
			break;
		}
		case 4:
		{
			this.secGreen = value;
			break;
		}
		case 5:
		{
			this.secBlue = value;
			break;
		}
		case 9:
		{
			this.angle2 = value;
			break;
		}

		case 12:
		{
			this.rotationSpeed = value;
			break;
		}
		case 14:
		{
			this.displayAxe = value;
			break;
		}
		case 16:
		{
			this.mainLaserSize = value;
			break;
		}
		case 17:
		{
			this.secLaserSize = value;
			break;
		}
		case 20:
		{
			this.lastKeySelected = value;
			break;
		}
		case 37:
		{
			this.createKeyTime = value;
			break;
		}
		default:
		{
			NanotechMod.log.error("Wrong set index : " + index);
		}
		}
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public void setBoolean(byte index, boolean value)
	{
		switch(index)
		{
		case 10:
		{
			this.autoRotate = value;
			break;
		}
		case 11:
		{
			this.reverseRotation = value;
			break;
		}
		case 13:
		{
			this.secondaryLaser = value;
			break;
		}
		case 15:
		{
			this.sideLaser = value;
			break;
		}
		case 22:
		{
			this.timeLineEnabled = value;
			break;
		}
		case 24:
		{
			this.smoothMode = value;
			break;
		}
		default:
		{
			NanotechMod.log.error("Wrong set index : " + index);
		}
		}
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public void set(int index, int value)
	{
		switch(index)
		{
		case 8:
		{
			this.angle1 = value;
			break;
		}

		case 23:
		{
			this.time = value;
			break;
		}
		default:
		{
			NanotechMod.log.error("Wrong set index : " + index);
		}
		}
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public void set(int index, String value)
	{
		switch(index)
		{
		case 6:
		{
			textureName = value;
			break;
		}
		case 7:
		{
			secTextureName = value;
			break;
		}
		default:
		{
			NanotechMod.log.error("Wrong set index : " + index);
		}
		}
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public byte getRed()
	{
		return red;
	}

	public byte getGreen()
	{
		return green;
	}

	public byte getBlue()
	{
		return blue;
	}

	public byte getSecRed()
	{
		return secRed;
	}

	public byte getSecGreen()
	{
		return secGreen;
	}

	public byte getSecBlue()
	{
		return secBlue;
	}

	public String getTextureName()
	{
		return textureName;
	}

	public String getSecTextureName()
	{
		return secTextureName;
	}

	public int getAngle1()
	{
		return angle1;
	}

	public byte getAngle2()
	{
		return angle2;
	}

	public boolean isAutoRotate()
	{
		return autoRotate;
	}

	public boolean isReverseRotation()
	{
		return reverseRotation;
	}

	public byte getRotationSpeed()
	{
		return rotationSpeed;
	}

	public boolean isSecondaryLaser()
	{
		return secondaryLaser;
	}

	public byte getDisplayAxe()
	{
		return displayAxe;
	}

	public boolean isSideLaser()
	{
		return sideLaser;
	}

	public byte getMainLaserSize()
	{
		return mainLaserSize;
	}

	public byte getSecLaserSize()
	{
		return secLaserSize;
	}

	public byte getLastKeySelected()
	{
		return lastKeySelected;
	}

	public boolean isTimeLineEnabled()
	{
		return timeLineEnabled;
	}

	public int getTime()
	{
		return time;
	}

	public boolean isSmoothMode()
	{
		return smoothMode;
	}

	public byte getCreateKeyTime()
	{
		return createKeyTime;
	}

	public void setKey(int index, SpotLightEntry value)
	{
		if(index >= 0 && index < this.keyList.length)
		{
			this.keyList[index] = value;
		}
		else
		{
			System.out.println("fatal error, index invalid !");
		}
		keysProcess();
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public SpotLightEntry getKey(int index)
	{
		if(index >= 0 && index < this.keyList.length)
		{
			return this.keyList[index];
		}
		return null;
	}

	public void setDefaultValue()
	{
		this.setByte((byte)0, (byte)255);
		this.setByte((byte)1, (byte)255);
		this.setByte((byte)2, (byte)255);
		this.setByte((byte)3, (byte)255);
		this.setByte((byte)4, (byte)255);
		this.setByte((byte)5, (byte)255);
		this.setBoolean((byte)10, false);
		this.setBoolean((byte)11, false);
		this.setByte((byte)12, (byte)0);
		this.setBoolean((byte)13, true);
		this.setByte((byte)14, (byte)0);
		this.setBoolean((byte)15, false);
		this.setByte((byte)16,(byte) 40);
		this.setByte((byte)17, (byte)75);
	}
}