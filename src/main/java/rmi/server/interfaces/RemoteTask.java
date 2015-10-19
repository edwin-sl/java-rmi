package rmi.server.interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by edwin on 10/18/2015.
 */
public interface RemoteTask extends Remote{
    <T extends Serializable> T executeTask(Task<T> t) throws RemoteException;
}
