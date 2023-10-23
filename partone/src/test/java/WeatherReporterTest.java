import org.junit.jupiter.api.Test;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {
    @Test
    public void testOutputFromWeatherFile(){

    }

    @Test
    public void testReadWeatherFile(){
        WeatherFileReader fileReader = new WeatherFileReader();
        assertEquals("Dy", fileReader.output());
    }
}