package rmi.client;

import rmi.server.interfaces.RemoteTask;
import rmi.server.interfaces.RemoteTaskList;
import rmi.server.interfaces.Task;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by edwin on 10/18/2015.
 */
public class Client {
    public static void main(String args[]) {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            Pi pi = new Pi(10);
            Suma s = new Suma();

            RemoteTaskList taskList = (RemoteTaskList) registry.lookup("TaskList");
//            taskList.addTask(s);
//            taskList.addTask(pi);

            RemoteTask comp = (RemoteTask) registry.lookup("Compute");

            Task<Float> t = taskList.getTask(0);
            Task<BigDecimal> p = taskList.getTask(1);
            Object f = comp.executeTask(t, 9f, 5f);
            Object pie = comp.executeTask(p);

            System.out.println("Sumaasdfasdfa " + f);
            System.out.println("PIE " + pie);

        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }
}
