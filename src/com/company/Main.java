package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your day: ");
        try {
            Week day = Week.valueOf(scanner.nextLine());
            switch (day) {
                case MONDAY -> System.out.println("Дүйшөмбү күнү теоретикалык Жава окуйм");
                case TUESDAY -> System.out.println("Шейшемби күнү англис тилин  жана практикалык Жава окуйм");
                case WEDNESDAY -> System.out.println("Шаршемби күнү теоретикалык Жава окуйм");
                case THURSDAY -> System.out.println("Бейшемби күнү СофтСкиллс сабагын жана практикалык Жава окуйм");
                case FRIDAY -> System.out.println("Шаршемби күнү теоретикалык Жава окуйм");
                case SATURDAY -> System.out.println("Өз алдынча практикалык Жава окуйм");
                case SUNDAY -> System.out.println("Эс алуу күнү, бирок кайдагы эс алуу өз алдынча практикалык Жава окуш керек");
            }
        } catch (Exception e) {
            System.out.println("You write Wrong day!!!");
        }
    }
}