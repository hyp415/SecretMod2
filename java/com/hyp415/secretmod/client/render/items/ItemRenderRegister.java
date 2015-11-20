package com.hyp415.secretmod.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.hyp415.secretmod.SecretMod;
import com.hyp415.secretmod.items.ModItems;

public class ItemRenderRegister {

	public static String modid = SecretMod.MODID;
	public static void registerItemRenderer(){
		reg(ModItems.secretCandle);
	}

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
