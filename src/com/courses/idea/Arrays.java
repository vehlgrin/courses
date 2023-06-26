package com.courses.idea;

public class Arrays {
    public static void main(String[] args) {

        int[] arrayFirst = new int[] {1,2,3,4,5};
        int buf = arrayFirst[0];
        arrayFirst[0] = arrayFirst[arrayFirst.length-1];
        arrayFirst[arrayFirst.length-1] = buf;
        /*for (int i = 0; i < arrayFirst.length; i++) {
            System.out.println(arrayFirst[i]);
        }*/
        System.out.println(arrayFirst[0]+arrayFirst[2]);
    }
}
