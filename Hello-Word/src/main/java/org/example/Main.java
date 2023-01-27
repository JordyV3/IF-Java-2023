package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = (int)(Math.random()*10+1);

        System.out.println("* * CENSUS 2023 * *");
        System.out.println("___________________");

        System.out.println("NAME");
        String name = sc.nextLine();

        System.out.println("SURNAME");
        String surname = sc.nextLine();

        System.out.println("AGE");
        Short age = Short.valueOf(sc.nextLine());

        System.out.println("ADDRESS");
        String address = sc.nextLine();

        System.out.println("DEPARTMENT");
        String department = sc.nextLine();

        System.out.println("PHONE");
        Integer phone = Integer.valueOf(sc.nextLine());

        System.out.println("E-MAIL");
        String email = sc.nextLine();


        System.out.println("* * * * * DATA 2023 * * * * *");
        System.out.println("_____________________________");
        System.out.println("ID: " + id);
        System.out.println("NAME: " +name);
        System.out.println("SURNAME: " +surname);
        System.out.println("AGE: " +age);
        System.out.println("ADDRESS: " +address);
        System.out.println("DEPARTMENT: " + department);
        System.out.println("PHONE: " + phone);
        System.out.println("E-MAIL: " +email);
        System.out.println("_____________________________");

    }
}