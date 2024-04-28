package com.yk1;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверка. Палиндром, не палиндром.");
        System.out.print("Введите слово, фразу, или строку: ");
        String str = scanner.nextLine();

        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));
    }
}


/*

Задача *:
Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом.
 */
