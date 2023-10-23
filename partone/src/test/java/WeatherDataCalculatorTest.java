import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataCalculatorTest {
    @Test
    public void testDy1AndDy10TempSpread(){
        WeatherDataCalculator weatherDataCalculator = new WeatherDataCalculator();
        assertEquals(29, weatherDataCalculator.calTempSpreadDy(1));
        assertEquals( 20, weatherDataCalculator.calTempSpreadDy(10));
    }

    @Test
    public void testDy1AndDy10TempSpreadFromSpreadList(){
        WeatherDataCalculator weatherDataCalculator = new WeatherDataCalculator();
        assertEquals(29, weatherDataCalculator.getSpreadFromList(1));
        assertEquals( 20, weatherDataCalculator.getSpreadFromList(10));
    }

    @Test
    public void testGetMxTFromDy(){
        WeatherFileReader fileReader = new WeatherFileReader();
        fileReader.read();
        String[] readLines = fileReader.getLines();
        WeatherData weatherData = new WeatherData(readLines);
        assertEquals(88, weatherData.getMxT(1));
        assertEquals(79, weatherData.getMxT(2));
    }

    @Test
    public void testGetMnTFromDy(){
        WeatherFileReader fileReader = new WeatherFileReader();
        fileReader.read();
        String[] readLines = fileReader.getLines();
        WeatherData weatherData = new WeatherData(readLines);
        assertEquals(59, weatherData.getMnT(1));
        assertEquals(63, weatherData.getMnT(2));
    }

    @Test
    public void testTempSpreadListSize(){
        WeatherDataCalculator calculator = new WeatherDataCalculator();
        ArrayList<Integer> spreadList = calculator.getSpreadList();
        assertEquals(30, spreadList.size());
    }

}
