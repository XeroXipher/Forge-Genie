package net.KryptonicJaze.GenieMod.item;

import net.KryptonicJaze.GenieMod.GenieMod;
import net.KryptonicJaze.GenieMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.util.datafix.fixes.ItemSpawnEggFix;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GenieMod.MOD_ID);

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
    public static final RegistryObject<CreativeModeTab> KRYPTONIC_GADGETS = CREATIVE_MODE_TABS.register("kryptonic_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BANKING_ITEM.get()))
                            .title(Component.translatable("custom_creative_tab"))
                                    .displayItems((pParameters, pOutput) -> {
                                        pOutput.accept(ModItems.BANKING_ITEM.get());
                                        pOutput.accept(ModItems.GENIE_LAMP.get());

                                        pOutput.accept(ModBlocks.CRIMSON_GOLD_ORE.get());
                                        pOutput.accept(ModBlocks.CRIMSON_SILVER_ORE.get());
                                            })
                                            .build());

}
