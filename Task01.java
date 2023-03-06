package org.example.hw02;

import java.util.Scanner;

/*
Дана последовательность N целых чисел. 
Найти сумму простых чисел
 */

public class Task01 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Размер последовательности: ");
        int length = userScan();
        System.out.println("Введите последовательность: ");
        for (int i = 0; i < length; i++) {
            int numbers = userScan();
            if (PrimeNumbers(numbers)) {
                sum += numbers;
            }
        }
        System.out.println("Сумма простых чисел: " + sum);
    }



    public static boolean PrimeNumbers(int numbers) {
        if (numbers > 0) {
            for (int i = 2; i < numbers / 2; i++) {
                if (numbers % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
