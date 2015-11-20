package com.hyp415.secretmod.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.hyp415.secretmod.SecretMod;
import com.hyp415.secretmod.blocks.ModBlocks;

public final class BlockRenderRegister {
	
	
	public static void registerBlockRenderer(){
		reg(ModBlocks.secretBlock);
		reg(ModBlocks.secondBlock);
	}
	
	public static String modid = SecretMod.MODID;
	
	public static void reg(Block block){
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
