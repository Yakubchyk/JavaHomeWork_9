package com.yk3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String text = "Прошу рассмотреть мою заявку на должность оператор... Мой email: example@gmail.com. " +
                "Мой номер документа: 1234-5678-90. Мой номер телефона: +375(29)1234567. " +
                "Также, вот еще один номер документа: 9876-5432-10." +
                "Возможно, что номер будет недоступен. Для этого я прилагаю дополнительные контакты" +
                "Дополнительный номер телефона: +375(29)0120127" +
                "e-mail: ivan.ivanow@yahoo.com";


        docFinder(text);
        handyFinder(text);
        emailFinder(text);
    }


    private static void docFinder(String text) {
        Pattern pattern = Pattern.compile("\\d{4}\\W\\d{4}\\W\\d{2}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Номер договора: " + matcher.group());
        }

    }

    private static void handyFinder(String text) {
        Pattern pattern = Pattern.compile("\\W\\d{3}\\W\\d{2}\\W\\d{7}");//+375(29)1234567
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Тел.: " + matcher.group());
        }
    }

    private static void emailFinder(String text) {
        Pattern pattern = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("E-mail: " + matcher.group());
        }
    }

}


/*
Задача *:
Программа на вход получает произвольный текст. В этом тексте может быть номер
документа(один или несколько), емейл и номер телефона. Номер документа в формате:
xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
может содержать не всю информацию, т.е. например, может не содержать номер
телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
формате:
email: teachmeskills@gmail.com
document number: 1423-1512-51
и т.д
 */