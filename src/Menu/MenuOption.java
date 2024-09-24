package Menu;

public interface MenuOption {


    /**
     * При вызове метода происходит выполнение команд из меню
     */
    void action();

    /**
     * При вызове метода происходит возвращение названия пункта меню
     */
    String getDescription();

}
