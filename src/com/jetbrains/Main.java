package com.jetbrains;

import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	    String filename;
	    Scanner keyBoard = new Scanner(System.in);
        Scanner ScanFile = null;

        System.out.println("What file do you want to load?");

        filename = keyBoard.next();

        try {
            ScanFile = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
           System.out.println("File not found.");
           System.exit(0);
        }

//hello


    }
}
