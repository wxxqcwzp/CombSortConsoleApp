package Menu;

import Sorting.CombSort;
import Utils.Input;

public class SortArrayOption implements MenuOption {

    private final CombSort sorter;

    public SortArrayOption(CombSort sorter) {
        this.sorter = sorter;

    }

    @Override
    public void action() {
        sorter.setSortOrder(Input.getSortOrder("Введите порядок сортировки(ASC - 0/ DESC - 1):"));
        sorter.sort();

    }

    @Override
    public String getDescription() {
        return "Отсортировать массив";
    }
}
