package net.examplemod.fabric.client;

import net.examplemod.client.ExampleModClient;
import net.fabricmc.api.ClientModInitializer;

public final class ExampleModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleModClient.initClient();
    }
}
