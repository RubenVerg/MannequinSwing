package com.rubenverg.mannequinswing.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.world.entity.decoration.Mannequin;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Mannequin.class)
public class MannequinSubMixin extends LivingEntityMixin {
	@Override
	public void overrideAiStep(Operation<Void> original) {
		super.overrideAiStep(original);
		updateSwingTime();
	}
}
