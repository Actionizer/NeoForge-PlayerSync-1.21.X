package net.doodlechaos.playersync.mixin.accessor;

import net.minecraft.util.thread.BlockableEventLoop;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockableEventLoop.class)
public interface BlockableEventLoopAccessor {

    @Invoker("runAllTasks")
    void callRunAllTasks();
}
