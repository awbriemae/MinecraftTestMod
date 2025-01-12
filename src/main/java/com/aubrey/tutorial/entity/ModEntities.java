package com.aubrey.tutorial.entity;

import com.aubrey.tutorial.MallowWonderland;
import com.aubrey.tutorial.entity.custom.BaseballProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MallowWonderland.MOD_ID);

    public static final RegistryObject<EntityType<BaseballProjectileEntity>> BASEBALL_PROJECTILE =
            ENTITY_TYPES.register("baseball_projectile", () -> EntityType.Builder.<BaseballProjectileEntity>of(BaseballProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("baseball_projectile"));


    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}

