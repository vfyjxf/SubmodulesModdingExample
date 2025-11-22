package com.example.submodule_a;

import com.example.common.Common;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(SubmoduleA.MODID)
public class SubmoduleA {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "submodule_a";

    public SubmoduleA(IEventBus modEventBus, ModContainer modContainer) {
        System.out.println(new Common());
    }


}
