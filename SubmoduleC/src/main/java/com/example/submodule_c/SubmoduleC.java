package com.example.submodule_c;

import com.example.common.Common;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(SubmoduleC.MODID)
public class SubmoduleC {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "submodule_c";

    public SubmoduleC(IEventBus modEventBus, ModContainer modContainer) {
        System.out.println(new Common());
    }


}
