package com.Amber;

import java.util.*;

/**
 * Created by Amber on 3/11/2016.
 */
public class Task {
    private Scanner scanner = new Scanner(System.in);
    private List<String> tasks = new ArrayList<String>();
    private List<String> description = new ArrayList<String>();
    private List<Integer> priority = new ArrayList<Integer>();


    public void start(String message)
    {
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
                    System.out.println(choice + " is not an integer. ");
                }
            }
        }
    public void addTask() {
        System.out.println("Enter the tasks name");
        String name = scanner.nextLine();
        tasks.add(name);
        System.out.println("Enter Description");
        String descript = scanner.nextLine();
        description.add(descript);
        System.out.println("Enter priority, 0 - 5 (0 being lowest, 5 being highest)");
        String choice = scanner.nextLine();
        int x = Integer.parseInt(choice);
        priority.add(x);

        System.out.println("Task has been added");

    }

    public void update() {
        showList();
        System.out.println("Enter the index of task to update");
        String pick = scanner.nextLine();
        int i = Integer.parseInt(pick);

        System.out.println("Enter the name of the new task");
        String NewTask = scanner.nextLine();
        System.out.println("Enter the description of the new task");
        String NewDescription = scanner.nextLine();
        System.out.println("Enter the priority of the new task, 0 - 5 (0 being lowest, 5 being highest)");
        String NewPriority = scanner.nextLine();
        int j = Integer.parseInt(NewPriority);

        tasks.set(i, NewTask);
        description.set(i, NewDescription);
        priority.set(i, j);

        System.out.println("Task has been updates");
    }

    public void delete() {
        showList();
        System.out.println("Enter the index of task to be deleted");
        String choice = scanner.nextLine();
        int j = Integer.parseInt(choice);

        tasks.remove(j);

        System.out.println("Task has been deleted");
    }

    public void showList() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("(" + i + ") Task Name, Description, Priority: " + tasks.get(i)
                    + " ,  " + description.get(i) + " , " + priority.get(i) + ".");
        }
    }

    public void listByPriority()
    {
        System.out.println("Enter A Priority To View The Tasks");
        String option = scanner.nextLine();
        int x = Integer.parseInt(option);

        for (int i = 0; i < tasks.size(); i++)
        {
            if(x == 0)
            {
                System.out.println("(" + i + ") Task Name, Description, Priority: " + tasks.get(i)
                        + " ,  " + description.get(i) + " , " + priority.get(i) + ".");
            }
        }

    }

}