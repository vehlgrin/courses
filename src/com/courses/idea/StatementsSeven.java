package com.courses.idea;

import java.util.Scanner;

public class StatementsSeven {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите данные массива:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {

            if (arr[i] == x || arr[i] == y || arr[i] == z)
            {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
