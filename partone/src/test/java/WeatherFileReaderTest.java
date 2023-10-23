import org.junit.jupiter.api.Test;
import org.w3c.dom.html.HTMLElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherFileReaderTest {
    WeatherFileReader fileReader;
    private void setup(){
        fileReader = new WeatherFileReader();
        fileReader.read();
    }

    @Test
    public void testReadWeatherFile(){
        setup();
        String[] lines = fileReader.getLines();
        assertEquals("  Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP", lines[0]);
        assertEquals(33, lines.length);
        assertEquals(89, lines[0].length());
    }

    @Test
    public void testGetPDirDataFromWeatherData(){
        setup();
        String[] lines = fileReader.getLines();
        WeatherData weatherData = new WeatherData(lines);
        assertEquals("280", weatherData.getPDir("1"));
        assertEquals("110", weatherData.getPDir("4"));
    }
}