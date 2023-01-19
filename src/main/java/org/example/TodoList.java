package org.example;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void printTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

}
