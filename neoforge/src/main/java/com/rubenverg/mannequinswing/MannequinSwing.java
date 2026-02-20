package com.rubenverg.mannequinswing;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MannequinSwing {
    public MannequinSwing(IEventBus eventBus) {
        Constants.LOG.info("Hello NeoForge!");
        CommonClass.init();
    }
}