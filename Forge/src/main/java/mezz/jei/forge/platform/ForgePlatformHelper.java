package mezz.jei.forge.platform;

import mezz.jei.common.platform.IPlatformHelper;
import mezz.jei.common.platform.IPlatformRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class ForgePlatformHelper implements IPlatformHelper {
    private final ForgeItemStackHelper itemStackHelper = new ForgeItemStackHelper();
    private final ForgeRenderHelper renderHelper = new ForgeRenderHelper();
    private final ForgeRecipeHelper recipeHelper = new ForgeRecipeHelper();

    @Override
    public <T> IPlatformRegistry<T> getRegistry(ResourceKey<? extends Registry<T>> key) {
        return ForgeRegistryWrapper.getRegistry(key);
    }

    @Override
    public ForgeItemStackHelper getItemStackHelper() {
        return itemStackHelper;
    }

    @Override
    public ForgeRenderHelper getRenderHelper() {
        return renderHelper;
    }

    @Override
    public ForgeRecipeHelper getRecipeHelper() {
        return recipeHelper;
    }
}

