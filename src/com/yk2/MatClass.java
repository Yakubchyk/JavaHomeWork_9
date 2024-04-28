package com.yk2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatClass {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scaner.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Найдены абревиатуры: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
