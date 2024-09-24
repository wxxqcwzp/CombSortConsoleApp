package Sorting;

import Utils.Input;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ArraysController {

    private final CombSort sorter;

    public ArraysController(CombSort sorter) {
        this.sorter = sorter;
    }

    public void printArrays() {
        System.out.println(Arrays.toString(sorter.getUnsorted()));
        System.out.println(Arrays.toString(sorter.getSorted()));
    }

    /**
     * Сохранение в выхоной файл формата csv посредствам метода append из класса FileWriter
     *
     * @param filePath строковый путь к файлу
     */
    public void saveArrays(String filePath) {

        if (!sorter.getIsSorted()) {
            System.err.println("Сначала нужно отсортировать массив");
            return;
        }

        if (Input.getInt("Такой файл уже существует\nПерезаписать?(Нет - 0/Да - 1):", 0, 1) == 0) return;

        try (FileWriter writer = new FileWriter(filePath)) {

            writer.append(Arrays.toString(sorter.getUnsorted()));
            writer.append(";");
            writer.append(Arrays.toString(sorter.getSorted()));
            writer.append("\n");

            System.out.println("Данные сохранены");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}



