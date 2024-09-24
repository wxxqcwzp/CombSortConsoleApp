package Utils;

import Sorting.SortOrder;

import java.util.Scanner;

public class Input {

    private static String getString(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getInt(String message, int low, int high) {

        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!Validation.isValidInt(input, low, high)) {
            System.err.println("Неверный ввод, попробуй еще раз:");
            input = sc.nextLine();
        }

        return Integer.parseInt(input);

    }

    public static double getDouble(String message, int low, int high) {

        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!Validation.isValidDouble(input, low, high)) {
            System.err.println("Неверный ввод, попробуй еще раз:");
            input = sc.nextLine();
        }

        return Double.parseDouble(input);

    }

    public static double[] getDoubleArray(String message, int low, int high) {

        System.out.println(message);

        int size = getInt("Введите размер массива", 1, 50);
        double[] doubles = new double[size];

        for (int i = 0; i < size; i++) {
            doubles[i] = getDouble("Введите " + (i + 1) + " элемент массива", low, high);
        }

        return doubles;
    }

    public static SortOrder getSortOrder(String message) {

        int input = Input.getInt(message, 0, 1);
        if (input == 0) return SortOrder.ASCENDING;
        return SortOrder.DESCENDING;

    }

    private static double getRandomNumber(int min, int max) {
        return ((Math.random() * (max - min)) + min);
    }

    public static double[] getRandomArray(int size, int max, int min) {
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomNumber(min, max);
        }

        return arr;

    }

    public static String getFilePath(String message) {

        String filePath = getString(message);

        while (!Validation.isValidFilePath(filePath)) {
            System.err.println("Неверный ввод, попробуй еще раз");
            filePath = getString(message);
        }
        return filePath;
    }
}
