package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");

        int a = in.nextInt();
        int b = 3;
        int c = a % b;

        if(c==0) {
            System.out.println("True :)");
        }
        else {
            System.out.println("False!!!");
        }
    }
}
