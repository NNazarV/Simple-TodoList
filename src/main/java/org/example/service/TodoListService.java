package org.example.service;




import org.example.model.TodoList;

public class TodoListService {
    private final TodoList todoList;

    public TodoListService() {
        todoList = new TodoList();
    }

    public void addTask(String task) {
        todoList.addTask(task);
    }

    public void removeTask(int index) {
        todoList.removeTask(index);
    }

    public void printTasks() {
        todoList.printTasks();
    }

//    public void loadTasks() {
//        todoList.loadTasksFromFile();
//    }

    public void saveTasks() {
        todoList.saveTasksToFile();
    }
}
//    public void loadTasksFromFile() {
//        try {
//            File file = new File(fileName);
//            if (!file.exists()) {
//                file.createNewFile();
//                return;
//            }
//            Scanner scanner = new Scanner(file);
//            String jsonString = "";
//            while (scanner.hasNextLine()) {
//                jsonString += scanner.nextLine();
//            }
//            scanner.close();
//            todoList.getTasks().put(new JSONArray(jsonString));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveTasksToFile() {
//        try {
//            FileWriter fileWriter = new FileWriter(fileName);
//            fileWriter.write(todoList.getTasks().toString());
//            fileWriter.flush();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

