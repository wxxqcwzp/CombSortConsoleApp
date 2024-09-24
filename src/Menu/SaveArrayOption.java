package Menu;

import Sorting.ArraysController;
import Utils.Input;

public class SaveArrayOption implements MenuOption {

    private final ArraysController arraysController;

    public SaveArrayOption(ArraysController arraysController) {
        this.arraysController = arraysController;
    }

    @Override
    public void action() {
        arraysController.saveArrays(Input.getFilePath("Введите путь к файлу (формат csv):"));
    }

    @Override
    public String getDescription() {
        return "Сохранить массив";
    }
}
