package com.courses.idea;

import java.util.Scanner;

public class StatementsTen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int row = input.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Введите данные для матрицы:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = input.nextInt();
            }
        }

        int row1 = 0;
        for (int col1 = 0; col1 < arr[row1].length; col1++) {
            System.out.print(arr[row1][col1] * 3 + " ");
        }

    }
}
