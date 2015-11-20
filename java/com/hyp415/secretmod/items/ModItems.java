package com.hyp415.secretmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item secretCandle;
	
	public static void createItems() {
		secretCandle = new Item();
		secretCandle.setUnlocalizedName("secret_candle");
		secretCandle.setCreativeTab(CreativeTabs.tabDecorations);
		GameRegistry.registerItem(secretCandle, "secret_candle");
		
		//GameRegistry.registerItem(secretCandle = new BasicItem("secret_candle"), "secret_candle");
    }

}
