package rmi.server;

import rmi.server.interfaces.RemoteTask;
import rmi.server.interfaces.RemoteTaskImpl;

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
            String name = "Compute";

            RemoteTask engine = new RemoteTaskImpl();
            RemoteTask stub = (RemoteTask) UnicastRemoteObject.exportObject(engine, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind(name, stub);

            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }
}
