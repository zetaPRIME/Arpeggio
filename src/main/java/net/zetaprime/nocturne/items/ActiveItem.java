package net.zetaprime.nocturne.items;

import net.minecraft.client.KeyMapping;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.InputEvent;

public interface ActiveItem {
    boolean interceptsClick(ItemStack stack, InteractionHand hand, InputEvent.ClickInputEvent event);
}
