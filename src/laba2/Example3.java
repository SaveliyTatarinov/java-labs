package laba2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String encryptString = id.nextLine();

        System.out.println("Введите ключ: ");
        int shift = id.nextInt();

        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayNewChar = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayNewChar[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayNewChar);
        System.out.println("Текст после преобразования: " + encryptString);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        id.nextLine();

        while (true) {

            String answer = id.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                String decryptString = encryptString;

                char[] arrayChar1 = decryptString.toCharArray();
                long[] arrayInt1 = new long[arrayChar1.length];
                char[] arrayNewChar1 = new char[arrayChar1.length];

                for (int i = 0; i < arrayChar1.length; i++) {
                    arrayInt1[i] = arrayChar1[i] - shift;
                    arrayNewChar1[i] = (char) arrayInt1[i];
                }
                decryptString = new String(arrayNewChar1);
                System.out.println("Текст после обратного преобразования:" + decryptString);
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
