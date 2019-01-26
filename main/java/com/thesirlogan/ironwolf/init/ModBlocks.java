package com.thesirlogan.ironwolf.init;

import java.util.ArrayList;
import java.util.List;

import com.thesirlogan.ironwolf.blocks.BlockBase;
import com.thesirlogan.ironwolf.blocks.EnergeticIronBlock;
import com.thesirlogan.ironwolf.blocks.MarrowBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MARROW_BLOCK = new MarrowBlock("marrow_block", Material.CORAL);
	public static final Block ENERGETIC_IRON_BLOCK = new EnergeticIronBlock("energetic_iron_block", Material.IRON);
	
	
	
}
