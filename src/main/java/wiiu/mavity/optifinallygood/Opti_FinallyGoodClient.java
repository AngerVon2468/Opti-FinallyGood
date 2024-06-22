package wiiu.mavity.optifinallygood;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class Opti_FinallyGoodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("optifabric")) {

            throw new RuntimeException("Are you actually stupid?");

        } else if (FabricLoader.getInstance().isModLoaded("optifine")) {

            throw new RuntimeException("Are you actually stupid?");

        }
    }
}