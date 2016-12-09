package com.hanakocz.minexmas;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSword;

@Mod(modid = MineXmas.MODID, version = MineXmas.VERSION, name = MineXmas.NAME)
public class MineXmas
{
    public static final String MODID = "minexmas";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "MineXmas";
    
    
    public static CreativeTabs xmasTab = new CreativeTabs("MineXmas")
	{
		public ItemShears getTabIconItem()
		{
			return Items.shears;
		}
	};
	
    @Instance
    public static MineXmas instance = new MineXmas();
    
    @SidedProxy(clientSide="com.hanakocz.minexmas.ClientProxy", serverSide="com.hanakocz.minexmas.ServerProxy")
    public static CommonProxy proxy;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    	
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
		
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    	
    }

}
