package com.mars.adventure;

import java.util.Scanner;

public class MarsAdventure {
    static Scanner scanner = new Scanner(System.in);
    public static String name;
    static String excited;
    int ALLOWED_SUITCASES = 2;
    String companionAnimal;
    String companionName;
    String decor;

    public static void main(String[] args) {
        intro();
        askName();
        askExcited();
    }

    private static void askExcited() {
        System.out.println("Are you excited? Type Y or N");
        while (true) {
            excited = scanner.nextLine().toUpperCase();
            if (excited.equals("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
                break;
            }
            else if (excited.equals("N")) {
                System.out.println("C'mon you're excited. You're excited!");
                break;
            }
            else
                System.out.println("wut? Type Y or N");
        }
    }

    private static void askName() {
        System.out.println("Hi there, What's your name?");
        name = scanner.nextLine();
        System.out.println("Hi, " + name + " --- Welcome to the Mars Adventure Game.");
        System.out.println("Yesterday, you received a call from your good friend at Nasa");
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen");
    }

    private static void intro() {
        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
    }

}
