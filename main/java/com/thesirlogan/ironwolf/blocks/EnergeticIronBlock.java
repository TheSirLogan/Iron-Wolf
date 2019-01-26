package com.thesirlogan.ironwolf.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnergeticIronBlock extends BlockBase 
{

	public EnergeticIronBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(3000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
