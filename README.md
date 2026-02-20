# Mannequin Swing

This mod adds support for swing animations on mannequins. It does not add any new way to cause a swing animation, such as the `/swing` command from the 26.1 snapshots.

## Technical details

`LivingEntity` has a method `updateSwingTime` that needs to be called both on the client and on the server to allow an entity to swing its arms. However, it is only used by `Player`s and monsters. This mod adds a call in `Mannequin`s' `aiStep` function, through the technique of submixins.

```java
@Mixin(LivingEntity.class)
public class LivingEntityMixin {
	@Shadow
	protected void updateSwingTime() {};

	@WrapMethod(method = "aiStep")
	public void overrideAiStep(Operation<Void> original) {
		original.call();
	}
}

@Mixin(Mannequin.class)
public class MannequinSubMixin extends LivingEntityMixin {
	@Override
	public void overrideAiStep(Operation<Void> original) {
		super.overrideAiStep(original);
		updateSwingTime();
	}
}
```
