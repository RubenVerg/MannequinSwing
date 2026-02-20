package com.rubenverg.mannequinswing.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
	@Shadow
	protected void updateSwingTime() {};

	@WrapMethod(method = "aiStep")
	public void overrideAiStep(Operation<Void> original) {
		original.call();
	}
}
