package net.zetaprime.arpeggio.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.InputEvent;
import net.zetaprime.nocturne.items.DefaultActiveItem;

public class FirearmItem extends DefaultActiveItem {
    public FirearmItem(Item.Properties prop) {
        super(prop);
    }

    /*
    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        return true; // prevent swinging animation
    }//*/

    @Override
    public boolean canAttackBlock(BlockState p_195938_1_, Level p_195938_2_, BlockPos p_195938_3_, Player player) {
        return false;
    }

    @Override
    public boolean interceptsClick(ItemStack stack, InteractionHand hand, InputEvent.ClickInputEvent event) {
        return event.isAttack();
    }
}
