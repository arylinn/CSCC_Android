package com.Amber;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String pound = "#";
        String space = " ";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print(pound);

                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}
