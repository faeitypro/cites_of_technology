package com.technological_cities.cities_of_technologies.special;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class special extends Block {
    public special(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public InteractionResult use(BlockState BlockState, Level Level, BlockPos BlockPos, Player Player, InteractionHand InteractionHand, BlockHitResult BlockHitResult) {

        return super.use(BlockState, Level, BlockPos, Player, InteractionHand, BlockHitResult);
    }
}
