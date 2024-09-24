package Utils;

import java.nio.file.Files;
import java.nio.file.Path;

public class Validation {

    public static boolean isValidInt(String num, int low, int high) {

        int input;

        if (num == null || num.isEmpty()) return false;

        num = num.trim();

        try {
            input = Integer.parseInt(num);
            return input >= low && input <= high;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean isValidDouble(String num, double low, double high) {

        double input;

        if (num == null || num.isEmpty()) return false;

        num = num.trim();

        try {
            input = Double.parseDouble(num);
            return !(input < low) && !(input > high);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidFilePath(String filePath) {

        if (filePath == null || filePath.isEmpty()) return false;

        filePath = filePath.trim();

        Path path = Path.of(filePath);

        if(!Files.exists(path)) return false;

        if(!Files.isRegularFile(path)) return false;

        if(!Files.isReadable(path)) return false;

        if(!filePath.endsWith(".csv")) return false;

        return true;

    }

}
