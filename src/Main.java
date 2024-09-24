import Menu.*;
import Sorting.ArraysController;
import Sorting.CombSort;

public class Main {
    public static void main(String[] args) {

        CombSort sorter = new CombSort(null, null);
        ArraysController arraysController = new ArraysController(sorter);
        Menu menu = new Menu();

        menu.addOption(new InputArrayOption(sorter));
        menu.addOption(new SortArrayOption(sorter));
        menu.addOption(new SaveArrayOption(arraysController));
        menu.addOption(new PrintArraysOption(arraysController));
        menu.addOption(new ExitOption());

        menu.display();
    }
}