package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Sorting.CombSort;
import Sorting.SortOrder;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CombSortTest {

    private double[] actual;
    private double[] expected;

    private static final int ARRAY_SIZE = 100;
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;

    private double getRandomNumber(int min, int max) {
        return ((Math.random() * (max - min)) + min);
    }

    private double[] getRandomArray(int size, int min, int max) {

        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = getRandomNumber(min, max);
        }

        return arr;

    }

    private void reverse(double[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        double tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    /**
     * Инициализирует случайный массив для каждого теста и сортирует его копию по возрастанию
     * для использования в качестве ожидаемого результата.
     */
    @BeforeEach
    public void setUp() {

        actual = getRandomArray(ARRAY_SIZE, MIN_VALUE, MAX_VALUE);

        expected = actual.clone();
        Arrays.sort(expected);

    }

    /**
     * Проверяет, правильно ли CombSort сортирует массив по возрастанию.
     * Сравнивает результат сортировки с ожидаемым отсортированным массивом.
     */
    @Test
    public void testSortAscending() {

        CombSort sorter = new CombSort(actual, SortOrder.ASCENDING);
        actual = sorter.sort();

        assertArrayEquals(expected, actual);

    }


    /**
     * Проверяет, правильно ли CombSort сортирует массив по убыванию.
     * Сравнивает результат сортировки с реверсированной версией ожидаемого массива.
     */
    @Test
    public void testSortDescending() {

        CombSort sorter = new CombSort(actual, SortOrder.DESCENDING);
        actual = sorter.sort();

        reverse(expected);

        assertArrayEquals(expected, actual);


    }

}

