package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by edwin on 10/14/2015.
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
