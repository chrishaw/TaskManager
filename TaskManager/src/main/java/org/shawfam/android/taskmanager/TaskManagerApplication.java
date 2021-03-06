package org.shawfam.android.taskmanager;

import android.app.Application;

import org.shawfam.android.taskmanager.tasks.Task;

import java.util.ArrayList;

/**
 * Created by Chris Shaw on 6/13/13.
 */
public class TaskManagerApplication extends Application {
    private ArrayList<Task> currentTasks;

    @Override
    public void onCreate() {
        super.onCreate();
        if (null == currentTasks) {
            currentTasks = new ArrayList<Task>();
        }
    }

    public void setCurrentTasks(ArrayList<Task> currentTasks) {
        this.currentTasks = currentTasks;
    }

    public ArrayList<Task> getCurrentTasks() {
        return currentTasks;
    }

    public void addTask(Task t) {
        assert(null != t);
        if (null == currentTasks) {
            currentTasks = new ArrayList<Task>();
        }
        currentTasks.add(t);
    }

}
