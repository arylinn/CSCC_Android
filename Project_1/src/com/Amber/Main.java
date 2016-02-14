package com.Amber;

import java.util.*;

/**
 * Created by Amber on 2/11/2016.
 */

public class Main {

    private Scanner scanner = new Scanner(System.in);
    private List<String> tasks = new ArrayList<String>();

    public void start(){
        String choice = "";

        while (!choice.equals("0")) {
            System.out.println("Greetings, Pick An Option");
            System.out.println("(1)Add A Task");
            System.out.println("(2)Remove A Task");
            System.out.println("(3)Update A Task");
            System.out.println("(4)List All Tasks");
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
                default:
                    System.out.println("Sorry invalid option, please choose again.");

            }

            System.out.println("\n\n\n");
        }

        System.out.println("Have a good day!");
    }

    private void addTask() {
        System.out.println("Enter in the description of task");
        String description = scanner.nextLine();
        
        tasks.add(description);

        System.out.println("Task has been entered.");
    }

    private void update() {
        showList();
        System.out.println("Enter the index of task to update");
        String pick = scanner.nextLine();
        int i = Integer.parseInt(pick);

        System.out.println("Enter the description of task");
        String NewTask = scanner.nextLine();

        tasks.set(i, NewTask);

        System.out.println("Task has been updated");
    }

    private void delete() {
        System.out.println("Enter the index of task to be deleted");
        String choice = scanner.nextLine();
        int j = Integer.parseInt(choice);

        tasks.remove(j);

        System.out.println("Task has been removed");
    }

    private void showList() {
        for(int i=0; i<tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Main todoList = new Main();
        todoList.start();
    }

}