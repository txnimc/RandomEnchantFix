package toni.randomenchantfix.foundation.config;

import toni.lib.config.ConfigBase;

import java.util.ArrayList;
import java.util.List;


#if FABRIC
    #if AFTER_21_1
    import net.neoforged.neoforge.common.ModConfigSpec.*;
    #endif

    #if CURRENT_20_1
	import net.minecraftforge.common.ForgeConfigSpec.*;
    #endif
#endif

#if FORGE
import net.minecraftforge.common.ForgeConfigSpec.*;
#endif

#if NEO
import net.neoforged.neoforge.common.ModConfigSpec.*;
#endif

public class CCommon extends ConfigBase {

    public final CValue<List<? extends String>, ConfigValue<List<? extends String>>> FILTERED_ENCHANTMENTS = new CValue<>(
        "FilteredEnchantments",
        builder -> builder.define("FilteredEnchantments", List.of("nova_structures:shulker_boss", "nova_structures:shulker_miniboss")),
        "Add enchantment IDs to this list to prevent them from being randomly enchanted.");


    @Override
    public String getName() {
        return "common";
    }
}
