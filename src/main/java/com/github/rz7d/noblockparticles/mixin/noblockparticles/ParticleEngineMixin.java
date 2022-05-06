package com.github.rz7d.noblockparticles.mixin.noblockparticles;

import com.github.rz7d.noblockparticles.NoBlockParticles;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleEngine.class)
public class ParticleEngineMixin {

    @Inject(method = "destroy", at = @At("HEAD"), cancellable = true)
    public void destroy(BlockPos blockPos, BlockState blockState, CallbackInfo ci) {
        if (!NoBlockParticles.visibleDestroy) {
            ci.cancel();
        }
    }

    @Inject(method = "crack", at = @At("HEAD"), cancellable = true)
    public void crack(BlockPos blockPos, Direction direction, CallbackInfo ci) {
        if (!NoBlockParticles.visibleCrack) {
            ci.cancel();
        }
    }

}
