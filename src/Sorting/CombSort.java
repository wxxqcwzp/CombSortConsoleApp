package Sorting;

public class CombSort {

    private double[] unsorted;
    private double[] sorted;
    private SortOrder sortOrder;
    private boolean isSorted;

    // Конструктор инициализирует исходный массив и порядок сортировки
    public CombSort(double[] unsorted, SortOrder sortOrder) {
        this.unsorted = unsorted;
        this.sortOrder = sortOrder;
        isSorted = false;
    }

    // Основной метод сортировки
    public double[] sort() {

        // Проверка, что исходный массив не пуст
        if (unsorted == null) {
            System.err.println("Сначала нужно ввести массив");
            return null;
        } else {
            sorted = unsorted.clone();  // Копирование исходного массива
        }

        int length = unsorted.length;
        int gap = length;
        boolean swapped = true;

        // Цикл продолжается, пока есть разрыв или произошли перестановки
        while (gap > 1 || swapped) {
            gap = (int) (gap / 1.247);
            if (gap < 1) {
                gap = 1;  // Минимальный разрыв — 1
            }

            swapped = false;

            // Сравнение и обмен элементов в зависимости от разрыва
            for (int i = 0, j = gap; j < length; i++, j++) {
                double comparison = sorted[i] - sorted[j];

                // Перестановка элементов в зависимости от порядка сортировки
                if ((sortOrder == SortOrder.ASCENDING && comparison > 0) ||
                        (sortOrder == SortOrder.DESCENDING && comparison < 0)) {
                    double temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                    swapped = true;  // Обозначаем, что произошла перестановка
                }
            }
        }

        isSorted = true;
        return sorted;  // Возвращаем отсортированный массив
    }

    // Установка нового массива
    public void setUnsorted(double[] unsorted) {
        this.unsorted = unsorted;
        isSorted = false;
    }

    public boolean getIsSorted() {
        return isSorted;
    }

    public double[] getUnsorted() {
        return unsorted;
    }

    public double[] getSorted() {
        return sorted;
    }

    // Установка нового порядка сортировки
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }
}
