package com.enderio.core;

import com.enderio.core.common.network.EnderNetwork;
import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(EnderCore.MODID)
public class EnderCore implements ModInitializer {
    public static final @NotNull String MODID = "endercore";

    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MODID);

    public EnderCore() {
        EnderNetwork.getNetwork();
    }
}
