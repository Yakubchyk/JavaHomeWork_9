package com.yk1;

import java.util.Arrays;
import java.util.Scanner;

public class StrClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("1. Ищем самую коробкую и самую длинную строку.");
        System.out.println("  Введите три строки:");
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();
        String thirdStr = scanner.nextLine();

        String shortStr = firstStr;
        if (secondStr.length() < shortStr.length()) {
            shortStr = secondStr;
        }
        if (thirdStr.length() < shortStr.length()) {
            shortStr = thirdStr;
        }

        String longString = firstStr;
        if (secondStr.length() > longString.length()) {
            longString = secondStr;
        }
        if (thirdStr.length() > longString.length()) {
            longString = thirdStr;
        }

        System.out.println("Самая короткая строка: " + shortStr + ", ее длина: " + shortStr.length());
        System.out.println("Самая длинная строка: " + longString + ", ее длина: " + longString.length());

        System.out.println();
        System.out.println("2. Выводим строки в порядке возрастания длинны. ");

        String[] midlArr = new String[3];
        midlArr[0] = firstStr;
        midlArr[1] = secondStr;
        midlArr[2] = thirdStr;

        Arrays.sort(midlArr);
        for (String str : midlArr) {
            System.out.println(str + " ");
        }

        System.out.println();
        System.out.println("3. Выводим строки те , что меньше средней. ");

        System.out.println(shortStr + " ее длинна " + shortStr.length());

        System.out.println();
        System.out.println("4. Найти слово, состоящее из различных символов.");
        System.out.printf("Первая строка содержит следующие символы включая пробелы:  ");
        int ch1 = 0;
        char[] firstChar = firstStr.toCharArray();
        for (int i = 0; i < firstChar.length; i++) {
            if (Character.isLetter(firstChar[i])) {

            } else {
                ch1++;
                System.out.print(firstChar[i] + " ,");
            }
        }
        System.out.println("Количество символов:" + ch1);

        System.out.printf("Вторая строка содержит следующие символы включая пробелы:  ");
        int ch2 = 0;
        char[] secondChar = secondStr.toCharArray();
        for (int i = 0; i < secondChar.length; i++) {
            if (Character.isLetter(secondChar[i])) {

            } else {

                ch2++;
                System.out.print(secondChar[i] + " ,");
            }
        }
        System.out.println("Количество символов: " + ch2);

        System.out.printf("Третья строка содержит следующие символы включая пробелы:  ");
        int ch3 = 0;
        char[] thirdChar = thirdStr.toCharArray();
        for (int i = 0; i < thirdChar.length; i++) {
            if (Character.isLetter(thirdChar[i])) {

            } else {
                ch3++;
                System.out.print(thirdChar[i] + " ,");
            }
        }
        System.out.println("Количество символов: " + ch3);

        System.out.println();
        System.out.println("5. Выводим строку с дублирующими символами. ");
        System.out.println("Введите строку: ");
        String inputUser = scanner.nextLine();

        String duplicatedString = dobleLetters(inputUser);

        System.out.println("Новая строка с задублированными буквами: " + duplicatedString);
    }

    public static String dobleLetters(String inputUser) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputUser.length(); i++) {
            char currChar = inputUser.charAt(i);
            result.append(currChar).append(currChar);
        }

        return result.toString();
    }
}



/*
Блок 2. Домашнее задание
1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.
2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины.
3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.
4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".

 */
