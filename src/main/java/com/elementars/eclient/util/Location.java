package com.elementars.eclient.util;

import com.elementars.eclient.util.Wrapper;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

/**
 * @author auto on 2/19/2020
 */
public class Location {

    private double x, y, z;
    private boolean ground;

    public Location(double x, double y, double z, boolean ground) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ground = ground;
    }

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ground = true;
    }

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.ground = true;
    }

    public Location add(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Location add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Location subtract(int x, int y, int z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;

        return this;
    }

    public Location subtract(double x, double y, double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;

        return this;
    }

    public Block getBlock() {
        return Wrapper.getMinecraft().world.getBlockState(this.toBlockPos()).getBlock();
    }

    public boolean isOnGround() {
        return this.ground;
    }

    public Location setOnGround(boolean ground) {
        this.ground = ground;
        return this;
    }

    public double getX() {
        return x;
    }

    public Location setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Location setY(double y) {
        this.y = y;
        return this;
    }

    public double getZ() {
        return z;
    }

    public Location setZ(double z) {
        this.z = z;
        return this;
    }

    public static Location fromBlockPos(BlockPos blockPos) {
        return new Location(blockPos.getX(), blockPos.getY(), blockPos.getZ());
    }

    public BlockPos toBlockPos() {
        return new BlockPos(getX(), getY(), getZ());
    }

}