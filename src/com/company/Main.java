package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        Scanner scanner3= new Scanner(System.in);
        Scanner scanner4= new Scanner(System.in);
        Scanner scanner5= new Scanner(System.in);
        Info info= new Info();
        System.out.println("enter your firsname : ");
        info.setFname(scanner1.nextLine());
        System.out.println("enter your last name : ");
        info.setLname(scanner2.nextLine());
        System.out.println("enter your address : ");
        info.setAddress(scanner3.nextLine());
        System.out.println("enter your password : ");
        info.setPassword(scanner4.nextLine());
        System.out.println("enter your email address : ");
        info.setEmail(scanner5.nextLine());
        System.out.println(info.getFname());
        System.out.println(info.getLname());
        System.out.println(info.getAddress());
        System.out.println(info.getPassword());
        System.out.println(info.getEmail());


    }
}
