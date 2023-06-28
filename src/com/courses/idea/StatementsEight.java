package com.courses.idea;

import java.util.Scanner;

public class StatementsEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int n = in.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += i;
        }
        System.out.println(result);
    }
}
