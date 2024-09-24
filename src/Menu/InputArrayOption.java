package Menu;

import Sorting.CombSort;
import Utils.Input;

public class InputArrayOption implements MenuOption {

    private final int MANUAL = 0;
    private final int RANDOM = 1;


    private final CombSort sorter;

    public InputArrayOption(CombSort sorter) {
        this.sorter = sorter;
    }

    @Override
    public void action() {


        switch (Input.getInt("Выберите тип ввода\nРучной - 0/Случайными числами - 1:", 0, 1)) {
            case MANUAL:
                sorter.setUnsorted(Input.getDoubleArray("", -100, 100));
                break;
            case RANDOM:
                int size = Input.getInt("Введите длинну массива:", 1, 50);
                int min = Input.getInt("Введите минимально возможное значение:", -100, 99);
                int max = Input.getInt("Введите максимально возможное значение значение", min, 100);
                sorter.setUnsorted(Input.getRandomArray(size, min, max));
                break;
        }

    }

    @Override
    public String getDescription() {
        return "Ввести массив";
    }
}

