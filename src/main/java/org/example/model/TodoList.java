package org.example.model;

import org.json.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TodoList {
    private JSONArray tasks;
    private final String fileName = "tasks.json";

    public TodoList() {
        tasks = new JSONArray();
        loadTasksFromFile();
    }

    public void addTask(String task) {
        tasks.put(task);
        saveTasksToFile();
    }

    public void removeTask(int index) {
        tasks.remove(index);
        saveTasksToFile();
    }

    public JSONArray getTasks() {
        return tasks;
    }

    public void printTasks() {
        for (int i = 0; i < tasks.length(); i++) {
            System.out.println((i+1) + ". " + tasks.getString(i));
        }
    }

    public void loadTasksFromFile() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
                return;
            }
            Scanner scanner = new Scanner(file);
            String jsonString = "";
            while (scanner.hasNextLine()) {
                jsonString += scanner.nextLine();
            }
            scanner.close();
            JSONArray tasksFromFile = new JSONArray(jsonString);
            for (int i = 0; i < tasksFromFile.length(); i++) {
                tasks.put(tasksFromFile.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTasksToFile() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(tasks.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
