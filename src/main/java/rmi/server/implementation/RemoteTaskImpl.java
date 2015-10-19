package rmi.server.implementation;

import rmi.server.interfaces.RemoteTask;
import rmi.server.interfaces.Task;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by edwin on 10/18/2015.
 */
public class RemoteTaskImpl implements RemoteTask {

    public <T> T executeTask(Task<T> t, Object... args) throws RemoteException {
        return t.execute(args);
    }
}
