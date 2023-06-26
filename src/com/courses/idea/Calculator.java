package com.courses.idea;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result: "+result);
    }

    public static int getInt(){
        System.out.println("Input number:");
        return scanner.nextInt();
    }

    public static char getOperation(){
        System.out.println("Input operation:");
        return scanner.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Something wrong with operators, check and input again.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
