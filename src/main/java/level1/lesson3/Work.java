package level1.lesson3;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        two();
        three();
        four();
        five(9, 3);
        int[] arr1 = {3, 9, 12, 24, 33, 54, 85, 92};
        six(arr1);
        seven ();



        //Задать целочисленный массив, состоящий из
        // элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
        // цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.println(arr[i]);
        }
    }

    //2. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями
// 1 2 3 4 5 6 7 8 … 100;
    public static void two() {

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }


    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void three() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = arr.length;

        for (int i = 0; i < maxMas; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
    }


    //4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с
// помощью цикла(-ов) заполнить его диагональные элементы
// единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему
// принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void four() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    // 5. Написать метод, принимающий на вход два аргумента:
// len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;
    public static void five(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    //6. * Задать одномерный массив и найти в нем минимальный
    // и максимальный элементы ;
    public static void six(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            else if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        }
        //7. ** Написать метод, в который передается не пустой
    // одномерный целочисленный массив, метод должен вернуть
    // true, если в массиве есть место, в котором сумма левой
    // и правой части массива равны.
        public static void seven() {

            int[] mass = new int [12];

            for (int i=0; i <12; i ++) {
                if (i == 0) {
                    mass[0] = 6;
                }
                if (i == 1) {
                    mass[1] = 4;
                }
                if (i == 2) {
                    mass[2] = 2;
                }
                if (i == 3) {
                    mass[3] = 1;
                }
                if (i == 4)
                {
                    mass[4] = 10;
                }
                if (i == 5) {
                    mass[5] = 1;
                }
                int p;
                int q;
                p = mass [0] + mass[1] + mass [2];
                q = mass [3] + mass [4] + mass [5];
                switch (p-q) {
                    case 0:
                        System.out.println("true");
                        break;
                    case 1:
                        System.out.println("false");
                        break;
                    case -1:
                        System.out.println("OMG - false");
                        break;
                }
            }

        }
}
















