package rmi.server.interfaces;

import java.io.Serializable;

/**
 * Created by edwin on 10/18/2015.
 */
public interface Task<T> extends Serializable {
    T execute();
}
