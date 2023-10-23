import java.util.ArrayList;

public class WeatherDataCalculator {
    private final WeatherData weatherData;
    private ArrayList<Integer> spreadList;

    public WeatherDataCalculator() {
        spreadList = new ArrayList<>();
        weatherData = new WeatherData(readWeatherDataFile());
    }



    private String[] readWeatherDataFile(){
        WeatherFileReader fileReader = new WeatherFileReader();
        fileReader.read();
        return fileReader.getLines();
    }

    public static void main (String[] args){
        WeatherDataCalculator calculator = new WeatherDataCalculator();
        System.out.println(calculator.getSmallestTempSpread());
    }

    public int getSmallestTempSpread(){
        int smallestTemp = 9999999;
        for (int temp : getSpreadList()){
            if(temp < smallestTemp) smallestTemp = temp;
        }
        return smallestTemp;
    }

    public int calTempSpreadDy(int dy) {
        return weatherData.getMxT(dy) - weatherData.getMnT(dy);
    }

    public ArrayList<Integer> getSpreadList() {
        if(spreadList.size() > 0) return this.spreadList;
        for(int dy = 1; dy <= 30; ++dy){
            spreadList.add(calTempSpreadDy(dy));
        }
        return spreadList;
    }

    public int getSpreadFromList(int dy){
        int dyIndex = dy - 1;
        return getSpreadList().get(dyIndex);
    }
}

