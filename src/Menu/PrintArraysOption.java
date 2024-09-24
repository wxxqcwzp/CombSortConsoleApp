package Menu;

import Sorting.ArraysController;

public class PrintArraysOption implements MenuOption {

    private final ArraysController arraysController;

    public PrintArraysOption(ArraysController arraysController) {
        this.arraysController = arraysController;
    }

    @Override
    public void action() {
        arraysController.printArrays();
    }

    @Override
    public String getDescription() {
        return "Вывести массивы";
    }
}
