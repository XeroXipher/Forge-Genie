package net.KryptonicJaze.GenieMod.item;

import net.KryptonicJaze.GenieMod.GenieMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GenieMod.MOD_ID);

    public static final RegistryObject<Item> GENIE_LAMP = ITEMS.register("genie",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BANKING_ITEM = ITEMS.register("banking",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}