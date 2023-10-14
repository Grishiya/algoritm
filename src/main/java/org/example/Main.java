package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private IntegerListService integerListService;
    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }
    private static void sortInsertion(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }
    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }
    public static boolean contains(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public Main(IntegerListService integerListService) {
        this.integerListService = integerListService;
    }
    private static boolean binarySearch(Integer[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
    public static int[] generateRandomArray() {
        int size = 100000; // Размерность массива

        // Верхняя граница рандомных чисел, не включая 100
        int upperBound = 1000000;
        int[] array = new int[size]; // Создаем массив с заданной размерностью

        Random random = new Random(); // Создаем объект для генерирования рандомных чисел

        IntStream.range(0, size) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(upperBound));
        return array;
    }
    public static int[] generateRandomArray2() {
        int size = 100000; // Размерность массива

        // Верхняя граница рандомных чисел, не включая 100
        int upperBound = 1000000;
        int[] array = new int[size]; // Создаем массив с заданной размерностью

        Random random = new Random(); // Создаем объект для генерирования рандомных чисел

        IntStream.range(0, size) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(upperBound));
        return array;
    }
    public static int[] generateRandomArray3() {
        int size = 100000; // Размерность массива

        // Верхняя граница рандомных чисел, не включая 100
        int upperBound = 1000000;
        int[] array = new int[size]; // Создаем массив с заданной размерностью

        Random random = new Random(); // Создаем объект для генерирования рандомных чисел

        IntStream.range(0, size) // С помощью стрима проходим по всему массиву
                // Заносим рандомное число в ячейку массива
                // Рандомные значения могут быть в диапазоне от 0 до 99 включительно
                .forEach(index -> array[index] = random.nextInt(upperBound));
        return array;
    }


    static void task3() {
        long start = System.currentTimeMillis();
        sortSelection(generateRandomArray3());
        System.out.println(System.currentTimeMillis()-start);
    }

   static void task1() {
        long start = System.currentTimeMillis();
        sortBubble(generateRandomArray());
        System.out.println(System.currentTimeMillis() - start);
    }

   static void task2() {
        long start = System.currentTimeMillis();
        sortInsertion(generateRandomArray2());
        System.out.println(System.currentTimeMillis() - start);
    }





    public static void main(String[] args) {


task1();
task2();
task3();


    }

}