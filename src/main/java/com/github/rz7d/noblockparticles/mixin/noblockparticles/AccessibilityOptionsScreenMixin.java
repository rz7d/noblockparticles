package com.github.rz7d.noblockparticles.mixin.noblockparticles;

import com.github.rz7d.noblockparticles.NoBlockParticles;
import net.minecraft.client.Option;
import net.minecraft.client.gui.screens.AccessibilityOptionsScreen;
import org.apache.commons.lang3.ArrayUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AccessibilityOptionsScreen.class)
public class AccessibilityOptionsScreenMixin {

    @Mutable
    @Shadow
    @Final
    private static Option[] OPTIONS;

    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void clinit(CallbackInfo ci) {
        OPTIONS = ArrayUtils.addAll(OPTIONS, NoBlockParticles.BLOCK_PARTICLES_DESTROY, NoBlockParticles.BLOCK_PARTICLES_CRACK);
    }

}
