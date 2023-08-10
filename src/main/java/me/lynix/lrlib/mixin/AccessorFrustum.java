package me.lynix.lrlib.mixin;

import org.joml.FrustumIntersection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.render.Frustum;

@Mixin(Frustum.class)
public interface AccessorFrustum {

    @Accessor
    public abstract FrustumIntersection getFrustumIntersection();

    @Accessor
    public abstract void setFrustumIntersection(FrustumIntersection vector4f);

    @Accessor("x")
    public abstract double getX();

    @Accessor("x")
    public abstract void setX(double x);

    @Accessor("y")
    public abstract double getY();

    @Accessor("y")
    public abstract void setY(double y);

    @Accessor("z")
    public abstract double getZ();

    @Accessor("z")
    public abstract void setZ(double z);
}
