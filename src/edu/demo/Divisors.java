package edu.demo;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        int count = 0;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("Input a number: ");
        int nubmer = scannerNumber.nextInt();
        if(nubmer != 0) {

            for (int i = 1; i <= nubmer; i++) {
                if ((nubmer % i) == 0) {
                    count++;
                    System.out.print(i + " ");

                }
            }
            System.out.println();
            System.out.println("Number of dividers - " + count);
        }else System.out.println("Number must be greater than zero");
    }
}
