package com.courses.idea;

import java.util.Scanner;

public class CurrenciesConverter {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара:");
        double rate = in.nextDouble();
        System.out.println("Количество рублей:");
        int rouble = in.nextInt();
        double convert = rouble/rate;
        System.out.printf("Итого: %.2f долларов\n",convert);
    }
}
