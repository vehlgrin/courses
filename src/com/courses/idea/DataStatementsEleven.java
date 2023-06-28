package com.courses.idea;

import java.util.Scanner;

public class DataStatementsEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String first  = input.nextLine();
        System.out.println("Введите второе число: ");
        int second = input.nextInt();

        if (Integer.parseInt(first) > second) {
            System.out.println(first);
            double d = second;
            System.out.println(d);
        }
        else {
            System.out.println(second);
            double d = Double.parseDouble(first);
            System.out.println(d);
        }
    }
}
