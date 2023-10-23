import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    String[] lines;

    public WeatherData(String[] lines) {
        this.lines = lines;
    }

    public String getPDir(String dy) {
        int index = 1;
        try {
            index += Integer.parseInt(dy);
        } catch (Exception e) {
            index = -1;
        }
        return lines[index].substring(54, 58).trim();
    }

    public List<String> getAllDy() {
        ArrayList<String> allDy = new ArrayList<String>();
        for (String line : lines) {
            if (line.length() > 6) line = line.substring(0, 5).trim();
            allDy.add(line);
        }
        return allDy;
    }

    public int getMxT(int dy) {
        int dyRowIndex = 1 + dy;
        String maxTemp = lines[dyRowIndex].substring(5, 9).trim().replace("*", "");
        return Integer.parseInt(maxTemp);
    }

    public int getMnT(int dy) {
        int dyRowIndex = 1 + dy;
        String minTemp = lines[dyRowIndex].substring(11, 15).trim().replace("*", "");
        return Integer.parseInt(minTemp);
    }
}
