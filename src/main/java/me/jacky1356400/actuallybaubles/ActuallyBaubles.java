package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import me.jacky1356400.actuallybaubles.item.*;
import me.jacky1356400.actuallybaubles.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = ActuallyBaubles.MODNAME, dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.1.1";
    public static final String MODID = "actuallybaubles";
    public static final String MODNAME = "ActuallyBaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:baubles;";
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public String getTranslatedTabLabel() {
            return "Actually Baubles";
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(InitItems.itemMisc, 1, 6);
        }
    };
    public static ItemMagnetRingBauble magnetRing = new ItemMagnetRingBauble("magnet_ring_bauble");
    public static ItemPotionRingAdvancedBauble potionRingAdvanced = new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble");
    public static ItemBatteryBauble battery = new ItemBatteryBauble("battery_bauble", 200000, 1000);
    public static ItemBatteryBauble batteryDouble = new ItemBatteryBauble("battery_double_bauble", 350000, 5000);
    public static ItemBatteryBauble batteryTriple = new ItemBatteryBauble("battery_triple_bauble", 600000, 10000);
    public static ItemBatteryBauble batteryQuadruple = new ItemBatteryBauble("battery_quadruple_bauble", 1000000, 30000);
    public static ItemBatteryBauble batteryQuintuple = new ItemBatteryBauble("battery_quintuple_bauble", 2000000, 100000);
    @SidedProxy(serverSide = "me.jacky1356400.actuallybaubles.proxy.CommonProxy", clientSide = "me.jacky1356400.actuallybaubles.proxy.ClientProxy")
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

}
