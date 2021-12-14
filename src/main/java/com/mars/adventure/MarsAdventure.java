package com.mars.adventure;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MarsAdventure {
    static Scanner scanner = new Scanner(System.in);
    public static String name;
    static String excited;
    static int suitcases;
    static int ALLOWED_SUITCASES = 2;
    static int MIN_SUITCASES = 1;
    static String companionAnimal;
    static String companionName;
    static String decor;
    static String decorSelection;

    public static void main(String[] args) {
        intro();
        askName();
        askExcited();
        askSuitcases();
        askCompanion();
        askDecor();
        outro();
    }

    private static void outro() {
        System.out.printf("I can see it now:%n" +
                "%s and %s surfing the celestial abyss ...%n" +
                "in a %s spaceship.%n" +
                "%s -- the day is here!%n" +
                "You crawl into the spaceship with %s.%n" +
                "Brace for take off!%n" +
                "5 ...%n" +
                "4 ...%n" +
                "3 ...%n" +
                "2 ...%n" +
                "1 ...%n" +
                "* Liftoff *%n", name, companionName, decor, name, companionName);
    }

    private static void askDecor() {
        List<String> availableDecor = new ArrayList<>();
        availableDecor.add(" A - Sleek, modern minimalism");
        availableDecor.add(" B - Retro/vintage space age");
        availableDecor.add(" C - SF Hippie chic");

        System.out.println("NASA has an interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship");
        System.out.println("");
        System.out.println("Your options are:");

        availableDecor.forEach(System.out::println);

        System.out.println("");
        System.out.println("Which decor would you like? Choose A, B, or C");

        while(true) {
            decorSelection = scanner.nextLine().toUpperCase();
            if (decorSelection.equals("A")) {
                decor = "sleek";
                break;
            }
            else if (decorSelection.equals("B")) {
                decor = "retro";
                break;
            }
            else if (decorSelection.equals("C")) {
                decor = "stinky";
                break;
            }
            else {
                System.out.println("wut? Choose A, B, or C");
            }
        }
        System.out.println("");

    }

    private static void askCompanion() {
        System.out.println("You're allowed to bring one companion animal with you.");
        System.out.println("What kind of companion animal would you like to bring?");
        companionAnimal = scanner.nextLine();
        System.out.println("What is your companion's name?");
        companionName = scanner.nextLine();
        System.out.printf("Cool, so you're bringing %s the %s%n", companionName, companionAnimal);
        System.out.println("");
    }

    private static void askSuitcases() {
        System.out.println("It's time to pack for your trip to Mars.");
        System.out.println("How many suitcases do you plan to bring?");
        while (true) {
            suitcases = scanner.nextInt();
            //nextInt keeps the scanner open, so we call nextLine() to close it.
            scanner.nextLine();
            if (suitcases > ALLOWED_SUITCASES) {
                System.out.println("Calm down. No more than " + ALLOWED_SUITCASES + " suitcases.");
            }
            else if (suitcases < MIN_SUITCASES) {
                System.out.println("C'mon cheap guy. You need at least " + MIN_SUITCASES + " suitcase!");
            }
            else {
                System.out.println("Perfect");
                System.out.println("");
                break;
            }
        }
    }

    private static void askExcited() {
        System.out.println("Are you excited? Type Y or N");
        while (true) {
            excited = scanner.nextLine().toUpperCase();
            if (excited.equals("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
                System.out.println("");
                break;
            }
            else if (excited.equals("N")) {
                System.out.println("C'mon you're excited. You're excited!");
                System.out.println("");
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
        System.out.println("");
    }

    private static void intro() {
        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("");
    }

}
