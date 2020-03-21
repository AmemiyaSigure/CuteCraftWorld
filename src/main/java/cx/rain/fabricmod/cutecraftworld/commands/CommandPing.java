package cx.rain.fabricmod.cutecraftworld.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.network.MessageType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

public class CommandPing {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("ping")
                .executes(context -> {
                    context.getSource().getPlayer().sendChatMessage(
                            new LiteralText("啪！"), MessageType.CHAT);
                    return 1;
                }));
    }
}
