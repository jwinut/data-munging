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

    public List<String> getAllDy(){
        ArrayList<String> allDy = new ArrayList<String>();
        for (String line: lines){
            if(line.length() > 6) line = line.substring(0, 5).trim();
            allDy.add(line);
        }
        return allDy;
    }
}
