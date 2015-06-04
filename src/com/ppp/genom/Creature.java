package com.ppp.genom;

/**
 * Created with IntelliJ IDEA.
 * User: p.popov
 * Date: 04.06.15
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
public abstract class Creature implements ICreature {
    private IGenome genome;
    private int age;
    private int energy;

    protected Creature(IGenome genome) {
        this.genome = genome;
        this.age = 0;
        this.energy = getEnergyCapacity();
    }

    protected abstract int getEnergyCapacity();

    protected abstract float getAliveEnergyThresh

    @Override
    public boolean isAlive() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isHungry() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean readyToReproduction() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getEnergy() {
        return energy;
    }
}
