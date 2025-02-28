package toni.randomenchantfix.mixins;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import toni.randomenchantfix.RandomEnchantFix;
import toni.randomenchantfix.foundation.config.AllConfigs;

import java.util.List;
import java.util.stream.Stream;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

     #if mc >= 211
     @Inject(method = "selectEnchantment", at = @At(value = "RETURN"))
     private static void filterEnchants(RandomSource random, ItemStack stack, int level, Stream<Holder<Enchantment>> possibleEnchantments, CallbackInfoReturnable<List<EnchantmentInstance>> cir) {
         var list = cir.getReturnValue();
         RandomEnchantFix.filterEnchants(list);
     }
     #else
     @Inject(method = "selectEnchantment", at = @At(value = "RETURN"))
     private static void filterEnchants(RandomSource random, ItemStack itemStack, int level, boolean allowTreasure, CallbackInfoReturnable<List<EnchantmentInstance>> cir) {
         var list = cir.getReturnValue();
         RandomEnchantFix.filterEnchants(list);
     }
     #endif

}
