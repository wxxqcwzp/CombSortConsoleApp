package Menu;

import java.awt.*;
import java.net.URI;

public class ExitOption implements MenuOption {

    @Override
    public void action() {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }


    @Override
    public String getDescription() {
        return "Выход";
    }
}
