package com.hanakocz.minexmas.achievements;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class Achievements 
{
	public static Achievement xmastime = (new Achievement("achievement.xmastime", "xmastime", 0, 0, Items.fire_charge, AchievementList.openInventory));
	public static Achievement sendpresent = (new Achievement("achievement.sendpresent", "sendPresent", 1, 1, Items.fire_charge, Achievements.xmastime));
	public static Achievement getpresent = (new Achievement("achievement.getpresent", "getPresent", 1, 3, Items.fire_charge, Achievements.xmastime));
	public static Achievement gettree = (new Achievement("achievement.gettree", "getTree", 1, 5, Items.fire_charge, Achievements.xmastime));
	
	public static AchievementPage MineXmasPage = new AchievementPage("MineXmas", new Achievement[] 
	{	xmastime, 
		sendpresent, 
		getpresent,
	 	gettree
	});
	
	public static void init()
	{ 
		xmastime.registerStat();
		sendpresent.registerStat();
		getpresent.registerStat();
		gettree.registerStat();
		AchievementPage.registerAchievementPage(MineXmasPage);
		
	}

}
