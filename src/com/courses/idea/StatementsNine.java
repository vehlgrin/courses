package com.courses.idea;

import java.util.Scanner;

public class StatementsNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        double arr[] = new double[size];
        System.out.println("Введите данные массива:");
        double average = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        average = sum / size;

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] * average);
        }
    }
}
