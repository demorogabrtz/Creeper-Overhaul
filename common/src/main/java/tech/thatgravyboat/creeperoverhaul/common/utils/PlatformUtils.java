package tech.thatgravyboat.creeperoverhaul.common.utils;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import tech.thatgravyboat.creeperoverhaul.common.entity.base.BaseCreeper;

public class PlatformUtils {

    @ExpectPlatform
    public static boolean shouldHidePowerLayer() {
        return false;
    }

    @ExpectPlatform
    public static Level.ExplosionInteraction getInteractionForCreeper(BaseCreeper creeper) {
        throw new AssertionError();
    }

    @Contract(pure = true)
    @ExpectPlatform
    public static boolean isShears(ItemStack stack) {
        throw new AssertionError();
    }

    @Contract(pure = true)
    @ExpectPlatform
    public static boolean isFlintAndSteel(ItemStack stack) {
        throw new AssertionError();
    }

    @Nullable
    @ExpectPlatform
    public static Holder<Attribute> getModAttribute(String name) {
        throw new AssertionError();
    }
}
