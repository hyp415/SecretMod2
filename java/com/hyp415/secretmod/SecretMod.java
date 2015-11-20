package com.hyp415.secretmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = SecretMod.MODID, name = SecretMod.MODNAME, version = SecretMod.VERSION)
public class SecretMod {
	
	public static final String MODID = "secretmod";
    public static final String MODNAME = "Secret Mod";
	public static final String VERSION = "1.0";
    
	@Instance
	public static SecretMod instance = new SecretMod();
	
	@SidedProxy(clientSide="com.hyp415.secretmod.ClientProxy", serverSide="com.hyp415.secretmod.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Called method: FMLPreInit");
		this.proxy.preInit(e);
    }
	
    @EventHandler
    public void init(FMLInitializationEvent e){
    	System.out.println("Called method: FMLInit");
    	this.proxy.init(e);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("Called method: FMLPostInit");
    	this.proxy.postInit(e);
    }
    
}


    
    

