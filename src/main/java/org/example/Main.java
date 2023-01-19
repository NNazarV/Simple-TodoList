package org.example;

import java.util.Scanner;

public class Main {
    private static String task;

    public static void main(String[] args) {
        TodoList myTasks = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command\n 1)add\n 2)remove\n 3)list\n 4)quit");
            String command = scanner.nextLine();

            switch (command) {
                case "1" -> {
                    System.out.println("Enter the task to add:");
                    String task = scanner.nextLine();
                    myTasks.addTask(task);
                }
                case "2" -> {
                    System.out.println("Enter the task to remove:");
                    task = scanner.nextLine();
                    myTasks.removeTask(task);
                }
                case "3" -> myTasks.printTasks();
                case "4" -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid command.");
            }
        }
    }
}



