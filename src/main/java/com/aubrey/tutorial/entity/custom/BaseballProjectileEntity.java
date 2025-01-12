package com.aubrey.tutorial.entity.custom;

import com.aubrey.tutorial.entity.ModEntities;
import com.aubrey.tutorial.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class BaseballProjectileEntity extends ThrowableItemProjectile {

    public BaseballProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public BaseballProjectileEntity(Level pLevel) {
        super(ModEntities.BASEBALL_PROJECTILE.get(), pLevel);
    }

    public BaseballProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.BASEBALL_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BASEBALL.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        int damage = 8;
        Entity entity = pResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)damage);

    }
}
