package net.zetaprime.nocturne.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.InputEvent;

public class DefaultActiveItem extends Item implements ActiveItem {
    public DefaultActiveItem(Item.Properties prop) { super(prop); }

    // Item overrides

    @Override
    public int getItemStackLimit(ItemStack stack) { return 1; }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        return true;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) { return slotChanged; }

    // ActiveItem default implementations

    @Override
    public boolean interceptsClick(ItemStack stack, InteractionHand hand, InputEvent.ClickInputEvent event) { return false; }
}
