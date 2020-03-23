package cx.rain.fabricmod.cutecraftworld.commands;

import com.mojang.brigadier.CommandDispatcher;
import cx.rain.fabricmod.cutecraftworld.CuteCraftWorld;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

public class CommandVersion {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("version")
                .executes(context -> {
                    context.getSource().sendError(
                            new LiteralText("[CuteCraftWorld] §b服务端MOD版本：" + CuteCraftWorld.VERSION));
                    return 1;
                }));
    }
}
