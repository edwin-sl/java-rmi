package rmi.server;

import rmi.server.implementation.RemoteTaskListImpl;
import rmi.server.interfaces.RemoteTask;
import rmi.server.implementation.RemoteTaskImpl;
import rmi.server.interfaces.RemoteTaskList;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by edwin on 10/18/2015.
 */
public class Server {
    public static void main(String[] args) {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            Registry registry = LocateRegistry.createRegistry(1099);

            RemoteTask engine = new RemoteTaskImpl();
            RemoteTask stub = (RemoteTask) UnicastRemoteObject.exportObject(engine, 0);
            registry.bind("Compute", stub);

            RemoteTaskList taskList = new RemoteTaskListImpl();
            RemoteTaskList stubList = (RemoteTaskList) UnicastRemoteObject.exportObject(taskList, 0);
            registry.bind("TaskList", stubList);

            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }
}
