package org.example.controller;


import java.util.Scanner;

import org.example.service.TodoListService;

public class TodoListController {
    private TodoListService todoListService;
    private Scanner scanner;

    public TodoListController() {
        todoListService = new TodoListService();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Enter a command\n 1)add\n 2)remove\n 3)list\n 4)quit");
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    todoListService.addTask(task);
                    break;
                case "2":
                    todoListService.printTasks();
                    System.out.print("Enter task number: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        todoListService.removeTask(index - 1);
                        System.out.println("Task removed");
                        todoListService.printTasks();
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid index");
                    }
                    break;
                case "3":
                    todoListService.printTasks();
                    break;
                case "4":
                    todoListService.saveTasks();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}

