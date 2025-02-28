package toni.randomenchantfix.foundation.data;

#if FABRIC
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import toni.randomenchantfix.RandomEnchantFix;

public class RandomEnchantFixDatagen  implements DataGeneratorEntrypoint {

    @Override
    public String getEffectiveModId() {
        return RandomEnchantFix.ID;
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(ConfigLangDatagen::new);
    }
}
#endif