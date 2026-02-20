package com.rubenverg.mannequinswing;

import com.rubenverg.mannequinswing.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class CommonClass {
    public static void init() {
        if (Services.PLATFORM.isModLoaded(Constants.MOD_ID)) {
            Constants.LOG.info("Mannequin Swing loaded!");
        }
    }
}