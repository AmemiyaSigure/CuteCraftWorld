package cx.rain.fabricmod.cutecraftworld;

import cx.rain.fabricmod.cutecraftworld.commands.Commands;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CuteCraftWorld implements ModInitializer {
    public static final String VERSION = "1.1.1";
    public static final Logger LOGGER = LogManager.getLogger("CuteCraftWorld");

    @Override
    public void onInitialize() {
        LOGGER.info("[CuteCraftWorld] Loading...");
        new Commands();
        new Events();
    }
}
