package cx.rain.fabricmod.cutecraftworld.commands;

import net.fabricmc.fabric.api.registry.CommandRegistry;

public class Commands {
    public Commands() {
        CommandRegistry.INSTANCE.register(true, dispatcher -> {
            CommandVersion.register(dispatcher);
            CommandPing.register(dispatcher);
        });
    }
}
