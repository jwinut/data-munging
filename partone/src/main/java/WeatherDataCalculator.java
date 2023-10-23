import java.util.ArrayList;

public class WeatherDataCalculator {
    private final WeatherData weatherData;

    public WeatherDataCalculator() {
        WeatherFileReader fileReader = new WeatherFileReader();
        fileReader.read();
        String[] readLines = fileReader.getLines();
        weatherData = new WeatherData(readLines);
    }

    public int calTempSpreadDy(int dy) {
        return weatherData.getMxT(dy) - weatherData.getMnT(dy);
    }

    public ArrayList<Integer> getSpreadList() {
        ArrayList<Integer> spreadList = new ArrayList<>();
        for(int i = 0; i < 30; ++i) spreadList.add(0);
        return spreadList;
    }
}

