package rmi.server.implementation;

import rmi.server.interfaces.RemoteTaskList;
import rmi.server.interfaces.Task;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwin on 10/18/2015.
 */
public class RemoteTaskListImpl implements RemoteTaskList {
    List<Task> tasks;

    public RemoteTaskListImpl(){
        tasks = new ArrayList<Task>();
    }

    public <T> int addTask(Task<T> task) {
        if(task != null) tasks.add(task);
        return tasks.size();
    }

    public <T> Task<T> getTask(int index){
        if(index < tasks.size())
            return tasks.get(index);

        return null;
    }
}
