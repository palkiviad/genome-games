package com.ppp.genom;

/**
 * Created with IntelliJ IDEA.
 * User: p.popov
 * Date: 04.06.15
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
public interface IGenome {

    IGen getGen(GenType genType);

    IGen [] getAllGens();
}
