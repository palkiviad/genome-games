package com.ppp.creatures;

/**
 * Created with IntelliJ IDEA.
 * User: p.popov
 * Date: 04.06.15
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public interface ICreature {
    boolean isAlive();

    boolean isHungry();

    boolean readyToReproduction();

    int getAge();

    int getEnergy();


}
