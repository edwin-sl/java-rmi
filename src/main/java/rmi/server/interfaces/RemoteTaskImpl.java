package rmi.server.interfaces;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by edwin on 10/18/2015.
 */
public class RemoteTaskImpl implements RemoteTask {
    public <T extends Serializable> T executeTask(Task<T> t) throws RemoteException {

        return t.execute();
    }
}
