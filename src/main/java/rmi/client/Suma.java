package rmi.client;

import rmi.server.interfaces.Task;

/**
 * Created by edwin on 10/18/2015.
 */
public class Suma implements Task<Float> {
    public Float execute(Object... args) {
        return (Float)args[0] + (Float)args[1];
    }
}
