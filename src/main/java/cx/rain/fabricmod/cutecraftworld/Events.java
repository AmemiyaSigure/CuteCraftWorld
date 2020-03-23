package cx.rain.fabricmod.cutecraftworld;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;

import java.util.List;

public class Events {
    public Events() {
        UseItemCallback.EVENT.register((playerEntity, world, hand) -> {
            return TypedActionResult.pass(ItemStack.EMPTY);
        });

        // Animals will run away when player hurt them family.
        AttackEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
            if (entity instanceof AnimalEntity) {
                List<Entity> animals = world.getEntities(entity,
                        entity.getBoundingBox().expand(16.0D, 3.0D, 16.0D));

                for (Entity a : animals) {
                    if (a instanceof AnimalEntity) {
                        AnimalEntity animal = (AnimalEntity) a;
                        animal.setAttacker(playerEntity);
                    }
                }
            }

            return ActionResult.PASS;
        });
    }
}
