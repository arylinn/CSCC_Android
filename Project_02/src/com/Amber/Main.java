package com.Amber;

import java.util.*;

/**
 * Created by Amber on 2/11/2016.
 */

public class Main {
    public static void main(String[] args) {
        TaskList todoList = new TaskList();
        todoList.start("Pick an Option");

        for(TaskList.Task task: todoList)
        {
            System.out.println(task);
        }
    }

}