package com.courses.idea;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x");
        int x = in.nextInt();
        System.out.println("Input y");
        int y = in.nextInt();
        System.out.println("Input z");
        int z = in.nextInt();
        double average  = (x + y + z)/3.0;
        System.out.printf("Average = %.2f \n",average);
        double res = Math.floor(average/2.0);
        //System.out.println(res);
        if (res > 3)
            {System.out.println("Программа выполнена корректно");
            }
    }
}
