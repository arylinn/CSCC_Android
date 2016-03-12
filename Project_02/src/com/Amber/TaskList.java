package com.Amber;

import java.lang.IndexOutOfBoundsException;
import java.lang.System;
import java.util.*;

/**
 * Created by Amber on 3/11/2016.
 */
public class TaskList {
    private Scanner scanner = new Scanner(System.in);

    private List<Task> tasks = new ArrayList<Task>();

    public void start(String message) {
        String choice = "";

        while (!choice.equals("0")) {
            System.out.println(message);
            System.out.println("(1)Add A Task");
            System.out.println("(2)Remove A Task");
            System.out.println("(3)Update A Task");
            System.out.println("(4)List All Tasks");
            System.out.println("(5)List All Tasks of a Certain Priority");
            System.out.println("(0)Exit");
            choice = scanner.nextLine();
            switch (choice) {
                case ("1"):
                    addTask();
                    break;
                case "2":
                    delete();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    showList();
                    break;
                case "5":
                    listByPriority();
                case "0":
                    break;
                default:
                    System.out.println(choice + " is not an option. ");
            }
        }
    }

    public void addTask() {
        System.out.println("Enter the tasks name");
        String name = scanner.nextLine();

        System.out.println("Enter Description");
        String description = scanner.nextLine();

        System.out.println("Enter priority, 0 - 5 (0 being lowest, 5 being highest)");
        String choice = scanner.nextLine();
        int priority = Integer.parseInt(choice);

        Task task = new Task(name, description, priority);
        tasks.add(task);
        System.out.println("Task has been added");
    }

    public void update() {
        Task task = null;
        showList();
        while(task == null){
            System.out.println("Enter the index of task to update");
            String pick = scanner.nextLine();
            int index = Integer.parseInt(pick);

            try {
                task = tasks.get(index);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Invalid index");
            }
        }

        System.out.println("Enter the name of the task");
        String name = scanner.nextLine();

        System.out.println("Enter the description of the task");
        String description = scanner.nextLine();

        Integer priority = null;
        while(priority == null) {
            System.out.println("Enter the priority of the task, 0 - 5 (0 being lowest, 5 being highest)");
            String choice = scanner.nextLine();
            priority = Integer.parseInt(choice);
            if(priority < 0 || priority > 5) {
                priority = null;
            }
        }

        task.setName(name);
        task.setDescription(description);
        task.setPriority(priority);

        System.out.println("Task has been updates");
    }

    public void delete() {
        boolean repeat = true;
        showList();
        while(repeat) {
            System.out.println("Enter the index of task to be deleted");
            String choice = scanner.nextLine();
            int index = Integer.parseInt(choice);

            try {
                tasks.remove(index);
                repeat = false;
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Invalid index");
            }
        }

        System.out.println("Task has been deleted");
    }

    public void showList() {
        tasks.forEach(task -> printTask(task));
    }

    public void listByPriority() {
        System.out.println("Enter A Priority To View The Tasks");
        String option = scanner.nextLine();
        int priority = Integer.parseInt(option);

        for(Task task: tasks){
            if(task.getPriority() == priority) {
                printTask(task);
            }
        }
    }

    private void printTask(Task task) {
        System.out.println(
                "Name: " + task.getName() +
                        "\tDescription: " + task.getDescription() +
                        "\tPriority" + task.getPriority());
    }

    private class Task {

        private String name;

        private String description;

        private Integer priority;

        public Task(String name, String description, Integer priority){
            this.name = name;
            this.description = description;
            this.priority = priority;
        }

        public Integer getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }
    }

}