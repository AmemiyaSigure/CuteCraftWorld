package cx.rain.fabricmod.cutecraftworld.commands;

import com.mojang.brigadier.CommandDispatcher;
import cx.rain.fabricmod.cutecraftworld.CuteCraftWorld;
import net.minecraft.network.MessageType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

public class CommandVersion {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("version")
                .executes(context -> {
                    context.getSource().getPlayer().sendChatMessage(
                            new LiteralText("§b服务端MOD版本：" + CuteCraftWorld.VERSION), MessageType.SYSTEM);
                    return 1;
                }));
    }
}
