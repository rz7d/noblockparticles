package com.github.rz7d.noblockparticles;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.CycleOption;

public final class NoBlockParticles implements ClientModInitializer {

    public static final CycleOption<Boolean> BLOCK_PARTICLES_DESTROY = CycleOption.createOnOff("noblockparticles.options.blockDestroyParticles",
        (options) -> NoBlockParticles.visibleDestroy,
        (options, option, value) -> NoBlockParticles.visibleDestroy = value);
    public static final CycleOption<Boolean> BLOCK_PARTICLES_CRACK = CycleOption.createOnOff("noblockparticles.options.blockCrackParticles",
        (options) -> NoBlockParticles.visibleCrack,
        (options, option, value) -> NoBlockParticles.visibleCrack = value);

    public static boolean visibleDestroy;
    public static boolean visibleCrack;

    @Override
    public void onInitializeClient() {
    }

}
