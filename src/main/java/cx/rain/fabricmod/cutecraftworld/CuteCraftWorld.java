package cx.rain.fabricmod.cutecraftworld;

import cx.rain.fabricmod.cutecraftworld.commands.Commands;
import net.fabricmc.api.ModInitializer;

public class CuteCraftWorld implements ModInitializer {
    public static final String VERSION = "1.0.0";

    @Override
    public void onInitialize() {
        new Commands();
    }
}
