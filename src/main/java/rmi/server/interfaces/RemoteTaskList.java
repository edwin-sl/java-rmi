package rmi.server.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by edwin on 10/18/2015.
 */
public interface RemoteTaskList extends Remote{
    <T> int addTask(Task<T> task) throws RemoteException;
    <T> Task<T> getTask(int index) throws RemoteException;
}
