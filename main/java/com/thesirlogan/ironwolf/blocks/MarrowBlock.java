package com.thesirlogan.ironwolf.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MarrowBlock extends BlockBase 
{

	public MarrowBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.GROUND);
		setHardness(1.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
