package Menu;

import Utils.Input;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<MenuOption> options = new ArrayList<>();

    public void display() {

        while (true) {

            System.out.println("Меню:");

            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i).getDescription());
            }

            int choice = Input.getInt("Выберите опцию (1 - " + options.size() + "):", 1, options.size());

            options.get(choice - 1).action();

        }

    }

    public void addOption(MenuOption option) {
        options.add(option);
    }


}
