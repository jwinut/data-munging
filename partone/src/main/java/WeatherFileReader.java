import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WeatherFileReader {
    String[] lines;
    public void read() {
        try {
            this.lines = Files.readAllLines(new File("/Users/nut/codekata/04-data-munging/weather.dat").toPath()).toArray(new String[0]);
        } catch (IOException e) {
            lines[0] = "File not found";
        }
    }

    public String[] getLines() {
        return lines;
    }
}
