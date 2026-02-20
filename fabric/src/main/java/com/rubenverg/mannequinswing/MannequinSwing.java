package com.rubenverg.mannequinswing;

import net.fabricmc.api.ModInitializer;

public class MannequinSwing implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric!");
        CommonClass.init();
    }
}
