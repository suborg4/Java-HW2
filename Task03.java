package org.example.hw03;

import java.util.Arrays;
import java.util.Scanner;

/*
Дан массив целых чисел. 
Заменить отрицательные элементы на сумму индексов 
двузначных элементов массива
 */

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Размер массива: ");
        int length = userScan();
        int[] array = new int[length];
        int sumIndex = 0;
        System.out.println("Введите данные в массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = userScan();
            if ((array[i] > 9 && array[i] < 100) || (array[i] < -9 && array[i] > -100)) {
                sumIndex = sumIndex + i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sumIndex;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int userScan() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
