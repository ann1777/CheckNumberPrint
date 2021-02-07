package com.example.NumberPrint;
import java.util.Scanner;

public class HelloResource {

    private static String check(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Это число < 0");
        } else if (a <= 17) {
            return "Это число от 0 до 17";
        } else if (a <= 65) {
            return "Это число от 18 до 65";
        } else {
            return "Это число > 65";
        }
    }

    public static void main(String[] args) {
        System.out.println("Для определения диапазона введите число, нажмите <Enter>. Для останова введите stop.");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if ("stop".equalsIgnoreCase(input)) {
                System.exit(0);
            }
            try {
                int i = Integer.parseInt(input);
                System.out.println(check(i) + "");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "");
            }
        }
    }
}