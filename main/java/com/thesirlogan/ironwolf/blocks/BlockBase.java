package com.thesirlogan.ironwolf.blocks;

import com.thesirlogan.ironwolf.Main;
import com.thesirlogan.ironwolf.init.ModBlocks;
import com.thesirlogan.ironwolf.init.ModItems;
import com.thesirlogan.ironwolf.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel
{



	public BlockBase(String name, Material material)
	{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			
	}

	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}		
		
	
	
}
