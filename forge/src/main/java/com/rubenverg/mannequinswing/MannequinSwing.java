package com.rubenverg.mannequinswing;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MannequinSwing {
    public MannequinSwing() {
        Constants.LOG.info("Hello Forge!");
        CommonClass.init();
    }
}