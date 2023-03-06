package org.example.hw02;

import java.util.Scanner;

/*
Дана последовательность из N целых чисел. 
Верно ли, что последовательность является возрастающей
 */

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Размер последовательности: ");
        int length = userScan();
        System.out.println("Введите последовательность: ");
        int number01 = userScan();
        boolean flag = true;
        while (length > 0) {
            int number02 = userScan();
            if (number01 < number02) {
                number01 = number02;
                length--;
            } else {
                flag = false;
                length = 0;
            }
        }
        if (flag) {
            System.out.println("Последовательность возврастающая!");
        } else {
            System.out.println("Последовательно не возврастающая!");
        }
    }

    public static int userScan() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
